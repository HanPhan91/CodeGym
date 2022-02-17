package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "First Name not empty")
    @Size(min = 5, max = 45, message = "Min 5 char and max 45 char")
    private String firstName;

    @NotEmpty(message = "Last Name not empty")
    @Size(min = 5, max = 45, message = "Min 5 char and max 45 char")
    private String lastName;

    @NotEmpty(message = "Phone number not empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Format 10 number and begin by 0 number")
    @Column(unique = true)
    private String phoneNumber;

    @Min(value = 18, message = "Min 18 year old")
    private int age;

    @Email(message = "Email invalid")
    @Column(unique = true)
    private String email;

    public User() {
    }

    public User(Long id,
                @NotEmpty @Size(min = 5, max = 45) String firstName,
                @NotEmpty @Size(min = 5, max = 45) String lastName,
                @NotEmpty @Pattern(regexp = "(^$|[0-9]{10})") String phoneNumber,
                @NotEmpty @Min(18) int age,
                @Email String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String firstName = user.getFirstName();
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
        if (firstName.length() < 5 || firstName.length() > 15) {
            errors.rejectValue("firstName", "firstName.length");
        }
//        if (!number.startsWith("0")){
//            errors.rejectValue("number", "number.startsWith");
//        }
//        if (!number.matches("(^$|[0-9]*$)")){
//            errors.rejectValue("number", "number.matches");
//        }
    }
}

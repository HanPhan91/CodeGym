package com.codegym.Management;

import com.codegym.Model.PhoneBook;
import com.codegym.Regex.RegexEmail;
import com.codegym.Regex.RegexPhone;
import com.codegym.Services.Services;

import java.util.List;
import java.util.Scanner;

public class PhoneBookManagement {
    private RegexEmail regexEmail;
    private RegexPhone regexPhone;
    private Services services = new Services();
    Scanner scanner = new Scanner(System.in);

    public void showAll() {
        List<PhoneBook> lists = services.getPhoneBook();
        int i = 0;
        for (PhoneBook phoneBook : lists) {
            System.out.println(phoneBook.toString());
            i++;
            if (i % 5 == 0) {
                System.out.println("Press enter to countineu");
                scanner.nextLine();
            }
        }
    }

    public void addNew() {
        regexPhone = new RegexPhone();
        regexEmail = new RegexEmail();
        try {
            System.out.println("Enter new phone number: ");
            String phone = scanner.nextLine();
            if (regexPhone.validate(phone)) {
                System.out.println("Enter group: ");
                String group = scanner.nextLine();
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter address: ");
                String address = scanner.nextLine();
                System.out.println("Enter day of birthday: ");
                String dob = scanner.nextLine();
                System.out.println("Enter email: ");
                String email = scanner.nextLine();
                if (regexEmail.validate(email)) {
                    services.addNew(phone, group, name, gender, address, dob, email);
                    System.out.println("Done");
                } else
                    System.out.println("Email invalid");
            } else
                System.out.println("Phone number invalid");
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void update() {
        regexEmail = new RegexEmail();
        regexPhone = new RegexPhone();
        try {
            do {
                System.out.println("Enter phone number to update: ");
                String phone = scanner.nextLine();
                if (regexPhone.validate(phone)) {
                    if (!services.isExist(phone))
                        System.out.println("Phone number not found");
                    else {
                        System.out.println("Enter group: ");
                        String group = scanner.nextLine();
                        System.out.println("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter gender: ");
                        String gender = scanner.nextLine();
                        System.out.println("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.println("Enter day of birthday: ");
                        String dob = scanner.nextLine();
                        System.out.println("Enter email: ");
                        String email = scanner.nextLine();
                        if (regexEmail.validate(email)) {
                            services.update(phone, group, name, gender, address, dob, email);
                            break;
                        } else
                            System.out.println("Email invalid");
                    }
                } else
                    System.out.println("Phone invalid");
            } while (true);
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void delete() {
        regexPhone = new RegexPhone();
        try {
            do {
                System.out.println("Enter phone number: ");
                String phone = scanner.nextLine();
                if (phone.equals(""))
                    break;
                if (regexPhone.validate(phone)) {
                    if (services.isExist(phone)) {
                        System.out.println("Press Y to delete");
                        String check = scanner.nextLine();
                        if (check.equalsIgnoreCase("y")) {
                            services.delete(phone);
                            break;
                        }
                    } else
                        System.out.println("Phone number not found");
                } else
                    System.out.println("Phone number invalid");

            } while (true);
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void search() {
        try {
            System.out.println("1. Search by Phone number");
            System.out.println("2. Search by Name");
            System.out.println("3. Exit");
            System.out.println("Enter number 1-3: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number > 0 && number < 3) {
                switch (number) {
                    case 1:
                        searchByPhone();
                        break;
                    case 2:
                        searchByName();
                        break;
                }
            } else if (number > 3)
                System.out.println("Please enter number 1-3");
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void searchByPhone() {
        regexPhone = new RegexPhone();
        try {
            System.out.println("Enter phone number: ");
            String phone = scanner.nextLine();
            if (regexPhone.validate(phone)) {
                if (services.isExist(phone)) {
                    PhoneBook phoneBook = services.getPhone(phone);
                    System.out.println(phoneBook.toString());
                } else
                    System.out.println("Phone number not found");
            } else
                System.out.println("Phone number invalid");
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void searchByName() {
        try {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            if (services.isExistName(name)) {
                PhoneBook phoneBook = services.getPhoneByName(name);
                System.out.println(phoneBook.toString());
            } else
                System.out.println("Name not found");
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void writeFile() {
        services.writeFile();
    }

    public void readFile() {
        List<PhoneBook> lists = services.getPhoneBook();
        for (PhoneBook phoneBook : lists) {
            System.out.println(phoneBook.toString());
        }
    }
}

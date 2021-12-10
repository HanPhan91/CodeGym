package com.codegym.Services;

import com.codegym.Model.PhoneBook;

import java.util.List;

public interface IServices {
    public List<PhoneBook> getPhoneBook();
    public List<PhoneBook> showAll();
    public void addNew(String phone,String group,String name,String gender,String address,String dob,String email);
    public void update(String phone, String group, String name, String gender, String address, String dob, String email);
    public void delete(String phone);
    public boolean isExist(String phone);
    public boolean isExistName(String name);
    public PhoneBook getPhoneByName(String name);
    public PhoneBook getPhone(String phone);
    public void writeFile();

}

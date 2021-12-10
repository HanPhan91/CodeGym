package com.codegym.Services;

import com.codegym.File.ReadFile;
import com.codegym.File.WriteFile;
import com.codegym.Model.PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class Services implements IServices {
    ReadFile readFile = new ReadFile();
    List<PhoneBook> lists = readFile.ReadFile();

    @Override
    public List<PhoneBook> getPhoneBook() {
        return lists;
    }

    @Override
    public List<PhoneBook> showAll() {
        return null;
    }

    @Override
    public void addNew(String phone, String group, String name, String gender, String address, String dob, String email) {
        lists.add(new PhoneBook(phone, group, name, gender, address, dob, email));
    }

    @Override
    public void update(String phone, String group, String name, String gender, String address, String dob, String email) {
        PhoneBook phoneBook = getPhone(phone);
        phoneBook.setGroup(group);
        phoneBook.setName(name);
        phoneBook.setGender(gender);
        phoneBook.setAddress(address);
        phoneBook.setDob(dob);
        phoneBook.setEmail(email);
        System.out.println("Updated");
    }

    @Override
    public void delete(String phone) {
        PhoneBook phoneBook = getPhone(phone);
        List<PhoneBook> remove = new ArrayList<>();
        for (PhoneBook p : lists) {
            if (p.getPhone().equals(phone)) {
                remove.add(p);
                break;
            }
        }
        lists.removeAll(remove);
        System.out.println("Deleted");
    }

    @Override
    public boolean isExist(String phone) {
        return getPhone(phone) != null;
    }

    @Override
    public PhoneBook getPhone(String phone) {
        for (PhoneBook phoneBook : lists) {
            if (phoneBook.getPhone().equals(phone))
                return phoneBook;
        }
        return null;
    }

    @Override
    public boolean isExistName(String name) {
        return getPhoneByName(name) != null;
    }

    @Override
    public PhoneBook getPhoneByName(String name) {
        for (PhoneBook p : lists) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }

    public void writeFile() {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFile(lists);
        System.out.println("Done");
    }

}

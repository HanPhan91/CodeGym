package com.codegym.File;

import com.codegym.Model.PhoneBook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public void writeFile(List<PhoneBook> list) {
        String a = null;
        try {
            FileWriter writer = new FileWriter("data/contacts.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (PhoneBook phoneBook : list) {
                a = String.format("%s,%s,%s,%s,%s,%s,%s,", phoneBook.getPhone(), phoneBook.getGroup(), phoneBook.getName(), phoneBook.getGender(), phoneBook.getAddress(), phoneBook.getDob(), phoneBook.getEmail());
                bufferedWriter.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

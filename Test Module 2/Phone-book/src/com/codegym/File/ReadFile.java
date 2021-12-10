package com.codegym.File;

import com.codegym.Model.PhoneBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    static BufferedReader bufferedReader = null;
    public List<PhoneBook> ReadFile() {
        List<PhoneBook> phoneLists = new ArrayList<>();
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("data\\contacts.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                String data[] = line.split(",");
                String phone = data[0];
                String group = data[1];
                String name = data[2];
                String gender = data[3];
                String address = data[4];
                String dob=data[5];
                String email=data[6];
                phoneLists.add(new PhoneBook(phone,group,name,gender,address,dob,email));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return phoneLists;
    }
}

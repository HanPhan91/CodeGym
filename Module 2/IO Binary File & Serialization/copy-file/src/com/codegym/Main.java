package com.codegym;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);


        try {
            System.out.println("Enter source: ");
            String src= scanner.nextLine();
            FileInputStream fileInputStream= new FileInputStream(src);
            DataInputStream dataInputStream= new DataInputStream(fileInputStream);
            System.out.println("Enter destination: ");
            String des= scanner.nextLine();
            File file= new File(des);
            if (file.exists()){
                System.out.println("Duplicate file des");
            }
            else {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                int count = fileInputStream.available();
                for (int i = 0; i < count; i++) {
                    dataOutputStream.writeByte(dataInputStream.readByte());
                }
                System.out.println("Done");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

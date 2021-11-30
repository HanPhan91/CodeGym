package com.codegym;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter path file: ");
        Scanner scanner=new Scanner(System.in);
        String path= scanner.nextLine();
        readFileText(path);
    }

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum : " + sum);
        } catch (Exception e) {
            System.err.println("File not found");
        }
    }

}

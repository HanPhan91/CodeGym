package com.codegym;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter source path: ");
        File src= new File(scanner.nextLine());
        System.out.println("Enter destination path: ");
        File des= new File(scanner.nextLine());
        try {
            if (!src.exists()){
                throw new FileNotFoundException();
            }
            else
                copyFile(src,des);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void copyFile(File src, File des) throws Exception {
        try {
            Files.copy(src.toPath(),des.toPath());
            System.out.println("Done");
        }
        catch (Exception e){
            throw new Exception(e);
        }
    }
}

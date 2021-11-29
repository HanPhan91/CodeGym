package com.codegym;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader bufferedReader= null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("country.csv"));
            while ((line= bufferedReader.readLine())!= null){
                showData(splitData(line));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> splitData(String line){
        List<String> result= new ArrayList<>();
        if (line!= null){
            String[] data= line.split(",");
            for (int i = 0; i < data.length ; i++) {
                result.add(data[i]);
            }
        }
        return result;
    }
    public static void showData(List<String> country){
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}

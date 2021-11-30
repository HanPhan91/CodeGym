package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File not found or format wrong");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer= new FileWriter(filePath, true);
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            bufferedWriter.write("Number max: " + max);
            bufferedWriter.close();
            System.out.println("Done");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}

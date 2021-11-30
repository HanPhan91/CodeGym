package com.codegym;

import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        ReadandWriteFile readandWriteFile= new ReadandWriteFile();
        List<Integer> numbers= readandWriteFile.readFile("d:/codegym/data/number.txt");
        int maxValue= findMax(numbers);
        readandWriteFile.writeFile("result.txt", maxValue);
    }
    public static int findMax(List<Integer> numbers){
        int max= numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max< numbers.get(i)){
                max= numbers.get(i);
            }
        }
        return max;
    }
}

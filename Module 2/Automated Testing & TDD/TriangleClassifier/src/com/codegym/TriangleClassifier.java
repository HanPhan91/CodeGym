package com.codegym;

import java.util.Arrays;

public class TriangleClassifier {
    public static String typeTriangle(int sideA, int sideB, int sideC){
        final String result_tgCan= "tam giac can";
        final String result_tgDeu= "tam giac deu";
        final String result_tgThuong= "tam giac thuong";
        final String result_isNot= "khong phai tam giac";
        int[] side= {sideA,sideB,sideC};
        if (checkTriangle(side)){
            if (checkTgDeu(sideA,sideB,sideC))
                return result_tgDeu;
            else if (checkTgCan(sideA,sideB,sideC))
                return result_tgCan;
            else return result_tgThuong;
        }
        return result_isNot;
    }
    public static Boolean checkTriangle(int[] array){
        Arrays.sort(array);
        int sum= array[0]+ array[1];
        return array[2] < sum;
    }
    public static Boolean checkTgDeu(int sideA, int sideB, int sideC){
        return (sideA == sideB) && (sideA == sideC);
    }
    public static Boolean checkTgCan(int sideA, int sideB, int sideC){
        if ((sideA != sideB) && (sideA != sideC)){
            if (sideB != sideC)
                return false;
        }
        return true;
    }
}

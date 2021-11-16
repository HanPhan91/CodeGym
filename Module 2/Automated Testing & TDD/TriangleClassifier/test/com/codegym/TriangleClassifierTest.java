package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void test2And2And2(){
        int sideA= 2;
        int sideB= 2;
        int sideC= 2;
        String expected= "tam giac deu";
        String result= TriangleClassifier.typeTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }
    @Test
    void test2And2And3(){
        int sideA= 2;
        int sideB= 2;
        int sideC= 3;
        String expected= "tam giac can";
        String result= TriangleClassifier.typeTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }
    @Test
    void test3And4And5(){
        int sideA= 3;
        int sideB= 4;
        int sideC= 5;
        String expected= "tam giac thuong";
        String result= TriangleClassifier.typeTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }
    @Test
    void test8And2And3(){
        int sideA= 8;
        int sideB= 2;
        int sideC= 3;
        String expected= "khong phai tam giac";
        String result= TriangleClassifier.typeTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }
    @Test
    void test1And2And1(){
        int sideA= -1;
        int sideB= 2;
        int sideC= 1;
        String expected= "khong phai tam giac";
        String result= TriangleClassifier.typeTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }
    @Test
    void test0And1And1(){
        int sideA= 0;
        int sideB= 1;
        int sideC= 1;
        String expected= "khong phai tam giac";
        String result= TriangleClassifier.typeTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }
}
package com.dictionary.controllers;

import java.util.HashMap;
import java.util.Map;

public class DictionaryModel {
    public static Map<String, String> dicMap() {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "xin chào");
        dic.put("thank you", "cám ơn");
        dic.put("good bye", "tạm biệt");
        dic.put("help", "giúp đỡ");
        return dic;
    }
}

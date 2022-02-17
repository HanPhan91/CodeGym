package com.codegym.services;

import com.codegym.model.Setting;

import java.util.Set;

public class Services {
    private static Setting setting;

    static {
        setting= new Setting("English", 5, false, "Thor");
    }
    public static Setting getSetting(){
        return setting;
    }
    public static Setting changeSetting(Setting newSetting){
        setting.setLanguage(newSetting.getLanguage());
        setting.setPageSize(newSetting.getPageSize());
        setting.setSpamFilter(newSetting.isSpamFilter());
        setting.setSign(newSetting.getSign());
        return setting;
    }

}

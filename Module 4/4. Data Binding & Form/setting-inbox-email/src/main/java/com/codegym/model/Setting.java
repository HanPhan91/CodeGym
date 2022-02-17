package com.codegym.model;

public class Setting {
    private String language;
    private int pageSize;
    private boolean spamFilter;
    private String sign;

    public Setting() {
    }

    public Setting(String language, int pageSize, boolean spamFilter, String sign) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.sign = sign;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}

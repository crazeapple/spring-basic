package com.ggli.aop.model;

/**
 * Created by ggli on 2016/8/23.
 */
public class Tutorial {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Tutorial name: " + this.name);
    }

    public void printUrl() {
        System.out.println("Tutorial url: " + this.url);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }
}

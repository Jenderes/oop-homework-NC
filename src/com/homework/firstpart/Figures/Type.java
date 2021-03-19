package com.homework.firstpart.Figures;

public enum  Type {
    EQUILATERAL("Equilateral"),
    ISOSCELES("Isosceles"),
    SCALENE("Scalene");

    private final String title;

    Type(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

}

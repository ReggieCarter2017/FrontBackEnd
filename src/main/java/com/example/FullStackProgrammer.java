package com.example;

public class FullStackProgrammer implements BackEndProgramming, FrontEndProgramming {
    //JavaFX vs Swing
    @Override
    public void writeFrontEndCode() {
        System.out.println("Coding frontend stuff");
    }

    @Override
    public void writeBackEndCode() {
        System.out.println("Coding backend stuff");
    }

}
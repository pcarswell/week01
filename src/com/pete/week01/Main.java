package com.pete.week01;

public class Main {

    public static void main(String[] args) {

        String city = "Columbus";
        int zipCode = 43215;
        int[] highTemps = {32, 25, 29, 41, 45};
        int summed = 0;
        double average = 0;

        System.out.println(city);
        System.out.println(zipCode);

        summed += highTemps[0];
        summed += highTemps[1];
        summed += highTemps[2];
        summed += highTemps[3];
        summed += highTemps[4];

        System.out.println(summed/5.0);
    }
}

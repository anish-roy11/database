package com.example.test.randomNumberGenerator.dao;

public class RandomNumberParameters {
    int noOfRandomNumbers;
    int seed;
    int m;
    int a;
    int b;

    public RandomNumberParameters(int noOfRandomNumbers, int seed, int m, int a, int b) {
        this.noOfRandomNumbers = noOfRandomNumbers;
        this.seed = seed;
        this.m = m;
        this.a = a;
        this.b = b;
    }

    public RandomNumberParameters() {
    }

    public int getNoOfRandomNumbers() {
        return noOfRandomNumbers;
    }

    public void setNoOfRandomNumbers(int noOfRandomNumbers) {
        this.noOfRandomNumbers = noOfRandomNumbers;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "RandomNumberParameters{" +
                "noOfRandomNumbers=" + noOfRandomNumbers +
                ", seed=" + seed +
                ", m=" + m +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}



package com.example.test.miscellaneous.service.threads;

public class ThreadService {

    public String threadDemo() throws InterruptedException {
        B b1 = new B();
        return b1.threadDemo();
    }

}

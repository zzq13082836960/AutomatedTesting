package com.course.testng.mutliThread;

import org.testng.annotations.Test;

public class MutliThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 6)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}

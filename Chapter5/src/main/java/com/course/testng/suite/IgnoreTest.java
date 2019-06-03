package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignoreTest1(){
        System.out.println("ignoreTest1执行");
    }
    //测试方法忽略掉，暂时不执行
    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignoreTest2执行");
    }
    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("ignoreTest3执行");
    }
}

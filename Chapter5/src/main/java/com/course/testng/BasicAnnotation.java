package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void TestCase1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public void TestCase2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass这是在测试类之前运行的");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在测试类之后运行的");
    }
    //测试套件包含多个类
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite这是测试套件");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite这是测试套件");
    }

}

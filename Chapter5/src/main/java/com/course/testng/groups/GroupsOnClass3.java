package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3{
    public void teacher1(){
        System.out.println("这是教师11测试方法GroupsOnClass3");
    }
    public void teacher2(){
        System.out.println("这是教师2测试方法GroupsOnClass3");
    }
}
package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void student1(){
        System.out.println("这是学生1测试方法GroupsOnClass1");
    }
    public void student2(){
        System.out.println("这是学生2测试方法GroupsOnClass1");
    }
}

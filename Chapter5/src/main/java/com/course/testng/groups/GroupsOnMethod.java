package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试1");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试2");
    }
    @BeforeGroups("server")
    public void BeforeGroupOnSever(){
        System.out.println("这是服务端之前运行的方法");
    }
    @AfterGroups("server")
    public void AfterGroupOnServer(){
        System.out.println("这是服务端之后运行的方法");
    }
    @BeforeGroups("client")
    public void BeforeGroupOnClient(){
        System.out.println("这是客户端之前运行的方法");
    }
    @AfterGroups("client")
    public void AfterGroupOnClient(){
        System.out.println("这是客户端之后运行的方法");
    }
}
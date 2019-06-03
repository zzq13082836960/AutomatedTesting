package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name =" + name +"; age =" + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",23},
                {"lisi",28},
                {"wangwu",90}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1111 name =" + name +"; age =" + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2222 name =" + name +"; age =" + age);
    }

    //通过方法名来判断，将参数传给指定的方法
    @DataProvider(name="methodData")
    public Object[][] MethodData(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhansan",98},
                    {"lisi",88}
            };
        }
        else if(method.getName().equals("test2")){
            result =new Object[][]{
                    {"wanger",22},
                    {"wangsan",45}
            };
        }
        return result;
    }
}
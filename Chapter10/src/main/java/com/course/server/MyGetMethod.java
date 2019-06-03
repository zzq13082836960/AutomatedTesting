package com.course.server;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@RestController
@Api(value = "/",tags = {"all my test methods"})
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获得cookies信息",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){

        //HttpServletResponse  装响应信息的类
        //HttpServletRequest  装请求信息的类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜你获得cookies信息成功";
    }
    @RequestMapping(value = "get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "必须携带cookies信息来",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "你必须携带cookies信息来";
        }
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "这是一个需要携带cookies信息才能访问的get请求";
            }
        }
        return "你必须携带cookies信息来";
    }

    /**
     * 开发需要一个需要携带参数才能访问的get请求
     * 第一种实现方式url : key=value&key=value
     * 我们来模拟获取商品列表
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "访问列表",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,@RequestParam Integer end){
        Map<String,Integer> MyList = new HashMap<>();
        MyList.put("鞋",400);
        MyList.put("干脆面",1);
        MyList.put("寸衫",100);
        MyList.put("外套",200);
        return MyList;

    }
}

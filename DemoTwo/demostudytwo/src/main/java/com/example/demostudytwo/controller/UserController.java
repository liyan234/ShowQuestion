package com.example.demostudytwo.controller;

import com.example.demostudytwo.model.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

//可以实例化多个对象 当前类注册到实列容器中，并指定为web请求
@Controller//做web请求的处理类

//用在类和方法上
@RequestMapping("/user") //路径
public class UserController {

   // @Resource
    @Autowired
    Map<String, String> test1;

    @RequestMapping("/login")
    @ResponseBody//返回的啥请求格式 这个jason的格式
    public Object login() {
        return test1;
    }

    //Autowired 先根据名称来查找，若是没有找到就会根据类型来查找，若是有多个这一类型的，就会报错。
    @Autowired
    @Qualifier("user1")//辅助查找这个名称
    private User user;

    @RequestMapping("/loginTwo")
    @ResponseBody
    public User loginTwo() {
        return user;
    }

    //加上这个括号里的就会辅助查找bean容器中这个名称中的对象
    @Resource(name = "user2")
    User user2;

    @RequestMapping("/loginThree")
    @ResponseBody// 返回的是一个js格式
    public User loginThree() {
        return user2;
    }

    //返回的是一个静态资源类
    @RequestMapping("/m")
    public String m() {
        return "/main.html";//转发
    }


    //转发
    @RequestMapping("/l1")
    public String l1() {
        //返回路径，不带/： 以当前请求路径为相对位置 ，查找到同一级资源
        //返回路径， 带/：会去掉这个当前路径，以项目的部署路径为相对位置
        return "forward:login"; //以当前请求路径/user/l1，转发到/user
        //return "forward:/user/login";//以项目路径查找/login
    }

    //重定向
    @RequestMapping("/l2")
    public String l2() {
        return "redirect:/user/login";
    }

    //rest请求方式
    //在路径中使用占位符
    @RequestMapping("/test/{key}")
    @ResponseBody
    public Object test1(@PathVariable("key") String k)  {
        System.out.println("========" + test1.get(k));
        return test1;
    }

    //请求在url内
    //请求get /user/test2?k1=v1&k2=v2&k3=v3
    //                              方法为get method = RequestMethod.GET
    //v3是变量                        方法为post method = RequestMethod.POST
    @RequestMapping(value = "test2", method = {RequestMethod.GET,
            RequestMethod.POST})//两个方法都支持
    @ResponseBody
    public Object test2(@RequestParam("k1") String k1,//写全
                        @RequestParam String k2,//省略注解
                        String k3) {//最省略的
        System.out.println("========" + k1 +"," + k2 + " ," + k3);
        return test1;
    }

    @RequestMapping("/test3")
    @ResponseBody
    protected Object test3(User user) {//请求数据自动映射到参数类型的属性中，name=xx&age=xx
        System.out.println(user);
        return test1;
    }

    //@RequestParam 定义的参数类型，可以是基础数据类型，包装类型，自定义类型，
    //都可以有多个参数。自定义类型是通过请求数据的key映射到字段中去的。

    @RequestMapping("/test4")
    @ResponseBody
    public String test4() {
        return "ok";
        //返回字符串内容text/plain，而不是js
    }

    //自动包装成响应体
    @RequestMapping("/test5")
    @ResponseBody
    //http请求是基于Servlet的，Spring已经生成了request和response对象，可以直接在参数中使用
    public Object test5(HttpServletRequest request, HttpServletResponse response) {
        //Spring自动注入参数
        String ret = request.getParameter("name");
        return ret;
    }

    //解析js传过来的数据,并且是放在请求体内
    @RequestMapping("test6")
    @ResponseBody
    public Object test6(@RequestBody User user) {
        return null;
    }
}

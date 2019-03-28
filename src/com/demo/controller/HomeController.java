package com.demo.controller;


import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

//    private User user;
//
//    @Autowired
//    public HomeController(User user){}
    /**
     * 映射到home.jsp页面
     * @return
     */
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){

        System.out.println("到达控制器。。。");
        return "home";
    }

    /**
     * 传递模型数据到视图
     * @param model
     * @return
     */
    @RequestMapping(value = "/test1")
    public String  test1(Model model){
        model.addAttribute("name","linyijie");
        model.addAttribute("age","25");
        return "test1";
    }

    /**
     * 接收查询参数
     *  ?number=2133
     * @param number
     */
    @RequestMapping(value = "/test2")
    @ResponseBody
    public String test2(@RequestParam("number") long number){
        System.out.println("number:"+number);
        return "number的值为："+number;
    }

    /**
     * 接收路径参数
     *  /test3/3423
     * @param number
     */
    @RequestMapping(value = "/test3/{number}")
    @ResponseBody
    public String test3(@PathVariable long number){
        System.out.println("number:"+number);
        return "number的值为："+number;
    }

    /**
     * 使用对象接收表单
     * @param
     */
    @RequestMapping(value = "/form",method = RequestMethod.POST)
    @ResponseBody
    public String test4(@Valid User user, Errors errors){

        if(errors.hasErrors()){
            return "数据不符";
        }
        System.out.println(user.toString());
        return user.toString();
    }
}

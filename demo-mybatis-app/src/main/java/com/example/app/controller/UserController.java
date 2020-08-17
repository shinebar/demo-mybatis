package com.example.app.controller;

import com.example.UserService;
import com.example.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/all")
    public List select(){
        //处理get请求，获取用户列表
        return userService.select();
    }


    @RequestMapping("/insertParam")
    public List<User> insert(User user, HttpServletRequest request){
        userService.insert(user);
        return userService.selectByName(user.getName());
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable Long id){
        //处理“/user/{id}”的get请求，获取url中id值的user信息
        //url的id通过PathVariable绑定到函数参数中
        userService.delete(id);
        return "index";
    }


    @RequestMapping("/updateParam")
    public List<User> update(User user, HttpServletRequest request){
        userService.update(user);
        return userService.selectByName(user.getName());
    }


    @RequestMapping("/verify")
    public User verify(User user, HttpServletRequest request){
        user.setName(request.getParameter("UserId"));
        user.setPwd(request.getParameter("password"));
            return userService.verify(user);
    }

}

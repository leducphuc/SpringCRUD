/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Student;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author hoang
 */
@Controller
@RequestMapping("/user_form")
public class UserFormController {
    private ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    private UserJDBCTemplate userJDBCTemplate = (UserJDBCTemplate) context.getBean("userJDBCTemplate");
    

    @RequestMapping(value="/create",method=RequestMethod.GET)
    public String dangky(@ModelAttribute(value="user")User user,ModelMap mm){
        mm.addAttribute("user", new User());
        return "create";
    }
    @RequestMapping(value="/info",method=RequestMethod.GET)
    public String info(ModelMap mm){
        List<User> list = userJDBCTemplate.listUser();
        mm.put("list", list);
        return "info";
    }
    @RequestMapping(value="/addProcess",method=RequestMethod.POST)
    public String addProcess(@ModelAttribute(value="user")User user,ModelMap mm){
        userJDBCTemplate.createUser(user);
        mm.put("user",user);
        return "redirect:./info";
    }
    
    @RequestMapping(value = "/editUser/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable(value="id") String id, @ModelAttribute(value = "user") User user, ModelMap mm){
        user = userJDBCTemplate.getUser(Integer.parseInt(id));
        mm.put("user", user);
        return "editUser";
    }
    @RequestMapping(value="/updateUser",method=RequestMethod.POST)
    public String update(@ModelAttribute(value = "user") User user, ModelMap mm){
        userJDBCTemplate.update(user);

        mm.put("user", user);
        return "redirect:info.html";
    }
    
    @RequestMapping(value="/check",method=RequestMethod.POST)
    public String check(@ModelAttribute(value="user")User user,ModelMap mm){
        if (userJDBCTemplate.checkLogin(user)){
            mm.put("user",user);
            return "redirect:info.html";
        }else{
            return "create";}
    }
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(@ModelAttribute(value="user")User user,ModelMap mm){
        mm.addAttribute("user", user);
        return "login";
    }
}

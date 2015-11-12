/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.Student;
import java.util.*;

/**
 *
 * @author hoang
 */
@Controller
@RequestMapping(value="/student")
public class StudentDAO {
    @RequestMapping(value="/delete",method=RequestMethod.GET)
    public String delete(){
        
        return "delete";
    }
    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(){
        return "add";
    }
    @RequestMapping(value="/edit",method=RequestMethod.GET)
    public String edit(){
        return "edit";
    }
    @RequestMapping(value="/update",method=RequestMethod.POST)
    public String update(){
        return "update";
    }

}

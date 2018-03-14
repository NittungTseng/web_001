
package com.cn.eddy.controller;

import com.cn.eddy.pojo.UnlockUser;
import com.cn.eddy.service.UnlockUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * Created By Eddy on ${Date}
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UnlockUserService unlockUserService;

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public String toIndex(HttpServletRequest request, Model model){
        Long id = Long.parseLong(request.getParameter("id"));
        UnlockUser unlockUser = this.unlockUserService.getUserById(id);
        model.addAttribute("user",unlockUser);
        return "showUser";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloTest(){
        return "hello";
    }
}


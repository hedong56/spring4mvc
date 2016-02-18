package com.accdays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accdays.dto.UserDto;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/save")
	public String saveUser(UserDto userDto,Model model){
		model.addAttribute("userDto", userDto);
		//user是用户模块文件夹
		return "user/saveUser";
//		return "saveUser";
	}

}

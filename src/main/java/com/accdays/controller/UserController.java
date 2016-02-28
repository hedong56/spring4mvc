package com.accdays.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accdays.dto.UserDto;
import com.accdays.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService serService;
	
	@RequestMapping("/save")
	public String saveUser(UserDto userDto,Model model){
		model.addAttribute("userDto", userDto);
		//user是用户模块文件夹
		return "user/saveUser";
//		return "saveUser";
	}
	
	@RequestMapping("/query")
	public String queryUser(long id,Model model){
		UserDto userDto=serService.queryUser(id);
		model.addAttribute("userDto", userDto);
		//user是用户模块文件夹
		return "user/queryUser";
//		return "saveUser";
	}

}

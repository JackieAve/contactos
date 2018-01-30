package com.its.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.its.dto.DepartDto;
import com.its.dto.RolDto;
import com.its.dto.UserDto;
import com.its.entities.Depart;
import com.its.entities.Rol;
import com.its.entities.User;
import com.its.service.DepartService;
import com.its.service.RolService;
import com.its.service.UserService;

@Controller
@RequestMapping(value="hibernate")
public class ContactosController {
	
	@Autowired
	private RolService rolService;
	
	@Autowired
	private DepartService departService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/contactos")
    public ModelAndView contactos() {
        ModelAndView model = new ModelAndView("contactos");
        return model;
    }
	
	@RequestMapping(value="/listRol", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAllRol(Rol roles){
		Map<String,Object> map = new HashMap<String,Object>();
	
			List<RolDto> list = rolService.list();
			
			
			if (list != null){
				map.put("status","200");
				map.put("message","Data found");
				map.put("data", list);
			}else{
				map.put("status","404");
				map.put("message","Data not found");
				
			}
				
		
		return map;
	}
	
	@RequestMapping(value="/listDept", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAllDept(Depart departs){
		Map<String,Object> map = new HashMap<String,Object>();
	
			List<DepartDto> list = departService.list();
			
			if (list != null){
				map.put("status","200");
				map.put("message","Data found");
				map.put("data", list);
			}else{
				map.put("status","404");
				map.put("message","Data not found");
				
			}
			
		
		return map;
	}
	
	@RequestMapping(value="/listUser", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAllUsers(User users){
		Map<String,Object> map = new HashMap<String,Object>();
	
			List<UserDto> list = userService.list();
			
			if (list != null){
				map.put("status","200");
				map.put("message","Data found");
				map.put("data", list);
			}else{
				map.put("status","404");
				map.put("message","Data not found");
			}
		return map;
	}
}

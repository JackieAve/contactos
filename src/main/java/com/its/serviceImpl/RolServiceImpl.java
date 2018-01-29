package com.its.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.its.dao.RolDao;
import com.its.dto.RolDto;
import com.its.entities.Rol;
import com.its.service.RolService;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	private RolDao rolDao;
	
	public List<RolDto> list() {
		List<Rol> dataBase = rolDao.list();
		List<RolDto> roles =  new ArrayList<>();
		for (Rol rol : dataBase) {
			roles.add(new RolDto(rol.getRolId(),rol.getNbRol()));
		}
		return roles;
	}

}

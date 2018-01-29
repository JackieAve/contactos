package com.its.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.its.dao.UserDao;
import com.its.dto.UserDto;
import com.its.entities.Depart;
import com.its.entities.Ref;
import com.its.entities.Rol;
import com.its.entities.User;
import com.its.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<UserDto> list() {
		List<User> lisData = userDao.list();
		List<UserDto> data = new ArrayList<>();
		UserDto dato;
		for (User user : lisData) {
			dato = new UserDto();
			dato.setUserId(user.getUserId());
			dato.setName(user.getName());
			dato.setLastname1(user.getLastname1());
			dato.setLastname2(user.getLastname2());
			dato.setEstatus(user.getEstatus());
			
			if(user.getDeparts().size() > 0) {
				for(Depart d: user.getDeparts())
				{
					dato.setDepartamento(d.getNbdepart());
					dato.setExtencion(d.getExt());
				}
			}
			
			if(user.getRefs().size() > 0){
				for(Ref r: user.getRefs())
				{
					dato.setDireccion(r.getDireccion());
					dato.setCelular(r.getCelular());
				}
			}
			
			if(user.getRols().size() > 0) {
				for(Rol rol: user.getRols()) {
					dato.setTipoUsuario(rol.getNbRol());
				}
				
				
			}
			
			data.add(dato);
		}
		
		
		return data;
	}

}

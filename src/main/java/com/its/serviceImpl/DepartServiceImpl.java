package com.its.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.its.dao.DepartDao;
import com.its.dto.DepartDto;
import com.its.entities.Depart;
import com.its.service.DepartService;

@Service
public class DepartServiceImpl implements DepartService{

	@Autowired
	DepartDao departDao;
	
	@Override
	public List<DepartDto> list() {
		
		List<Depart> database = departDao.list();
		List<DepartDto> listDep = new ArrayList<>();
		for (Depart depar : database) {
			listDep.add(new DepartDto(depar.getDeptId(),depar.getNbdepart()));
		}
		
		return listDep;
	}

}

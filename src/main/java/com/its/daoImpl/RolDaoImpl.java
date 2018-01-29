package com.its.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.its.dao.RolDao;
import com.its.entities.Rol;

public class RolDaoImpl implements RolDao {

	private SessionFactory sessionFactory;

	public RolDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Rol> list() {
		@SuppressWarnings("unchecked")
		List<Rol> listRol = (List<Rol>) sessionFactory.getCurrentSession()
		.createCriteria(Rol.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		System.out.println("------------------------> " + listRol);
		return listRol;
	}

}

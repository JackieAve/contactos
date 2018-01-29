package com.its.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.its.dao.DepartDao;
import com.its.entities.Depart;

public class DepartDaoImpl implements DepartDao{

	private SessionFactory sessionFactory;

	public DepartDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public List<Depart> list() {
		@SuppressWarnings("unchecked")
		List<Depart> listDept = (List<Depart>) sessionFactory.getCurrentSession()
				.createCriteria(Depart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		System.out.println("------------------------> " + listDept);
		return listDept;
	}
	
}

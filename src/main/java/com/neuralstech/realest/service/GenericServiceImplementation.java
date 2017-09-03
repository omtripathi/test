package com.neuralstech.realest.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuralstech.realest.dao.IGenericDao;

@Service
public class GenericServiceImplementation<T> implements IGenericService<T>{

	@Autowired
	private IGenericDao<T> genericDao;
	
	@Transactional
	@Override
	public void add(T entity) {
		genericDao.add(entity);
	}

}

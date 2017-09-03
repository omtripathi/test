package com.neuralstech.realest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuralstech.realest.dao.IGenericDao;

@Service
public class GenericServiceImplementation<T> implements IGenericService<T>{

	@Autowired
	private IGenericDao<T> genericDao;
	
	@Override
	public void add(T entity) {
		genericDao.add(entity);
	}

}

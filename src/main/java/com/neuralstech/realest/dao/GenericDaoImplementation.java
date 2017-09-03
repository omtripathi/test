package com.neuralstech.realest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class GenericDaoImplementation<T> implements IGenericDao<T> {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void add(T entity) {
		entityManager.persist(entity);
	}

}

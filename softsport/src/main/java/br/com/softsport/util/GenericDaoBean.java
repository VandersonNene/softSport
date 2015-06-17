package br.com.softsport.util;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SuppressWarnings("serial")
public class GenericDaoBean implements Serializable {
	private EntityManager entityManager;
	
	public GenericDaoBean() {
		
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext(unitName="softsport")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}

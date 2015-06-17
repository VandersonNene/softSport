package br.com.softsport.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("softsport");
	
	private static EntityManager em;
	
	public static final EntityManager getEntityManager() {
		em = emf.createEntityManager();
		return em;
	}
}

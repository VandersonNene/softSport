package br.com.softsport.controller;

import javax.persistence.EntityManager;

import br.com.softsport.util.JPAUtil;

public class Autenticacao {
	private static EntityManager em = JPAUtil.getEntityManager();
	
	public String getNome() {
		em.clear();
		return "Vanderson J de Araújo!!!";
	}
}

package br.com.softsport.bean;

import br.com.softsport.controller.Autenticacao;

public class MBAutenticacao {
	private String usuario;
	private Autenticacao autenticacao;

	public String getUsuario() {
		autenticacao = new Autenticacao();
		if(usuario == null) {
			return autenticacao.getNome();
		}
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}

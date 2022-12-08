package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {

	/* Classe para montagem do email de forma estática */
	
	// vai retornar um email estatico para o administrador.
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		return new Email(destinatario, assunto, texto.toString());
	}
}

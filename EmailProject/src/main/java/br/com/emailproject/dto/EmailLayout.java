package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {

	/* Classe para montagem do email de forma estática */
	
	private static final String QUEBRA_LINHA_DUPLA = "<br><br>";
	private static final String QUEBRA_LINHA_SIMPLES = "<br>";
	
	// vai retornar um email estatico para o administrador.
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
		.append("A/C Administrador")
		.append(QUEBRA_LINHA_DUPLA);
		
		texto
		.append("Testando email enviado para administrador!")
		.append(QUEBRA_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodaPe(texto);
		
		return new Email(destinatario, assunto, texto.toString());
	}
	
	// vai retornar um email estatico para o secretario.
		public Email montarEmailSecretario(String destinatario, String assunto) {
			
			StringBuilder texto = new StringBuilder();
			
			texto
			.append("A/C Secretário")
			.append(QUEBRA_LINHA_DUPLA);
			
			texto
			.append("Testando email enviado para Secretario!")
			.append(QUEBRA_LINHA_DUPLA);
			
			gerarAssinatura(texto);
			
			gerarRodaPe(texto);
			
			return new Email(destinatario, assunto, texto.toString());
		}
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("Att.:")
				.append(QUEBRA_LINHA_SIMPLES)
				.append("Operador de Caixa")
				.append(QUEBRA_LINHA_DUPLA)
				.toString();
	}

	private String gerarRodaPe(StringBuilder texto) {
		return texto.append("Email automático favor não responder esse email").toString();
	}
}

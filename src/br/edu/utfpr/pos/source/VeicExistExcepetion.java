package br.edu.utfpr.pos.source;
/**
 * @author Edilson do Nascmento 
 */

public class VeicExistExcepetion extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VeicExistExcepetion(String tipoVeiculo) {
		System.out.println("Ve�culo de " + tipoVeiculo + " j� cadastrado!");		
	}
	
	@Override
	public String getMessage() {
		return "Escolha uma nova op��o do Menu";
	}

}

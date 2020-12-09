package br.edu.utfpr.pos.source;
/**
 * @author Edilson do Nascimento
 */

public class VelocException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VelocException(Veiculo veiculo) {
		System.out.println("\n A velocidade m�xima est� fora dos limites brasileiros:  " + veiculo.getPlaca());		
	}
	

}

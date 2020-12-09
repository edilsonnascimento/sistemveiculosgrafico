package br.edu.utfpr.pos.source;
/**
 * @author Edilson do Nascmento
 *
 */
public class Motor {

	private int qtdPistoes;
	private int potencia;

	public Motor(int qtdPistoes, int potencia) {
		this.qtdPistoes = qtdPistoes;
		this.potencia = potencia;
	}

	public int getQtdPistoes() {
		return qtdPistoes;
	}

	public void setQtdPistoes(int qtdPistoes) {
		this.qtdPistoes = qtdPistoes;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "       * Motor   : Quantida de Pist�es=" + this.getQtdPistoes() + ", Pot�ncia=" + this.getPotencia() +";";
	}

}

package br.edu.utfpr.pos.source;

import java.math.BigDecimal;

/**
 * @author Edilson do Nascmento
 *
 */
public abstract class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdRodas;
	private int velocMax;
	private Motor motor;

	public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int qtdPistoes,
			int potencia){
		this.setPlaca(placa);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setCor(cor);
		this.setQtdRodas(qtdRodas);
		this.setMotor(new Motor(qtdPistoes, potencia));
	}

	public String getPlaca() {
		return placa;
	}

	public final void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public final void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public final void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public final void setVelocMax(int velocMax) throws VelocException {
		if( (velocMax < 80) || (velocMax > 110) ) {
			throw new VelocException(this);
		}else {
			this.velocMax = velocMax;
		}
	}

	public Motor getMotor() {
		return motor;
	}

	public final void setMotor(Motor motor) {
		this.motor = motor;
	}

	public abstract BigDecimal calcVel(double velocMax);

	@Override
	public String toString() {	
		return "\n       * Identifica��o: placa=" + this.getPlaca() + ", Marca=" + this.getMarca() + ", Modelo=" + this.getModelo() + 
				", Cor=" + this.getCor() + ", Quantidade-Rodas=" + this.getQtdRodas() + ";\n" +
		        this.getMotor();		       
	}	
}

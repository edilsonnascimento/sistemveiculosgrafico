package br.edu.utfpr.pos.source;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Edilson do Nascmento
 *
 */
public class BDVeiculos {

	private List<Passeio> carrosPasseio;
	private List<Carga> carrosCarga;
	
	public BDVeiculos() {
		this.carrosPasseio = new ArrayList<Passeio>();
		this.carrosCarga = new ArrayList<Carga>();
	}

	public void inicializaListaPasseio() {
		Passeio camaro      = new Passeio("AXU456", "Chevrolet", "ZT", "preta",    4, 100, 8, 800, 5);
		Passeio corsa       = new Passeio("TOI056", "Chevrolet", "GH", "vermelho", 4, 110, 4, 110, 5);
		Passeio opala       = new Passeio("LOH086", "Chevrolet", "LK", "bordo",    4, 100, 8, 110, 5);
		Passeio mustang     = new Passeio("LTLW90", "Ford",      "TW", "verde",    4,  95, 8, 110, 5);
		Passeio golf        = new Passeio("VBG768", "Volkswagen","PL", "fuxia",    4,  90, 4, 110, 5);			
		
		carrosPasseio.add(camaro);
		carrosPasseio.add(corsa);
		carrosPasseio.add(opala);
		carrosPasseio.add(mustang);
		carrosPasseio.add(golf);

	}
	
	public List<Carga> inicializaListaCarga() {

		Carga volvoFH540       = new Carga("ABSSE", "Volvo",     "FH540",       "azul",     12, 80, 8,1800, 1500, 16000);
		Carga scaniaR450       = new Carga("HGI056", "Scania",   "R450",        "vermelho", 16, 380,  4, 1850, 1500, 16000);
		Carga mercedes         = new Carga("RSH086", "Mercedes", "Actros 2651", "bordo",    14, 85,  8, 1905, 1500, 16000);
		Carga dafXf            = new Carga("MNLW90", "Daf",      "XF 105 510",  "preta",    12, 83,  8, 1100, 1500, 16000);
		Carga teslaTSLA        = new Carga("WSG768", "tesla",    "Semi",        "chumbo",   12, 81,  4, 1020, 1500, 16000);
		
		carrosCarga.add(volvoFH540);
		carrosCarga.add(scaniaR450);
		carrosCarga.add(mercedes);
		carrosCarga.add(dafXf);
		carrosCarga.add(teslaTSLA);
		
		return carrosCarga;
	}

	public void mostrarTodosVeiculosPasseio() {
		carrosPasseio.stream().forEach(System.out::println);
	}
	
	public void mostrarTodosVeiculosCarga() {
		carrosCarga.stream().forEach(System.out::println);
	}

	public void mostraVeiculoPassioPlaca(String placa) {

		Optional<Passeio> carro = carrosPasseio.stream()
					.filter(veiculo -> veiculo.getPlaca().equals(placa))
					.findFirst();
		if(carro.isPresent()) {
			System.out.println(carro.get().toString() + ";\n       * Cálculo:  " + carro.get().calcular() + ".\n");
		}else System.out.println("Não foi encontra veículo com essa placa..BDVeiculos.");

	}

	public Passeio buscaVeiculoPassioPlaca(String placa) {

		Optional<Passeio> carro = carrosPasseio.stream()
				.filter(veiculo -> veiculo.getPlaca().equals(placa))
				.findFirst();
		if(carro.isPresent()) {
			return carro.get();
		}else return null;
	}

	public Carga buscaVeiculoCargaPlaca(String placa) {

		Optional<Carga> carro = carrosCarga.stream()
				.filter(veiculo -> veiculo.getPlaca().equals(placa))
				.findFirst();
		if(carro.isPresent()) {
			return carro.get();
		}else return null;
	}


	public void mostraVeiculoCargaPlaca(String placa) {
			Optional<Carga> carro = carrosCarga.stream()
					.filter(veiculo -> veiculo.getPlaca().equals(placa))
					.findFirst();
			if(carro.isPresent()) {
				System.out.println(carro.get().toString() + ";\n       * Cálculo:  " + carro.get().calcular() + ".\n");
			}else System.out.println("Não foi encontra veículo com essa placa no BDVeiculos.");
	}

	public boolean veiculoExisteListaPasseio(String placa) {		
		return carrosPasseio.stream()		
		                    .anyMatch(listaCarros -> listaCarros.getPlaca().equals(placa));		
	}

	public boolean veiculoExisteListaCarga(String placa) {		
		return carrosCarga.stream()		
		                    .anyMatch(listaCarros -> listaCarros.getPlaca().equals(placa));		
	}
	public void adicionaVeiculo(Passeio veiculoPasseio) {		
		carrosPasseio.add(veiculoPasseio);		
	}
	
	public void adicionaVeiculo(Carga veiculoCarga) {
		carrosCarga.add(veiculoCarga);		
	}

	
	public void excluirCargaPlaca(String placa) {
		Optional<Carga> carro = carrosCarga.stream()
				.filter(veiculo -> veiculo.getPlaca().equals(placa))
				.findFirst();
		if(carro.isPresent()) {
			System.out.println(carro.get().toString() + ";\n       * Cálculo:  " + carro.get().calcular() + ".\n");
			carrosCarga.remove(carro.get());
			JOptionPane.showMessageDialog(null, "Veículo REMOVIDO com Sucesso!", "Aviso", JOptionPane.PLAIN_MESSAGE);
		}else JOptionPane.showMessageDialog(null, "Veículo não encontrado", "Alerta", JOptionPane.ERROR_MESSAGE);
	}

	public void excluirPasseioPlaca(String placa) {
		Optional<Passeio> carro = carrosPasseio.stream()
				.filter(veiculo -> veiculo.getPlaca().equals(placa))
				.findFirst();
		if(carro.isPresent()) {
			carrosPasseio.remove(carro.get());
			JOptionPane.showMessageDialog(null, "Veículo REMOVIDO com Sucesso!", "Aviso", JOptionPane.PLAIN_MESSAGE);
		}else JOptionPane.showMessageDialog(null, "Veículo não encontrado", "Alerta", JOptionPane.ERROR_MESSAGE);
	}

	public List<Passeio> getCarrosPasseio() {
		return carrosPasseio;
	}

	public List<Carga> getCarrosCarga() {
		return carrosCarga;
	}
}

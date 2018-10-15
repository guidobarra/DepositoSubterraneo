package DepositoSubterraneo;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
	
	private int volumen;
	private List <Deposito> depositos = new ArrayList<Deposito>();
	
	public Estacion(List<Deposito> depositos2, int volumen2) {
		// TODO Auto-generated constructor stub
		this.depositos= depositos2;
		this.volumen = volumen2;
	}
}

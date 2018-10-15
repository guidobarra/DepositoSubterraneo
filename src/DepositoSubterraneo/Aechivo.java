package DepositoSubterraneo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aechivo {
	public static Estacion leer(String path) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File(path));
		List <Deposito> depositos = new ArrayList<Deposito>();
		int sup, prof, volumen;
		int cantDepositos = sc.nextInt();
		
		sup = sc.nextInt();
		prof = sc.nextInt();
		for(int i=1; i<cantDepositos; i++) {
			int supAct = sc.nextInt(), profAct = sc.nextInt();
			while(prof==profAct) {
				sup+=supAct;
				prof= profAct;
				supAct = sc.nextInt();
				profAct = sc.nextInt();
			}
			depositos.add(new Deposito(sup, prof));
		}
		if(cantDepositos == 1)
			depositos.add(new Deposito(sup, prof));
		volumen = sc.nextInt();
		sc.close();
		for (Deposito deposito : depositos) {
			System.out.println(deposito.getSuperficie() + " " + deposito.getProfundidad());
		}
		return new Estacion(depositos, volumen);
		
	}
}

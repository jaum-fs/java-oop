package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ControleRemoto;




public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ControleRemoto control = new ControleRemoto(11, 35);
		
		System.out.println(control.mostrarInformações());
		
		control.diminuirCanal();
		control.diminuirVolume();
		System.out.println("Diminuindo volume e canal");
		System.out.println(control.mostrarInformações());
		
		control.aumentarCanal();
		control.aumentarVolume();
		System.out.println("Aumentando volume e canal");
		System.out.println(control.mostrarInformações());
		
		
		control.trocarCanal(4);
		System.out.println("Trocando canal");
		System.out.println(control.mostrarInformações());
		
		
		System.out.println(control);
		
		sc.close();
		
	}
}


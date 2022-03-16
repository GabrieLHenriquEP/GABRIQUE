/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_al_reves;

import java.util.Scanner;

/**
 *
 * @author cep
 */
public class Array_al_reves {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int teclado;
		int j;
		int[] valor1 = new int[3];
		int[] valor2 = new int[3];		
		// INSERTAR VALORES EN EL PRIMER ARRAY		
		for (int i = 0; i < valor1.length; i++) {
			System.out.println("introduzca un valor");
			teclado= sc.nextInt();
			valor1[i]= teclado;
		}		
		// PRINTAR POR PANTALLA.
		for (int i = 0; i < valor1.length; i++) {
			System.out.println("primer array");
			System.out.println("----------------------------");
			System.out.println(valor1[i]);
			System.out.println("----------------------------");
		}
		// INSERTAR VALORES DEL PRIMER ARRAY EN EL SEGUNDO ARRAY INVERTIDO
		j=valor1.length-1;
		for (int i = 0; i < valor1.length-1; i++) {
			valor2[j]= valor1[i];	
			j--;
		}
		// PRINTAR POR PANTALLA
		for (int i = 0; i < valor1.length; i++) {
			System.out.println("segundo array");
			System.out.println("----------------------------");
			System.out.println(valor2[i]);
			System.out.println("----------------------------");
		}
	}
	
}

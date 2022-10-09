package project6;

import java.util.Scanner;

public class ta06_8 {
	public static void main(String args[]){	
		
		int num[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		rellenar(num, sc);				
		
		mostrar(num);
		
		sc.close();
		
	}
	
	public static int[] rellenar(int num[], Scanner sc) {
		
		for(int n = 0; n <= 9; n++) {
			
			System.out.println("n: ");
			int nombre = sc.nextInt();
			num[n] = nombre;			
		}
		
		return new int[] {};
	}
	
	public static void mostrar(int num[]) {
		
		for(int n = 0; n <= 9; n++) {
			System.out.println("Index: "+n+" valor: "+num[n]);
		}
		
	}
	
	
}

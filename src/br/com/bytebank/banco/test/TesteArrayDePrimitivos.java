package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // incicializa o array com 0

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
//		idades[1] = 29;
//		idades[2] = 39;
//		idades[3] = 49;
//		idades[4] = 59;
//		idades[5] = 69;
//		
//		int idade1 = idades[4];
//		
//		System.out.println(idade1);
//		
//		System.out.println(idades.length);
	}

}

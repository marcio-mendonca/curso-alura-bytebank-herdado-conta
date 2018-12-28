package br.com.bytebank.banco.test;

public class MeuTeste {

	public static void main(String[] args) {
	
		int n = 5;
		int anterior1 = 0;
		int anterior2 = 0;
		int t = 0;
		
		anterior1 += 1;
		anterior2 += 1;
		t += 1;
		
		for (int i = 3; i < n; i++) {
			t = anterior1 + anterior2;
			anterior1 += anterior2;
			anterior2 += t;
		}
		System.out.println("na posicao " + n);
		System.out.println("seq. " + t);
		
		
//		String s1 = "Hello World";
//		char letrinha = s1.toLowerCase().trim().charAt(6);
//		
//		System.out.println(letrinha);
		
//	v-v-f-v
//		String t = "123"; 
//		String b = 123;
//				
//		int a = 5;
//		int x = 6;
//		int y = 7;
//		
//		if (a > 3) {
//			x = x * 11;
//			y = y - 3;
//			a = 30;
//			
//		} else if (x > 30) {
//			x = x * 3;
//			y = y * 2;
//			a = 12;
//			
//		} else if (y > 12) {
//			x = x * 2;
//			y = y + 1;
//			a = 7;
//			
//		} else {
//			x = x * 1;
//			y = y * 3;
//		}
//		
//		System.out.println("a "+ a);
//		System.out.println("x "+ x);
//		System.out.println("y "+ y);
	}
	
}

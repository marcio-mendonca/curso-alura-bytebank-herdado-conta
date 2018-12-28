package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;

public class TesteArrayCliente {

	public static void main(String[] args) {
		
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNome("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNome("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;
		
		Cliente t = (Cliente) refs[1];

		System.out.println(t.getNome());
	
	}
}

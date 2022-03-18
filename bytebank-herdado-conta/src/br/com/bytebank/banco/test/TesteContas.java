package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
//import java.lang.*;

//import br.com.bytebank.banco.modelo.*;
public class TesteContas {
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		//Full Qualified Name (FQN)
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.tranfere(10.0, cp); //polimorfismo
		
		//java.lang.System
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
				
	}
}

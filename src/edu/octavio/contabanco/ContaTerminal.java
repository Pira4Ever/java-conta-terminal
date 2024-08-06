package edu.octavio.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\\n");
		
		System.out.print("Insira o numero da conta: ");
		int accountNumber = scanner.nextInt();
		
		System.out.print("Insira a agência: ");
		String accountAgency = scanner.next();
		
		System.out.print("Insira seu nome: ");
		String accountName = scanner.next();
		
		System.out.print("Insira o saldo: ");
		double accountAmount = scanner.nextDouble();
		
		System.out.println("Olá " + accountName + ", obrigado por criar uma conta em nosso banco, sua agência é " + accountAgency + ", conta " + accountNumber + " e seu saldo de R$" + accountAmount + " já está disponível para saque!");
		
		scanner.close();
	}
}

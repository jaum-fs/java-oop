package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: "); int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: "); String holderAccount = sc.nextLine();
		System.out.print("Initial balance: "); Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: "); Double withdrawLimit = sc.nextDouble();
		System.out.println();
		Account acc = new Account(numberAccount, holderAccount, balance, withdrawLimit);
			
		System.out.print("Enter amount for withdraw: "); Double withdraw = sc.nextDouble();
		
		try{
			
			acc.withdraw(withdraw);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
			
		}catch (DomainException e){
			
			System.out.println("Withdraw error: "+ e.getMessage());
			
		}
		sc.close();
	}

}

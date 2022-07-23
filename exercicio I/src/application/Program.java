package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int qtdEmployees = sc.nextInt();
		System.out.println();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i=0; i< qtdEmployees; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			Funcionario emp = new Funcionario(id,name,salary);
			list.add(emp);
		}
		
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = positionID(list, idsalary);
		if (pos ==null) {
			System.out.println("This id does not exist");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employee: ");
		for (Funcionario emp: list) {
			System.out.println(emp);
		}
		
		sc.close();
	
	}
	
	public static Integer positionID(List<Funcionario> list, int id){
		for ( int i =0; i<list.size(); i++) {
			if (list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}

}

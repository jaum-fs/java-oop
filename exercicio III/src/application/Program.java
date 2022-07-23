package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department`s name: ");

		Department dept = new Department(sc.nextLine());
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: "); String name = sc.nextLine();

		System.out.println("Level: "); String level = sc.nextLine();
		
		System.out.println("Base salary: "); double baseSalary = sc.nextDouble();

		Worker data = new Worker (name, WorkerLevel.valueOf(level), baseSalary, dept);
		
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		System.out.println();
		for(int i = 1; i<=n; i++) {
			System.out.printf("Enter contract #%d data: \n", i);
			System.out.print("Date: (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			System.out.println();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			data.addContract(contract);
		}
		
		System.out.print("Enter a month and year to calculate income (mm/yyyy): ");
		String monthAndYear = sc.next();
		System.out.println();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.printf("Name: %s \n", data.getName());
		System.out.println("Department: "+ data.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", data.income(year, month)));
		
		sc.close();
	}

}

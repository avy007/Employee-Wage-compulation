package com.briglab;

import java.util.Random;

public class EmpWage {
	
	private static final int wagePerHour = 20; //class variable
	private static final int fullTimeHour = 8;
	private static final int partTimeHour = 4;
	static int workingDaysOfMonth = 0;
	static int totalHour = 0;
	static int totalDailyWage = 0;

	public static void main(String[] args) {

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		wageComputation(); //method calling

	}

	public static void wageComputation() {          //static method
		
		while (totalHour < 100 && workingDaysOfMonth < 20) {
			Random obj=new Random();
			int check=obj.nextInt(3);

			workingDaysOfMonth++;

			switch (check) {
			case 1:
				totalHour = totalHour + fullTimeHour;
				totalDailyWage = totalDailyWage + fullTimeHour * wagePerHour;
				System.out.println("Employee is present full time: " + totalDailyWage);
				break;
			case 2:
				totalHour = totalHour + partTimeHour;
				totalDailyWage = totalDailyWage + partTimeHour * wagePerHour;
				System.out.println("Employee is present half time: " + totalDailyWage);
				break;
			default:
				System.out.println();
				System.out.println("Employee is absent: " + totalDailyWage);
			}
			System.out.println();
			System.out.println("Working Days is: " + workingDaysOfMonth + " Hours: " + totalHour);
		}
		System.out.println();
		System.out.println("Employee total wage for month is: " + totalDailyWage);
	}

	}
	




package com.briglab;

import java.util.Random;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		
		int emppresent=1;
		int empabsent=0;
		int wageperhr=20;
		int perdayhr=8;
		int check;
		
		Random obj=new Random();
		check=obj.nextInt(2);
		
		if (emppresent==check) {
			System.out.println("emp present");
			System.out.println("emp daily wage "+perdayhr*wageperhr );
		}else {
			System.out.println("emp absent " + "daily wage=0 ");
		}
	}

}

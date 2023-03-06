package com.briglab;

import java.util.Random;

public class EmpWage {
	
	static int check;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		/*Calculating Wages
		for a Month
		- Assume 20 Working Day per Month*/
     EmpWage obj=new EmpWage();
     
		obj.check();
		int emppresent=1;
		int empabsent=0;
		int empparttime=2;
		int perdayhr=8;
		int parttimehr=6;
		int wageperhr=20;
		int daypermonth=20;
		System.out.println(check);
		
		if (emppresent==check) {
			System.out.println("emp present full time "+"monthly wage "+(perdayhr*wageperhr)*daypermonth);
			
		}if(empparttime==check) {
			System.out.println("emp part time"+"monthly wage "+(parttimehr*wageperhr)*daypermonth);
		}
		if(empabsent==check) {
			System.out.println("emp absent");
		}
		

	}
	public void check() {
		Random obj=new Random();
		check=obj.nextInt(3); // 0 1 2
	}


}

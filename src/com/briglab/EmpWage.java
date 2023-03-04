package com.briglab;

import java.util.Random;

public class EmpWage {
	
	//static int check;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		//Solving using
				//Switch Case
				//Statement
				Random obj=new Random();
				int check=obj.nextInt(2);
				System.out.println(check);
				int emppresent=0;
				//int empabsent=0;
				int empparttime=1;
				int perdayhr=8;
				int wageperhr=20;
				int parttimehr=6;
				
				switch(check) {
				
				case 0:System.out.println("emp present full time "+" emp daily wage= "+perdayhr*wageperhr);
				
		           break;
				case 1: System.out.println("emp present in part time "+"emp daily wage= "+wageperhr*parttimehr);   
				
				
				
				}
				
				
				

			}


}

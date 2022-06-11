package com.prodapt.week1;

public class LoanAmount {
	static double principle;
	static int time;
	static float rateOfInterest;
	
	void calculateSI() {
		double si=principle*time*rateOfInterest/100;
		si=si+principle;
		System.out.println("Total amount to be paid after Loan duration");
		System.out.println("Amount: "+si);
		}

		
	}


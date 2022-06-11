package com.prodapt.week1;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAmount la=new LoanAmount();
		LoanAmount.principle=100000;
		LoanAmount.time=4;
		LoanAmount.rateOfInterest=10;
		la.calculateSI();
		
		

	}

}

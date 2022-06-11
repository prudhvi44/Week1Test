package com.prodapt.week1;

public class SchoolRecords {
	String scl_Name [] = new String [15];
	int scl_Id [] = new int [10];
	String scl_Address[] = new String [50];
	public int i=0;
	
	void AddRecord(String scl_name,int scl_id,String scl_address){
		scl_Name[i]=scl_name;
		scl_Id[i]=scl_id;
		scl_Address[i]=scl_address;
		System.out.println("Schools are Successfully Added: "+i);
		i++;
	}
	public SchoolRecords() {
		System.out.println("Welcome to Chennai School Records....\n.");
	}
	 void  displayRecord() {
		
		--i;
		for(int j=0;j<=i;j++) {
			System.out.println("\nSchool Records are Displayed......\n");
			System.out.println((j+1) +".School Name is :"+scl_Name[j]+"\n"+"School ID : "+scl_Id[j]+"\n"+"School Address: "+" "+scl_Address[j]+"\n");
		
	}
	 }
	

}

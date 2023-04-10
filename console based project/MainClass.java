package com.javaproject;
import java.util.Scanner;
public class MainClass {
	public static void main(String[]args) {
		//we create object to swiggyManagement class
		SwiggyManagement obj=new SwiggyManagement();                     

		Scanner scan=new Scanner(System.in);

		//in this cases we call the methods from SwiggyManagement class using object
		int choices;
		do {
			choices = scan.nextInt();  

			switch(choices) {
			case 1:  
				obj.insert();//insert restaurant details
				break;

			case 2:                       
				obj.displayDetails();//Display the inserted details
				break;
                                       
			case 3:                           
				obj.deleteHotel(obj);//remove particular restaurant details by giving unique number
				break;

			case 4:
				obj.searchHotel(obj); //search particular restaurant details
				break;

			case 5:
				obj.updateDetails(obj);//update the restaurant details
				break;
			}
		}

		while(choices<6);

		scan.close();

	}

}




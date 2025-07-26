package com.esther.assignment2;
import java .util.Scanner;

public class SalesEmployee {
	private String Name;
	private String Address;            //data members
	private String phone;
	private double sales_amount;
	private double Commission;
     
	
	 // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter Sales Employee Details:");
        System.out.print("Enter Name: ");
        this.Name = scanner.nextLine();

        System.out.print("Enter Address: ");
        this.Address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        this.phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        this.sales_amount = scanner.nextDouble();
        // scanner.nextLine(); // Consume the remaining newline character
    }
    // Method to calculate and display the commission
    public void calculateAndDisplayCommission() {
        if (this.sales_amount >= 100000) {
            this.Commission = 0.10 * this.sales_amount; // 10%
        } 
        else if (this.sales_amount >= 50000 && this.sales_amount < 100000) {
            this.Commission = 0.05 * this.sales_amount; // 5%
        } 
        else if (this.sales_amount < 50000) { // Assuming 3% for < 50000 as per common interpretation of the question
            this.Commission = 0.03 * this.sales_amount; // 3%
        }
        else {
            // This else block should ideally not be reached with typical positive sales amounts.
            // It's a safeguard for negative or zero sales if the problem implied it.
            this.Commission = 0.0;
        }

        System.out.println("\n--- Sales Employee Commission Details ---");
        System.out.println("Name: " + this.Name);
        System.out.println("Address: " + this.Address);
        System.out.println("Phone: " + this.phone);
        System.out.println("Sales Amount: $" + String.format("%.2f", this.sales_amount));
        System.out.println("Calculated Commission: $" + String.format("%.2f", this.Commission));
        System.out.println("----------------------------------------");
    }
}




/*
 * File name: PayableInterfaceTest2.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */
/**
 * PayableInterfaceTest2 class provides the main method to test classes
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public class PayableInterfaceTest2  {
/**
 * This is the test for your interface Payme.
 * @param args arguments array
 */
public static void main(String[] args) {
// Create six-element Payme array here 
Payme[] paymeObjects = new Payme[6];
// Populate the array with objects that implement Payme
paymeObjects[0] = new Invoice("22776","brakes",3,300.00);
paymeObjects[1] = new Invoice("33442","gear",5,90.99);
paymeObjects[2] = new SalariedProgrammer("Chioma","Chidimma","345-67-0001",320.00);
paymeObjects[3] = new HourlyProgrammer("Amara","Chukwu","234-56-7770",18.95,40.00);
paymeObjects[4] = new CommissionProgrammer("Peter","Goodman","123-45-6999",16500.00,0.44);
paymeObjects[5] = new BasePlusCommissionProgrammer("Si","Wang","102-34-5888",1200.00,0.04,720.00);

 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    //System.out.printf("\n%s \n", currentPayme.toString());  
	 currentPayme.display();
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    } 
    System.out.printf("%s: $%,.2f\n\n", "payment due", currentPayme.getPaymentAmount());

 }
}
}



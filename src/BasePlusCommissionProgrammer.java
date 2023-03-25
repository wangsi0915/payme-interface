/*
 * File name: BasePlusCommissionProgrammer.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */

/**
 * BasePlusCommissionProgrammer class extends CommissionProgrammer.
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
/**
 * base salary per week
 */
private double baseSalary; 

/**
 * 123456
 * @param firstName first name
 * @param lastName last name 
 * @param socialSecurityNumber social security number
 * @param grossSales gross weekly sales
 * @param commissionRate commission percentage
 * @param baseSalary base salary
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

/**
 * 
 * @param baseSalary base salary
 */
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/**
 * 
 * @return double base salary
 */
public double getBaseSalary() {
return baseSalary;
}

@Override                                                            
public double getPaymentAmount() {
	return getBaseSalary() + super.getPaymentAmount();             
} 

@Override 
public String toString() {
	return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f; %s: %s; %s: $%,.2f", 
			  "base-plus commission programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(),"commission rate",getCommissionRate(),"base salary",getBaseSalary());
			}                                                     

}




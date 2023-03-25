/*
 * File name: Payme.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */
/**
 * Payme is a interface
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public interface Payme {
	/**
	 * 
	 * @return double get the payment amount
	 */
	double getPaymentAmount();
	/**
	 * default method allow each Payme instance to print itself
	 */
	default void display() {
		System.out.println(toString());
	};

}

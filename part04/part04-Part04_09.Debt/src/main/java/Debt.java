/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duu
 */
public class Debt {
	private double balance, interestRate;	
	
	public Debt(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void printBalance(){
		System.out.println(this.balance);
	}	

	public void waitOneYear(){
		this.balance *= this.interestRate;
	}
}

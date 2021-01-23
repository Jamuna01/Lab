/*
Lab 1

Goals
Understand method and constructor overloading
Description


Create a class BankAccount with methods to withdraw funds, deposit funds, display account information such as account number and balance
The user can open a bank account providing the following information:

name and initial balance
name only (initial balance set to 0 in that case)

Account number should be assigned in the constructor based on the value in the static field of the class.

Overload the withdraw method with one that also takes a fee and deducts that fee from the account.

Overload the deposit method with one that also takes an interest and increases all the balance in the account by that percent.

After every transaction account number and balance should be displayed.
In the main method, create several BankAccount objects for testing purposes, deposit and withdraw funds from them in all possible ways.
*/
public class BankAccount
{

	//instance variables
	private String AccName;
	static int AccNum = 100;
	private double iniBalance;
	
	
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public double getIniBalance() {
		return iniBalance;
	}
	public void setIniBalance(double iniBalance) {
		this.iniBalance = iniBalance;
	}
	BankAccount(String name, double balance)
	{
		this.AccName = name;
		this.iniBalance = balance;
		AccNum++;
	}
	BankAccount(String name)
	{
		this.AccName = name;
	}
	public void withdrawFund(double amount)
	{
		amount = iniBalance - amount;
		System.out.printf("Your balance: $%.2f\n", amount);
	}
	public void withdrawFund(double amount, double fee)
	{
		if(amount > iniBalance)
		{
			fee = (fee / 100) * amount ;
			amount = iniBalance - amount - fee;
			System.out.printf("Sorry You Don't Have Enough Balance!\nand Your Balance is $%.2f", amount);
		}
		else
		{
			withdrawFund(amount);
		}
	}
	public void depositFund(double amount)
	{
		amount = iniBalance + amount ;
		System.out.printf("Your balance: $%.2f\n", amount);
	}
	public void depositFund(double amount, double interest)
	{
		if(amount >= iniBalance)
		{
			interest = (interest / 100) * amount ;
			amount = iniBalance + amount + interest;
			System.out.printf("With Interest your Balance is $%.2f", amount);
		}
		else
		{
			depositFund(amount);
		}
	}
	@Override
	public String toString() 
	{
		return String.format("\nName: %s\nAccount Number: %d", getAccName(), AccNum);
	}
	
}
	

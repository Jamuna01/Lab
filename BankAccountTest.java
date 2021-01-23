import java.util.Scanner;
public class BankAccountTest 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in); 
		
		System.out.printf("Please enter your account name: ");
		String name = console.nextLine();
		
		System.out.printf("Enter your balance: ");
		double balance = console.nextDouble();
		
		BankAccount ba = new BankAccount(name, balance);
		
		
		System.out.printf("What do you want to do: \n");
		System.out.printf("Enter '1' for deposit, '2' for withdraw: ");
		int num = console.nextInt();
		
		if(num == 1)
		{
			System.out.printf("\nEnter the amount you want to deposit: ");
			double dep = console.nextDouble();
			System.out.printf("Enter the amount of interest rate: ");
			double interest = console.nextDouble();
			System.out.printf("=======================================");
			System.out.println(ba.toString());
			ba.depositFund(dep, interest);
			System.out.printf("\n=======================================");
			
					
			}
		if(num == 2)
		{
			System.out.printf("Enter the amount you want to withdraw: ");
			double wit = console.nextDouble();
			System.out.printf("Enter the deduction fee: ");
			double fee = console.nextDouble();
			System.out.printf("=======================================");
			System.out.println(ba.toString());
			ba.withdrawFund(wit, fee);
			System.out.printf("\n=======================================");
		}
	}
	
}
		
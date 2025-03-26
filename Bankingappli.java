package Banking;
import java.util.*;
public class Bankingappli {
	int id;
	String name;
	int Balance;
	Bankingappli(int id,String name,int Balance){
		this.id=id;
		this.name=name;
		this.Balance=Balance;
	}
	void Acc_info() {
		System.out.println("Account_id: "+ id);
		System.out.println("Accountholder_Name: "+ name);
		System.out.println("Bank_Balance : "+ Balance);
	}
	void Account_cashWithdrawl(int wamt) {
		System.out.println("amount to withdraw");
		if(wamt<Balance) {
		Balance=Balance - wamt;
		System.out.println("Balance after is the transaction"+Balance);
		}
		else {
			System.out.println("amount is insuffiecient to withdraw");
		}
	}
	void accountAmtDeposit(int dpamt) {
		Balance=Balance+dpamt;
	}
	void checkBalance() {
		System.out.println(Balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the account number");
		int n=sc.nextInt();
		System.out.println("enter the account holder name");
		String name=sc.next();
		System.out.println("Balance Amount");
		int bal=sc.nextInt();
		Bankingappli ba=new Bankingappli (n,name,bal);
	
	/*	Bankingappli ba2=new Bankingappli (n,name,bal);
		Bankingappli ba3=new Bankingappli (n,name,bal);
		Bankingappli ba4=new Bankingappli (n,name,bal);
		Bankingappli ba5=new Bankingappli (n,name,bal);
		Bankingappli ba6=new Bankingappli (n,name,bal);
		Bankingappli ba7=new Bankingappli (n,name,bal);
		Bankingappli ba8=new Bankingappli (n,name,bal);
		Bankingappli ba9=new Bankingappli (n,name,bal);
		*/

		ba.Acc_info();
		System.out.println("amount to withdraw");
		int a=sc.nextInt();
		ba.Account_cashWithdrawl(a);
		
		System.out.println("amount to Deposit");
		int dmt=sc.nextInt();
		ba.accountAmtDeposit(dmt);
		
		System.out.println("bank Balance" );
		//int bbal=sc.nextInt();
		ba.checkBalance();
	
		
		System.out.println("enter the second account number");
		int n1=sc.nextInt();
		System.out.println("enter the account holder name");
		String name1=sc.next();
		System.out.println("Balance Amount");
		int bal1=sc.nextInt();
		Bankingappli ba1=new Bankingappli (n1,name1,bal1);
		ba1.Acc_info();
		System.out.println("amount to withdraw");
		int a1=sc.nextInt();
		ba1.Account_cashWithdrawl(a1);
		
		System.out.println("amount to Deposit");
		int dmt1=sc.nextInt();
		ba1.accountAmtDeposit(dmt1);
		
		System.out.println("bank Balance" );
		//int bbal=sc.nextInt();
		ba1.checkBalance();
	
	/*	ba2.Acc_info();
		System.out.println("amount to withdraw");
		int a2=sc.nextInt();
		ba2.Account_cashWithdrawl(a2);
		
		System.out.println("amount to Deposit");
		int dmt2=sc.nextInt();
		ba2.accountAmtDeposit(dmt2);
		
		System.out.println("bank Balance" );
		//int bbal=sc.nextInt();
		ba2.checkBalance();*/
	/*for(int i=0;i<name.length()-1;i++) {
		if(n==101) {
			System.out.println(n);
		}*/
	}
	}


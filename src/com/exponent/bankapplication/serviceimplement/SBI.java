package com.exponent.bankapplication.serviceimplement;

import java.util.Scanner;

import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.service.RBI;

public class SBI implements RBI{
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	private double accountbalance;
	
	@Override
	public void RegisterAccount() {
		System.out.println(".........ACCOUNT REGISTRAION STRART........");
		int accountnumber=getAccountnumber();
		ac.setAccountnumber(accountnumber);
		String name=getName();
		System.out.println("ENTER YOUR ADHAR NUMBER");
		ac.setAdharcard(sc.next());
		System.out.println("ENTER YOUR PANCARD NUMBER");
		ac.setPancard(sc.next());
		System.out.println("ENTER YOUR MOBILE NUMBER");
		ac.setMobilenumber(sc.nextLong());
		System.out.println("ENTER ACCOUNT OPNING AMOUNT");
		ac.setAccountBalance(sc.nextDouble());
		System.out.println(".......@@@@ ACCOUNT REGISTRATION SUCCESFULLY DONE @@@@@........");
		System.out.println(".........ACCOUNT REGISTRAION END........");

		
		
	}
	private int getAccountnumber()
	{
		System.out.println("ENTER YOUR ACCOUNT NUMBER");
		int accountnumber=sc.nextInt();
		boolean flag=isaccountnumbervalid(accountnumber);
		if (!flag)
		{
			System.out.println("is account no is invalid");
			return getAccountnumber();
		}
		return accountnumber;
	}
		
		private boolean isaccountnumbervalid(int accountnumber)
		{	
			if(accountnumber>999)
			{
		        return true;
			}else {
				
				return false;
			}
					
		}					

	private String getName()
	{
	   System.out.println("enter your name");
	   String name=sc.next();
		boolean flag= isNamevalid(name);
		if(!flag)
		{
			System.out.println("invalid name found");
			return getName();
		}
		return name;
		}
	private boolean isNamevalid(String name)  
	{
		System.out.println("parameter value name: "+name);
		boolean flag=false;
		System.out.println("length of name is :"+name.length());
		if(name.length()>=3)
    {
    	System.out.println("length is>3");
    	System.out.println("enter name value is correct: "+name);
    	flag=true;
    }else {
    	System.out.println("length is<3");
    	System.out.println("length is less than 3");
    }
		return flag;
		
    	
	
}
	
	
		
	

	@Override
	public void showAccountDetails() {
		System.out.println("ENTER ACCOUNT NUMBER");
		int accountnumber=sc.nextInt();
		if (accountnumber==ac.getAccountnumber())
		{
			System.out.println(ac.getName()+" "+ac.getMobilenumber()+" "+ac.getPancard()+" "+ac.getAccountBalance());
			
		}
			
	}	
		@Override
	public void showAccountbalance() {
		System.out.println("ENTER ACCOUNT NUMBER");
		int accountnumber=sc.nextInt();
	    if(accountnumber==ac.getAccountnumber())
	    {
	    System.out.println("account balance is: "+ac.getAccountBalance());
	    }	
         		
	}

	@Override
	public void WithdrawMoney() {
		System.out.println("ENTER ACCOUNT NUMBER");
		int accountnumber=sc.nextInt();
		if(accountnumber==ac.getAccountnumber())
		{
			System.out.println("ENTER YOUT WITHDRAW AMOUNT");
			double x = ac.getAccountBalance();
			double y =sc.nextDouble();
			double z= x-y;
			System.out.println("");
			System.out.println("YOUR CURRENT BALANCE IS: "+x);
			System.out.println("YOUR WITHDRAW AMOUNT IS: "+y);
			System.out.println("YOUR REMAINING BALANCE IS: "+z);
			ac.setAccountBalance(z);	
		}
		
		
		
	}

	@Override
	public void DepositeMoney() {
		System.out.println("ENTER ACCOUNT NUMBER");
		int accountnumber=sc.nextInt();
		if(accountnumber==ac.getAccountnumber())
		{
			System.out.println("ENTER YOUT DEPOSITE AMOUNT");
			double x = ac.getAccountBalance();
			double y =sc.nextDouble();
			double z= x+y;
			System.out.println("");
			System.out.println("YOUR CURRENT BALANCE IS: "+x);
			System.out.println("YOUR DEPOSITE AMOUNT IS: "+y);
			System.out.println("YOUR TOTAL BALANCE IS: "+z);
			ac.setAccountBalance(z);
		}
	}

	@Override
	public void UpdateAccount() {
		System.out.println("ENTER ACCOUNT NUMBER");
		int accountnumber=sc.nextInt();
		if(accountnumber==ac.getAccountnumber())
		{
			System.out.println("ENTER YOUR A/C NUMBER");
			String name1=sc.next();
			ac.setName(name1);
			
			System.out.println("ENTER MO NUMBER");
			long number1=sc.nextLong();
			ac.setMobilenumber(number1);
		}else {
			
			System.out.println("THANKS FOR COMING TO .....SBI....");
			
			
		}
		
	}

	
	
	

}

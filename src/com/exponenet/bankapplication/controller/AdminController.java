package com.exponenet.bankapplication.controller;

import java.util.Scanner;

import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.serviceimplement.SBI;

public class AdminController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();

		while (flag) {
			System.out.println("......&@&@&@& WELCOME TO SBI &@&@&@&@....");
			System.out.println("....BANK APPLICATION START.....");
			System.out.println(".............................");
			System.out.println("1: CREAT BANK ACCOUNT");
			System.out.println("2: SHOW ACCOUNT DETAILS");
			System.out.println("3: SHOW ACCOUNT BALANCE");
			System.out.println("4: DEPOSITE MONEY");
			System.out.println("5: WITHDRAW MONEY");
			System.out.println("6: UPDATE ACCOUNT");
			System.out.println("7: EXIT");
			System.out.println("...........ENTER YOUR CHOICE ..........");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.RegisterAccount();
				break;

			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountbalance();
				break;
			case 4:
				rbi.DepositeMoney();
				break;
			case 5:
				rbi.WithdrawMoney();
				break;
			case 6:
				rbi.UpdateAccount();
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("WRONG CHOICE");
				break;
			}

		}

		sc.close();
		System.out.println("................THANKU FOR BANKING WITH US............");

	}

}

package com.BankTran;

import java.util.Iterator;
import java.util.Scanner;

public class GroupByBank {

	public static void groupByBank() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bank = sc.next();
		int c = 0;
		Iterator<BankAccount> bai = ReadData.listBank.iterator();
		while (bai.hasNext()) {
			BankAccount b = bai.next();
			if (bank.equals(b.getBank())) {
				System.out.println(b.toString());
				c++;
			}

		}
		if (c == 0) {
			System.out.println("no record Found");
		}

	}

}

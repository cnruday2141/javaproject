package com.BankTran;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadData {
	static List<BankAccount> listBank = new ArrayList();
	static List<BankTransaction> listBanktrans = new ArrayList();

	

	public static void readData() throws IOException {

		// bankAccount
		// System.out.println("Read Account Details");
		BufferedReader ba = new BufferedReader(new FileReader("bankAccount.txt"));
		String baValue;
		while ((baValue = ba.readLine()) != null) {
			String slitBa[] = baValue.split(",");
			BankAccount baObj = new BankAccount(slitBa[0], slitBa[1], slitBa[2], slitBa[3], slitBa[4], slitBa[5]);
			listBank.add(baObj);
			// System.out.println(baObj);
		}

		ba.close();
		// bankTransaction
		// System.out.println("Read Transaction Details");
		BufferedReader bt = new BufferedReader(new FileReader("bankTransaction.txt"));
		String btValue;
		while ((btValue = bt.readLine()) != null) {
			String slitBt[] = btValue.split(",");
			BankTransaction btObj = new BankTransaction(slitBt[0], slitBt[1], slitBt[2]);
			listBanktrans.add(btObj);
			// System.out.println(btObj);
		}
		bt.close();
		
	}
	public static void readOnly()
	{
		System.out.println("Read Account Details");
		ReadData.listBank.forEach(n->System.out.println(n));
		System.out.println("Read Transaction Details");
		ReadData.listBanktrans.forEach(n->System.out.println(n));
	}

}

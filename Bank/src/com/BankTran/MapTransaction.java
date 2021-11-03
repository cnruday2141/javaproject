package com.BankTran;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTransaction {
	static List<AccountTransaction> listAT = new ArrayList();
	public static void mapTransaction() throws IOException {
		Map m = new HashMap();

		
		System.out.println("map Transaction");
		
		Iterator<BankAccount> bai = ReadData.listBank.iterator();
		while (bai.hasNext()) {
			//System.out.println("bti : "+bti.next().getCardNumber() );
			String baC = bai.next().getCardNumber();
          
			
			Iterator<BankTransaction> bti = ReadData.listBanktrans.iterator();
			while (bti.hasNext() ) {
				
				BankTransaction baT = bti.next();
				  String v = baT.getCardNumber();
				if(v.equals(baC))
				{
					System.out.println("Customer Card Number : "+baC +" "+baT.toString());
				}
					

			}
		}
		
	}

}

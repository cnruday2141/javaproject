package com.BankTran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortByData 
{
	static List<AccountTransaction> listAT = new ArrayList<AccountTransaction>();
	public static void  sortByData()
	{
	System.out.println("sort By Data");	
		Iterator<BankAccount> bai = ReadData.listBank.iterator();
		while (bai.hasNext()) {
			//System.out.println("bti : "+bti.next().getCardNumber() );
			BankAccount baC = bai.next();
			String bA = baC.getCardNumber();
          
			
			Iterator<BankTransaction> bti = ReadData.listBanktrans.iterator();
			while (bti.hasNext() ) {
				
				BankTransaction baT = bti.next();
				  String v = baT.getCardNumber();
				if(v.equals(bA))
				{
					listAT.add(new AccountTransaction(baC,baT));

				}
					

			}
		}
		
		Collections.sort(listAT);
		Iterator aci = listAT.iterator();
		while(aci.hasNext())
		{
			System.out.println(aci.next());
		}
		
		
			

		
	}

}

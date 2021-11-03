package com.BankTran;

import java.util.Iterator;
import java.util.Scanner;

public class RecordByName 
{
	public static void recordByName() 
	{
		System.out.println("record by name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		//DataFormat.set
		Iterator i = DataFormat.set.iterator();
		int r =0;
		while(i.hasNext())
		{
			AccountTransaction ac = (AccountTransaction) i.next();
			if(ac.getName().equals(name))
			{
				r++;
				System.out.println(ac.toString());
			}
		}
		if(r==0)
		{
			System.out.println("no record found");
		}
		
	}

}

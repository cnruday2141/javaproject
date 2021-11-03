package com.BankTran;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DataFormat {
	static Set set = new HashSet(SortByData.listAT);
	public static void dataFormat() {
		
		System.out.println("data in format");
		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}

	}

}

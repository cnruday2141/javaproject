package com.BankTran;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainFile {
	
	public static void main(String[] args) throws IOException 
	{

	//2) read Data From File
	ReadData.readData();
	ReadData.readOnly();
	//3) map Transaction
	MapTransaction.mapTransaction();
	//4)group bank details by bank
	GroupByBank.groupByBank();
	//5)sorting
	SortByData.sortByData();
	//6) data in format
	DataFormat.dataFormat();
	//7)show record based on name
	RecordByName.recordByName();
	}

}

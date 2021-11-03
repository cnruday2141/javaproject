package com.BankTran;

public class AccountTransaction implements Comparable<AccountTransaction>
{
	private String name;
	private String age;
	private String gender;
	private String bank;
	private String cardNumber;
	private String creditLimit;
	private String transactionDate;
	private String amount;
	
	
	public AccountTransaction()
	{
		
	}
	public AccountTransaction(BankAccount ba,BankTransaction bt)
	{
		
		this.name = ba.getName();
		this.age = ba.getAge();
		this.gender = ba.getGender();
		this.bank = ba.getBank();
		this.cardNumber = ba.getCardNumber();
		this.creditLimit = ba.getCreditLimit();
		this.transactionDate = bt.getTransactionDate();
		this.amount = bt.getAmount();
	}
	
	
	
	
	@Override
	public String toString() {
		return "AccountTransaction [name=" + name + ", age=" + age + ", gender=" + gender + ", bank=" + bank
				+ ", cardNumber=" + cardNumber + ", creditLimit=" + creditLimit + ", transactionDate=" + transactionDate
				+ ", amount=" + amount + "]";
	}




	public AccountTransaction(String name, String age, String gender, String bank, String cardNumber,
			String creditLimit, String transactionDate, String amount) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bank = bank;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}




	@Override
	public int compareTo(AccountTransaction o) {
		// TODO Auto-generated method stub
		Integer a = Integer.parseInt(this.amount);
		Integer a1 = Integer.parseInt(o.amount);
		return a - a1;
	}
	
	

}

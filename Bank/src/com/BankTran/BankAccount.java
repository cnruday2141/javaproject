package com.BankTran;

public class BankAccount {
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", age=" + age + ", gender=" + gender + ", bank=" + bank + ", cardNumber="
				+ cardNumber + ", creditLimit=" + creditLimit + "]";
	}
	private String name;
	private String age;
	private String gender;
	private String bank;
	private String cardNumber;
	public BankAccount()
	{
		
	}
	 public BankAccount(String name, String age, String gender, String bank, String cardNumber, String creditLimit) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bank = bank;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
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
	private String creditLimit;
}

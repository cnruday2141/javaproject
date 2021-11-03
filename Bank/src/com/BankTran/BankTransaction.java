package com.BankTran;

public class BankTransaction 
{
	@Override
	public String toString() {
		return "BankTransaction [cardNumber=" + cardNumber + ", transactionDate=" + transactionDate + ", amount="
				+ amount + "]";
	}
	public BankTransaction(String cardNumber, String transactionDate, String amount) {
		super();
		this.cardNumber = cardNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}
	public BankTransaction()
	{
		
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	private String cardNumber;
	private String transactionDate;
	private String amount;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}

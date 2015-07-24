package com.jamesshore.finances;

public class SavingsAccountYear {

	private int startingPrincipal = 0;
	private int startingBalance = 0;
//	private int capitalGainsAmount = 0;
	private int interestRate = 0;
	private int totalWithdrawn = 0;
	
/*
	public SavingsAccountYear(int startingBalance, int interestRate) {
		this.startingBalance = startingBalance;
		this.interestRate = interestRate;
	}
	*/

	public SavingsAccountYear(int startingBalance, int startingPrincipal, int interestRate) {
		this.startingBalance = startingBalance;
		this.startingPrincipal = startingPrincipal;
//		this.capitalGainsAmount = startingBalance - startingPrincipal;
		this.interestRate = interestRate;
	}

	public void deposit(int amount) {
		startingBalance += amount;
	}

	public void withdraw(int amount) {
		//startingBalance -= amount;
		this.totalWithdrawn  += amount;
		
	}

	public int totalWithdrawn() {
		return totalWithdrawn;
	}
	
	public SavingsAccountYear nextYear(int capitalGainsTaxRate) {
		return new SavingsAccountYear(this.endingBalance(capitalGainsTaxRate), startingPrincipal, interestRate);
	}

	public int startingBalance() {
		return startingBalance;
	}
	
	public int startingPrincipal() {
		//return startingBalance - capitalGainsAmount;
		return startingPrincipal;
	}

	public int startingCapitalGains() {
		return startingBalance - startingPrincipal;
	}

	public int endingBalance(int capitalGainsTaxRate) {
		int modifiedStart = startingBalance() - totalWithdrawn() - capitalGainsTaxIncurred(capitalGainsTaxRate);
		return modifiedStart + (modifiedStart * interestRate / 100);
	}
	
	public int endingPrincipal() {
		int result = startingPrincipal() - totalWithdrawn();
		return  Math.max(0, result);
	}
	
	public int interestRate() {
		return interestRate;
	}


	public int capitalGainsWithdrawn() {
		int result = -(startingPrincipal() - totalWithdrawn());
		return  Math.max(0, result);
	}

	public int capitalGainsTaxIncurred(int taxRate) {
		double dblTaxRate = taxRate/100.0;
		double dblCapitalGainsWithdrawn = capitalGainsWithdrawn();
		//return (int) (capitalGainsWithdrawn() / (1 - dblTaxRate)) - capitalGainsWithdrawn();
		return (int) (dblCapitalGainsWithdrawn / (1 - dblTaxRate) - dblCapitalGainsWithdrawn);
	}


	public int endingCapitalGains() {
		// TODO VIDEO 9 Still need to watch video 9...
		return 0;
	}
}

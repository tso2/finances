//package com.jamesshore.finances;


//import org.junit.Test;

//import static org.junit.Assert.*;


public class _SavingsAccountYearTest {
	
/*
	@Test
	public void startingBalanceMatchesConstructor(){
		SavingsAccountYear account = newAccount();
		assertEquals(10000, account.startingBalance());
	}

	@Test
	public void interestRateMatchesConstructor() {
		SavingsAccountYear account = newAccount();
		assertEquals(10, account.interestRate());
	}

	@Test
	public void startingPrincipalMatchesConstructor() {
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		assertEquals(3000, year.startingPrincipal());
	}

	@Test
	public void startingCapitalGainsIsStartingBalanceMinusStartingPrincipal() {
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		assertEquals(7000, year.startingCapitalGains());
	}

	@Test
	public void endingPrincipalConsidersWithdrawals() {
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		year.withdraw(2000);
		assertEquals("ending principal", 1000, year.endingPrincipal());
	}

	@Test
	public void endingPrincipalNeverGoesBelowZero() {
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		year.withdraw(4000);
		assertEquals("ending principal", 0, year.endingPrincipal());
	}

	@Test
	public void endingCapitalGainsIncludesInterestEarned() {
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		assertEquals(7000, year.startingCapitalGains());
		assertEquals(4000, year.endingCapitalGains());
	}

	@Test
	public void endingBalanceAppliesInterestRate() {
		SavingsAccountYear account = newAccount();
		assertEquals(11000, account.endingBalance(25));

	}

	@Test
	public void withdrawnFundsDoNotEarnInterest() {
		SavingsAccountYear year = newAccount();
		year.withdraw(1000);
		assertEquals(9900, year.endingBalance(25));
	}

	@Test
	public void multipleWithdrawalsInAYear() {
		SavingsAccountYear year = newAccount();
		year.withdraw(1000);
		year.withdraw(2000);
		assertEquals(3000, year.totalWithdrawn());
		
	}

	@Test
	public void withdrawingMoreThanPrincipalTakesFromCapitalGains() {
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		year.withdraw(1000);
		assertEquals(0, year.capitalGainsWithdrawn());
		year.withdraw(3000);
		assertEquals("Withdrew 1000 more than principal balance", 1000, year.capitalGainsWithdrawn());
	}

	@Test
	public void capitalGainsTaxIncurred_needsToCoverCapitalGainsWithdrawn_AND_theAdditionalCapitalGainsWithdrawnToPayTheCapitalGainsTax() {
//		Example of concept:
//		1000 withdrawn
//		10% tax rate
//      1000 * 0.10 = 100
//      100  * 0.10 = 10
//      10   * 0.10 = 1
//      ...
//      100 + 10 + 1 extra is needed to withdraw and pay tax
//      ... Using this formula:
//      1000/(inverse of rate) - 1000 = 111
//        1000/(1 - 0.10) - 1000 = 111 (actually 111.1111...)
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		year.withdraw(5000);
		assertEquals(2000, year.capitalGainsWithdrawn());
		//2000/(1-0.25) - 2000 = 666.66...
		assertEquals(666, year.capitalGainsTaxIncurred(25));
	}

	@Test
	public void nextYearsStartingBalanceShouldEqualThisYearsEndingBalance() {
		SavingsAccountYear account = newAccount();
		assertEquals(account.endingBalance(25), account.nextYear(25).startingBalance());
	}

	@Test
	public void nextYearsInterestRateEqualsThisYearsInterestRate() {
		SavingsAccountYear thisYear = newAccount();
		assertEquals(thisYear.interestRate(), thisYear.nextYear(25).interestRate());
	}

	@Test
	public void capitalGainsTaxIsIncludedInEndingBalance() {
		SavingsAccountYear year = new SavingsAccountYear(10000, 3000, 10);
		int amountWithdrawn = 5000;
		year.withdraw(amountWithdrawn);
		int expectedCapitalGainsTax = 666;
		assertEquals(expectedCapitalGainsTax, year.capitalGainsTaxIncurred(25));
		int expectedBalanceAfterWithdrawals = 10000 - amountWithdrawn - expectedCapitalGainsTax;
		assertEquals((int)(expectedBalanceAfterWithdrawals * 1.10), year.endingBalance(25));
	}

	private SavingsAccountYear newAccount() {
		SavingsAccountYear account = new SavingsAccountYear(10000, 10000,10);
		return account;
	}
*/
}

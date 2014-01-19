package com.chaminda.bdd.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.chaminda.bdd.jbehave.Account;

public class DepositSteps {

	Account account = null;

	@Given("the Accounts initial balance is $<initial>")
	public void givenAccountInitialBalance(@Named("initial") double initial) {
		account = new Account();
		account.setBalance(initial);
	}

	@When("I deposit $<amount>")
	public void whenIDepositMoneyIntoMyAccount(@Named("amount") double amount) {
		account.deposit(amount);
	}

	@Then("the balance should be $<endBalance>")
	public void thenTheFinalBalanceShouldBe(@Named("endBalance") double endBalance) {
		assert account.getBalance() == endBalance;
	}

}

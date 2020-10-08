package com.pankaj.bean;

public class BankLoanApprover {
	private LoanDetails loanDetails;

	public BankLoanApprover() {
		System.out.println("BankLoanApprover.BankLoanApprover()");
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	@Override
	public String toString() {
		return "BankLoanApprover [loanDetails=" + loanDetails + "]";
	}

	public String approveLoan() {
		if (loanDetails.getLoadType().equals("Home loan")) {
			return "Loan is Approved..";
		} else {
			return "Loan is Rejected..";
		}
	}
}

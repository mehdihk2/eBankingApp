package org.example.ebankingbackend.services;

import org.example.ebankingbackend.dtos.CustomerDTO;
import org.example.ebankingbackend.entities.BankAccount;
import org.example.ebankingbackend.entities.CurrentAccount;
import org.example.ebankingbackend.entities.Customer;
import org.example.ebankingbackend.entities.SavingAccount;
import org.example.ebankingbackend.exceptions.BalanceNotSufficientException;
import org.example.ebankingbackend.exceptions.BankAccountnNotFoundException;
import org.example.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingAccount  saveSavingBankAccount(double initialBalance, double InterestRate, Long customerId) throws CustomerNotFoundException;

    List<CustomerDTO> listCustomer();
    BankAccount getBankAccount(String accountId) throws BankAccountnNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountnNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountnNotFoundException, BalanceNotSufficientException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountnNotFoundException, BalanceNotSufficientException;
    List<BankAccount> bankAccountList();
}

package org.example.ebankingbackend.services;
import jakarta.transaction.Transactional;
import org.example.ebankingbackend.entities.BankAccount;
import org.example.ebankingbackend.entities.CurrentAccount;
import org.example.ebankingbackend.entities.SavingAccount;
import org.example.ebankingbackend.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    public void consulter(){
        BankAccount bankAccount =
                bankAccountRepository.findById("0bc4ca7a-9df9-4c75-b279-a3ff2ca1c482").orElse(null);
        if(bankAccount != null) {
            System.out.println("****************************");
            System.out.println(bankAccount);
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreatedAt());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if (bankAccount instanceof CurrentAccount) {
                System.out.println("Over Draft->" +
                        ((CurrentAccount) bankAccount).getOverDraft());
            } else if (bankAccount instanceof SavingAccount) {
                System.out.println("Rate ->" + ((SavingAccount) bankAccount).getInterestRate());
            }
            bankAccount.getAccountOperation().forEach(op -> {
                System.out.println("--------------------------------");
                System.out.println(op.getType() + "\t" + op.getOperationDate() + "\t" + op.getBankAccount());

            });
        }
    }
}

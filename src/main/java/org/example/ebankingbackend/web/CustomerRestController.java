package org.example.ebankingbackend.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.ebankingbackend.entities.Customer;
import org.example.ebankingbackend.services.BankAccountService;
import org.example.ebankingbackend.services.BankAccountServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerRestController {

    private BankAccountService bankAccountService;
    @GetMapping("/customers")
    public List<Customer> customers() {
        return bankAccountService.listCustomer();
    }
}

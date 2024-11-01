package org.example.ebankingbackend.repository;

import org.example.ebankingbackend.entities.AccountOperation;
import org.example.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {

}
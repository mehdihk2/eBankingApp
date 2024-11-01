package org.example.ebankingbackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@DiscriminatorValue("SA")

public class SavingAccount extends BankAccount{
    private Double interestRate;

}

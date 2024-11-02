package org.example.ebankingbackend.dtos;

import jakarta.persistence.*;
import lombok.Data;

@Data

public class CustomerDTO {
    @Id
    private Long id;
    private String name;
    private String email;

}

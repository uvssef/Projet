package net.lamine.ebankservice.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;
import net.lamine.ebankservice.model.Customer;
import tools.jackson.databind.DatabindException;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {
    @Id
    public Long id;
    private Date createdAd;
    private double balence;
    private String type;
    private long customerId;
    @Transient // cet attribue exist dans la class mais pas representer dans la BD
    private Customer customer;
}

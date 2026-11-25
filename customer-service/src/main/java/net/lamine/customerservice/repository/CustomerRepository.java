package net.lamine.customerservice.repository;

import net.lamine.customerservice.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer , Long> {

}

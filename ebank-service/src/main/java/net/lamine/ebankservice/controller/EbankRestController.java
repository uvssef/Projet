package net.lamine.ebankservice.controller;

import net.lamine.ebankservice.entites.BankAccount;
import net.lamine.ebankservice.service.EbankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EbankRestController {
    private EbankService ebankService;

    @GetMapping("/account")
    public List<BankAccount> getAllBankAccount(){
        return ebankService.getAllBankAccount();
    }
    @GetMapping("/account/{id}")

    public BankAccount getAccountById(@PathVariable String id){
        return ebankService.getAccountById(id);
    }
@PostMapping("/account")
    public BankAccount save(BankAccount bankAccount){
        return ebankService.save(bankAccount);
    }
}

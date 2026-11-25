package net.lamine.ebankservice.service;

import net.lamine.ebankservice.entites.BankAccount;
import net.lamine.ebankservice.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbankService {
private BankAccountRepository bankAccountRepository;

    public EbankService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public List<BankAccount> getAllBankAccount(){
         return bankAccountRepository.findAll();
    }
    public BankAccount getAccountById(String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Account Not Found"));
    }

    public BankAccount save(BankAccount bankAccount){
        return bankAccountRepository.save(bankAccount);
    }

}

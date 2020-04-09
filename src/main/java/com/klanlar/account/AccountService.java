package com.klanlar.account;

import com.klanlar.account.entity.Account;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(@NonNull final Account account) {
        accountRepository.save(account);
    }

    public Account retrieveAccountById(@NonNull final Long accountId) {
        return accountRepository.findById(accountId).orElse(new Account());
    }

}

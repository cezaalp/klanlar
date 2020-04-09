package com.klanlar.account;

import com.klanlar.account.dto.CreateAccountDTO;
import com.klanlar.account.dto.RetrieveAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(value = "/createAccount")
    public void createAccount(@RequestBody final CreateAccountDTO createAccountDTO) {
        accountService.createAccount(createAccountDTO.getDomainObject());
    }

    @GetMapping(value = "/retrieveAccountById/{accountId}")
    public RetrieveAccountDTO retrieveAccountById(@PathVariable("accountId") Long accountId) {
        return new RetrieveAccountDTO(accountService.retrieveAccountById(accountId));
    }

}

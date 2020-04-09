package com.klanlar.account.dto;

import com.klanlar.account.entity.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateAccountDTO {

    private String username;
    private String password;
    private String email;

    public Account getDomainObject() {
        return new Account(username, password, email);
    }

}

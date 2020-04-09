package com.klanlar.account.dto;

import com.klanlar.account.entity.Account;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class RetrieveAccountDTO {

    private String username;
    private String password;
    private String email;
    private LocalDateTime creationTs;

    public RetrieveAccountDTO(@NonNull Account account) {
        this.username = account.getUsername();
        this.password = account.getPassword();
        this.email = account.getEmail();
        this.creationTs = account.getCreationTs();
    }
}

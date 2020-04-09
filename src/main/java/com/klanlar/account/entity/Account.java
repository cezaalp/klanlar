package com.klanlar.account.entity;

import com.klanlar.klan.Klan;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    // fetchtype bak@@@@
    @OneToOne
    @JoinColumn(name = "KLAN_ID", referencedColumnName = "KLAN_ID")
    private Klan klan;

    @Column(name = "CREATION_TS", insertable = false, updatable = false
    )
    private LocalDateTime creationTs;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

}

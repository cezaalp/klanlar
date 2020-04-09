package com.klanlar.klan;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "KLAN")
public class Klan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KLAN_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "CREATION_TS")
    private LocalDateTime creationTs;

}

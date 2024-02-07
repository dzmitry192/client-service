package com.innowise.clientservice.model.entity;

import com.innowise.clientservice.model.enums.ClientRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
@Table(name = "clients", schema = "app")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String phoneNumber;
    @NotNull
    private int drivingExp;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    @CollectionTable(
            schema = "app",
            name = "client_role",
            joinColumns = @JoinColumn(name = "client_id")
    )
    @Column(name = "role")
    private Set<ClientRole> roles;
}
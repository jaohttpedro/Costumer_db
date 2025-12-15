package com.customerhub.api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cidade;
    private boolean ativo;
}

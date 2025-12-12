package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "cliente")
public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cidade;
    private boolean ativo;
}

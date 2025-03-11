package myFirst_api.API.investimento.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Acao extends Investimento {
    private String setor;
    private double dividendo;
}



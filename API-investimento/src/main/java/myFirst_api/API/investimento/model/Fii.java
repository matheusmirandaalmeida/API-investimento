package myFirst_api.API.investimento.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fii extends Investimento {
    private String seguimento;
    private double dividendo;
}
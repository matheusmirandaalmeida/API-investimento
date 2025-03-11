package myFirst_api.API.investimento.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoDeTransacao; // "Compra" ou "Venda"
    private LocalDate data;
    private int quantidade;
    private double preco;

    @ManyToOne
    @JoinColumn(name = "investimento_id")
    private Investimento investimento;
}

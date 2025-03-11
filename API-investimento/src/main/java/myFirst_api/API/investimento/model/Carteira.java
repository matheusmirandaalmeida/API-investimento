package myFirst_api.API.investimento.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "carteira", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Investimento> investimentos;
}
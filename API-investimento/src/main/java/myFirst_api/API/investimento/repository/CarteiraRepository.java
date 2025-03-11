package myFirst_api.API.investimento.repository;

import myFirst_api.API.investimento.model.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}
package myFirst_api.API.investimento.repository;

import myFirst_api.API.investimento.model.Fii;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FiiRepository extends JpaRepository<Fii, Long> {
    List<Fii> findBySeguimento(String seguimento);
}

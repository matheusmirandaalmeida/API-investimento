package myFirst_api.API.investimento.repository;

import myFirst_api.API.investimento.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
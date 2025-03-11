package myFirst_api.API.investimento.repository;

import myFirst_api.API.investimento.model.Acao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcaoRepository extends JpaRepository<Acao, Long> {
    List<Acao> findBySetor(String setor);
}
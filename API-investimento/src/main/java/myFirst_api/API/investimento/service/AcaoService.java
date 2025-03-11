package myFirst_api.API.investimento.service;

import myFirst_api.API.investimento.model.Acao;
import myFirst_api.API.investimento.repository.AcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service // Adicione esta anotação
public class AcaoService {

    @Autowired
    private AcaoRepository repository;

    public List<Acao> listarTodos() {
        return repository.findAll();
    }

    public Acao salvarAcao(Acao acao) {
        Assert.notNull(acao, "A ação não pode ser nula");
        Assert.hasText(acao.getTicker(), "O ticker da ação é obrigatório");
        Assert.isTrue(acao.getQtd() > 0, "A quantidade deve ser maior que zero");
        return repository.save(acao);
    }

    public Optional<Acao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarAcao(Long id) {
        repository.deleteById(id);
    }
}
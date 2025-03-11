package myFirst_api.API.investimento.service;

import myFirst_api.API.investimento.model.Transacao;
import myFirst_api.API.investimento.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repository;

    public List<Transacao> findAll() {
        return repository.findAll();
    }

    public Transacao salvarTransacao(Transacao transacao) {
        return repository.save(transacao);
    }

    public Optional<Transacao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarTransacao(Long id) {
        repository.deleteById(id);
    }
}
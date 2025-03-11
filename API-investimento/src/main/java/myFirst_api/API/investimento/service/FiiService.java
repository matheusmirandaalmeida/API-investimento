package myFirst_api.API.investimento.service;

import myFirst_api.API.investimento.exeption.RecursoNaoEncontradoException;

import myFirst_api.API.investimento.model.Fii;
import myFirst_api.API.investimento.repository.FiiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiiService {

    private final FiiRepository repository;

    public FiiService(FiiRepository repository) {
        this.repository = repository;
    }

    public List<Fii> listarTodos() {
        return repository.findAll();
    }

    public Fii salvarFii(Fii fii) {
        return repository.save(fii);
    }

    public Fii buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("FII não encontrado com ID: " + id));
    }

    public void deletarFii(Long id) {
        repository.deleteById(id);
    }
}

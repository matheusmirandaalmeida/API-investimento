package myFirst_api.API.investimento.service;

import myFirst_api.API.investimento.exeption.RecursoNaoEncontradoException;
import myFirst_api.API.investimento.model.Carteira;
import myFirst_api.API.investimento.repository.CarteiraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteiraService {

    private final CarteiraRepository repository;

    public CarteiraService(CarteiraRepository repository) {
        this.repository = repository;
    }

    public List<Carteira> listarTodas() {
        return repository.findAll();
    }

    public Carteira salvarCarteira(Carteira carteira) {
        return repository.save(carteira);
    }

    public Carteira buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Carteira não encontrada com ID: " + id));
    }

    public void deletarCarteira(Long id) {
        repository.deleteById(id);
    }
}

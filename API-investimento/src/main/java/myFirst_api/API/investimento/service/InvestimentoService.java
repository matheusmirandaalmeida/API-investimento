package myFirst_api.API.investimento.service;

import myFirst_api.API.investimento.model.Investimento;
import myFirst_api.API.investimento.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class InvestimentoService {

        @Autowired
        private InvestimentoRepository repository;

        public List<Investimento> listarTodos() {
            return repository.findAll();
        }

        public Investimento salvarInvestimento(Investimento investimento) {
            return repository.save(investimento);
        }

        public Optional<Investimento> buscarPorId(Long id) {
            return repository.findById(id);
        }

        public void deletarInvestimento(Long id) {
            repository.deleteById(id);
        }
    }

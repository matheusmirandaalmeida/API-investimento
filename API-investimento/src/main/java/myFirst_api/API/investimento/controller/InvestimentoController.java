package myFirst_api.API.investimento.controller;

import myFirst_api.API.investimento.model.Investimento;
import myFirst_api.API.investimento.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoService service;

    @GetMapping
    public List<Investimento> listarInvestimentos() {
        return service.listarTodos();
    }

    @PostMapping
    public Investimento adicionarInvestimento(@RequestBody Investimento investimento) {
        return service.salvarInvestimento(investimento);
    }

    @GetMapping("/{id}")
    public Optional<Investimento> buscarInvestimento(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void removerInvestimento(@PathVariable Long id) {
        service.deletarInvestimento(id);
    }
}
package myFirst_api.API.investimento.controller;


import myFirst_api.API.investimento.model.Acao;
import myFirst_api.API.investimento.service.AcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acoes")
public class AcaoController {

    @Autowired
    private AcaoService service;

    @GetMapping
    public List<Acao> getAcao() {
        return service.listarTodos();
    }

    @PostMapping
    public Acao adicionarAcao(@RequestBody Acao acao) {
        return service.salvarAcao(acao);
    }

    @GetMapping("/{id}")
    public Optional<Acao> buscarAcao(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void removerAcao(@PathVariable Long id) {
        service.deletarAcao(id);
    }
}

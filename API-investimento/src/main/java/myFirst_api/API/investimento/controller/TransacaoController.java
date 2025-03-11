package myFirst_api.API.investimento.controller;

import myFirst_api.API.investimento.model.Transacao;
import myFirst_api.API.investimento.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @GetMapping
    public List<Transacao> listarTransacoes() {
        return service.findAll();
    }

    @PostMapping
    public Transacao adicionarTransacao(@RequestBody Transacao transacao) {
        return service.salvarTransacao(transacao);
    }

    @GetMapping("/{id}")
    public Optional<Transacao> buscarTransacao(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void removerTransacao(@PathVariable Long id) {
        service.deletarTransacao(id);
    }
}
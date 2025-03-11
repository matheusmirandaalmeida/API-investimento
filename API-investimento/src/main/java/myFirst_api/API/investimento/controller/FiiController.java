package myFirst_api.API.investimento.controller;

import myFirst_api.API.investimento.model.Fii;
import myFirst_api.API.investimento.service.FiiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fiis")
public class FiiController {

    private final FiiService service;

    public FiiController(FiiService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Fii>> listarFiis() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Fii> adicionarFii(@RequestBody Fii fii) {
        return ResponseEntity.ok(service.salvarFii(fii));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fii> buscarFii(@PathVariable Long id) {
        Fii fii = service.buscarPorId(id);
        if (fii != null) {
            return ResponseEntity.ok(fii);
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 se não encontrar o FII
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerFii(@PathVariable Long id) {
        service.deletarFii(id);
        return ResponseEntity.noContent().build();
    }
}
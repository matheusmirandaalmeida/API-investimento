package myFirst_api.API.investimento.controller;

import myFirst_api.API.investimento.model.Carteira;
import myFirst_api.API.investimento.service.CarteiraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carteira")
public class CarteiraController {

    private final CarteiraService service;

    public CarteiraController(CarteiraService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Carteira>> listarCarteiras() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Carteira> adicionarCarteira(@RequestBody Carteira carteira) {
        return ResponseEntity.ok(service.salvarCarteira(carteira));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carteira> buscarCarteira(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerCarteira(@PathVariable Long id) {
        service.deletarCarteira(id);
        return ResponseEntity.noContent().build();
    }
}
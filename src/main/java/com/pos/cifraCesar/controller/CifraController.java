package com.pos.cifraCesar.controller;

import com.pos.cifraCesar.util.CifradorCesar;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("/Cifrador")
public class CifraController {
    final com.pos.cifraCesar.service.CifraService cifradortService;

    public CifraController(com.pos.cifraCesar.service.CifraService cifraService) {
        this.cifradortService = cifraService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCrypt(@RequestBody com.pos.cifraCesar.model.CifraModel cifratModel) {
        cifratModel.setPassword(CifradorCesar.encryptacao(cifratModel.getPassword()));
        return ResponseEntity.status(HttpStatus.CREATED).body(cifradortService.save((cifratModel)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCrypt(@PathVariable(value = "id") Long id) {
        Optional<com.pos.cifraCesar.model.CifraModel> cryptModelOptional = cifradortService.findById(id);
        System.out.println(CifradorCesar.decryptacao(cryptModelOptional.get().getPassword()));
        return ResponseEntity.status(HttpStatus.OK).body(cryptModelOptional.get());
    }

}

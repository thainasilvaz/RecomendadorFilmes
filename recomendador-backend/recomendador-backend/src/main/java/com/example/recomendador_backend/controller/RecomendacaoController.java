package com.example.recomendador_backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.recomendador_backend.model.Filme;
import com.example.recomendador_backend.service.RecomendacaoService;

@RestController //"isso é uma API"
@RequestMapping("/recommend") //rota base
@CrossOrigin(origins = "http://localhost:4200") //permitindo o acesso do angular
public class RecomendacaoController {

    private final RecomendacaoService service;

    public RecomendacaoController(RecomendacaoService service) {
        this.service = service;
    }

    @PostMapping
    public List<Filme> recomendar(@RequestBody Map<String, Object> body) {

        Integer genero = (Integer) body.get("genero");
        Double nota = Double.valueOf(body.get("notaMinima").toString());
        Integer page = body.get("page") != null ? (Integer) body.get("page") : 1;

        return service.recomendar(genero, nota, page);
    }
}

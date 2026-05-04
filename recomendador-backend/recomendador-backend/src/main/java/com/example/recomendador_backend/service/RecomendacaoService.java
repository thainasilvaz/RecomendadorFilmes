package com.example.recomendador_backend.service;

import org.springframework.stereotype.Service;
import com.example.recomendador_backend.model.Filme;
import com.example.recomendador_backend.client.TMDbClient;
import java.util.*;
import java.util.stream.*;


@Service
public class RecomendacaoService {
    
    private final TMDbClient client;

    public RecomendacaoService(TMDbClient client) {
        this.client = client;
    }

    private Map<String, List<Filme>> cache = new HashMap<>();

    public List<Filme> recomendar(Integer genero, Double nota, Integer page) {

    String chave = genero + "-" + nota + "-" + page;

    // CACHE
    if (cache.containsKey(chave)) {
        return cache.get(chave);
    }

    // expandir gêneros
    List<Integer> generos = generosRelacionados(genero);

    List<Filme> filmes = new ArrayList<>();

    for (Integer g : generos) {
        String json = client.buscarFilmes(g, nota, page);
        
        // filmes.addAll(lista);
    }

    // FILTROS
    filmes = filmes.stream()
            .filter(f -> f.getPosterPath() != null)
            .filter(f -> f.getVoteAverage() >= nota)
            .collect(Collectors.toList());

    // SCORE
    filmes.sort((a, b) -> Double.compare(
            calcularScore(b),
            calcularScore(a)
    ));

    cache.put(chave, filmes);

    return filmes;
}

private List<Integer> generosRelacionados(Integer genero) {

    if (genero == 27) { // terror
        return List.of(27, 53, 9648);
    }

    if (genero == 35) { // comédia
        return List.of(35, 10749);
    }

    return List.of(genero);
}

private double calcularScore(Filme f) {

    double nota = f.getVoteAverage();
    double popularidade = f.getPopularity();

    return nota * 0.7 + popularidade * 0.3;
}

}



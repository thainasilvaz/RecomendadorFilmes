package com.example.recomendador_backend.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class TMDbClient {

    private final String API_KEY = "7599a70c3d04bd1a5033485c7f26b678";
    private final RestTemplate restTemplate = new RestTemplate();

    public String buscarFilmes(Integer genero, Double nota, Integer page) {

        String url = "https://api.themoviedb.org/3/discover/movie"
                + "?api_key=" + API_KEY
                + "&with_genres=" + genero
                + "&vote_average.gte=" + nota
                + "&page=" + page;

        return restTemplate.getForObject(url, String.class);
    }
    
}


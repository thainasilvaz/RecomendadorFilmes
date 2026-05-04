package com.example.recomendador_backend.model;

public class Filme {

    private String title;
    private Double voteAverage;
    private Double popularity;
    private String posterPath;

    // getters e setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Double getVoteAverage() { return voteAverage; }
    public void setVoteAverage(Double voteAverage) { this.voteAverage = voteAverage; }

    public Double getPopularity() { return popularity; }
    public void setPopularity(Double popularity) { this.popularity = popularity; }

    public String getPosterPath() { return posterPath; }
    public void setPosterPath(String posterPath) { this.posterPath = posterPath; }
    
}


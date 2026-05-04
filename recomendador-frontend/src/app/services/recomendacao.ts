import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})

export class Recomendacao {

    constructor(private http: HttpClient) {} //HttpClient: ferramenta do Angular para fazer requisições HTTP

    getRecomendacoes(preferencias: any) {
      const generoMap: any = {
        terror: 27,
        comedia: 35,
        acao: 28,
        drama: 18,
        romance: 10749,
        aventura: 12,
        animacao: 16,
        fantasia: 14,
        crime: 80,
        documentario: 99
    };

      const generoId = preferencias.genero;

      const url = `https://api.themoviedb.org/3/discover/movie?api_key=7599a70c3d04bd1a5033485c7f26b678&with_genres=${generoId}&vote_average.gte=${preferencias.notaMinima}`;

      return this.http.get(url);
  }

}

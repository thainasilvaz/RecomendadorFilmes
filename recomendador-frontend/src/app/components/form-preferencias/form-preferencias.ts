import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Recomendacao } from '../../services/recomendacao';
import { Resultado } from '../resultado/resultado'; //esse componente pode usar <app-resultado>
import { InputTextModule } from 'primeng/inputtext';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { ProgressSpinnerModule } from 'primeng/progressspinner';
import { SelectModule } from 'primeng/select';

@Component({
  selector: 'app-form-preferencias',
  standalone: true,
  imports: [FormsModule, CommonModule, Resultado, InputTextModule, ButtonModule, CardModule, ProgressSpinnerModule, SelectModule],
  templateUrl: './form-preferencias.html',
  styleUrl: './form-preferencias.css',
})

export class FormPreferencias {

  genero: string = '';
  notaMinima: number = 0;
  resultado: any[] = [];
  loading: boolean = false;
  erro: string = '';
  buscou: boolean = false;

  generos = [
  { label: 'Terror', value: 27 },
  { label: 'Comédia', value: 35 },
  { label: 'Ação', value: 28 },
  { label: 'Drama', value: 18 },
  { label: 'Romance', value: 10749 },
  { label: 'Aventura', value: 12 },
  { label: 'Fantasia', value: 14 },
  { label: 'Animação', value: 16 },
  { label: 'Documentário', value: 99 },
];

  constructor(private recomendacao: Recomendacao) {} //injetando o service recomendação

  enviar() {
  this.erro = ''; // limpa erro anterior
  this.buscou = true;
  this.loading = true;

  this.recomendacao.getRecomendacoes({
    genero: this.genero,
    notaMinima: this.notaMinima
  }).subscribe({ //.subscribe() executa quando a resposta chega (pois o HTTP é assíncrono)
    next: (res: any) => { //next -> quando da certo
      this.resultado = res.results;
      this.loading = false;
    },
    error: (err) => { //error -> quando da erro
      this.erro = 'Erro ao buscar recomendações';
      this.loading = false;
    }
  });
}

}






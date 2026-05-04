import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CardModule } from 'primeng/card';

@Component({
  selector: 'app-resultado',
  standalone: true,
  imports: [CommonModule, CardModule],
  templateUrl: './resultado.html',
  styleUrl: './resultado.css',
})

export class Resultado {

  @Input() resultados: any[] = []; //o @Input diz que o componente pode receber dados de fora -> o componente resultado espera receber uma lista chamada resultados

}

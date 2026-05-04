import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormPreferencias } from './components/form-preferencias/form-preferencias';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormPreferencias],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('recomendador-frontend');
}

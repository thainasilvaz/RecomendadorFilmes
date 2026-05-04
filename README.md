# 🎬 Sistema de Recomendação de Filmes

Este projeto é uma aplicação full stack desenvolvida com o objetivo de aprender e aplicar conceitos modernos de desenvolvimento web.

A aplicação permite que o usuário selecione preferências (como gênero e nota mínima) e receba recomendações de filmes com base em dados reais de uma API externa.

---

# 🚀 Tecnologias utilizadas

## Frontend

* Angular
* PrimeNG (componentes UI)
* TypeScript

## Backend

* Java (Spring Boot)
* API REST

## Outros

* Docker & Docker Compose
* API externa de filmes (ex: TMDb)

---

# 🎯 Funcionalidades

* Seleção de gênero de filmes
* Filtro por nota mínima
* Consumo de API externa
* Exibição de recomendações em tempo real
* Loading e tratamento de erros
* Interface moderna com PrimeNG

---

# 🧠 Objetivo do projeto

Este projeto foi desenvolvido com foco em aprendizado, abordando:

* Comunicação entre frontend e backend
* Consumo de APIs externas
* Organização em camadas (Controller, Service, Client)
* Uso de Docker para padronização de ambiente
* Boas práticas de desenvolvimento

---

# 🐳 Como rodar o projeto com Docker (RECOMENDADO)

## Pré-requisitos

* Docker instalado

---

## ▶️ Rodando a aplicação

Na raiz do projeto:

```bash
docker-compose up --build
```

---

## 🌐 Acessos

* Frontend: http://localhost:4200
* Backend: http://localhost:8080

---

## ⏹️ Parar a aplicação

```bash
docker-compose down
```

---

# 🛠️ Rodando sem Docker (modo desenvolvimento)

## Backend

```bash
cd recomendador-backend
./mvnw spring-boot:run
```

ou (Windows):

```bash
mvnw.cmd spring-boot:run
```

---

## Frontend

```bash
cd recomendador-frontend
npm install
ng serve
```

Acesse:

```
http://localhost:4200
```

---

# ⚙️ Configuração da API

O backend utiliza uma API externa de filmes.

Você precisa:

1. Criar uma conta no serviço de API de filmes
2. Gerar uma chave (API Key)
3. Inserir no backend (ex: TMDbClient.java)

---

# 📁 Estrutura do projeto

```
Recomendador/
 ├── recomendador-frontend/
 ├── recomendador-backend/
 ├── docker-compose.yml
```

---

# 📦 Arquitetura

* Frontend: responsável pela interface e interação com o usuário
* Backend: responsável pela lógica e consumo da API externa
* Docker: responsável por padronizar e facilitar a execução

---

# 🚀 Melhorias futuras

* Paginação de resultados
* Sistema de usuários
* Histórico de buscas
* Integração com banco de dados (PostgreSQL)
* Deploy em produção

---

# 👩‍💻 Autora

Desenvolvido por Thainá Ferreira

---

# 📌 Observações

Este projeto tem fins educacionais e foi utilizado para aprendizado de tecnologias modernas como Angular, Spring Boot e Docker.

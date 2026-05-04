FROM node:18

WORKDIR /app

COPY . .

RUN npm install
RUN npm run build

EXPOSE 4200

CMD ["npx", "http-server", "dist/recomendador-frontend"]

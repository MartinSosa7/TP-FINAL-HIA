FROM node:latest as build

# Establecer el directorio de trabajo 
WORKDIR /app

# Copiar los archivos necesarios (package.json, package-lock.json)
COPY package*.json ./

# Instalar las dependencias de Angular
RUN npm ci

RUN npm install -g @angular/cli

COPY . .

RUN npm run build --configuration=production

# Usar la imagen oficial de Nginx
FROM nginx:latest

COPY ./nginx.conf /etc/nginx/conf.d/default.conf

COPY --from=build /app/dist/frontend/browser /usr/share/nginx/html


# Exponer el puerto 80
EXPOSE 80

# Iniciar Nginx en modo foreground
CMD ["nginx", "-g", "daemon off;"]


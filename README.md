# Aplicativo de Ejemplo con Java 8 y Spring Boot MVC

Este proyecto es un aplicativo de ejemplo desarrollado utilizando Java 8 y Spring Boot MVC. Incluye la configuración de Maven, el uso del patrón MVC, MyBatis como ORM y la separación de la lógica de conexión a datos en una dependencia aparte.

## Tecnologías Utilizadas

- **Java 8**
- **Spring Boot MVC**
- **Maven** para la gestión de dependencias
- **MyBatis** como ORM
- **BD H2**

## Estructura del Proyecto

El proyecto está estructurado para seguir el patrón Modelo-Vista-Controlador (MVC) y separar la lógica de conexión a datos en una dependencia aparte.

### Módulos del Proyecto

1. **Aplicación Principal**: Contiene la lógica del negocio y las configuraciones principales del aplicativo.
2. **Conexión a Datos**: Una dependencia separada que maneja toda la lógica de conexión a la base de datos utilizando MyBatis.

## Instalación

Para construir y ejecutar este proyecto, asegúrate de tener instalado [Maven](https://maven.apache.org/install.html) y [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).


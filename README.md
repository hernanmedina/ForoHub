# Centro de API
================

El Centro de API es una API RESTful que proporciona funcionalidades de registro y desactivación de usuarios.

## Características
------------

* Registro de usuarios con cifrado de contraseña utilizando BCrypt
* Desactivación de usuarios
* API RESTful con respuestas en JSON

## Tecnologías
---------------

* Java 11
* Spring Boot 2.x
* Spring Data JPA
* Hibernate
* Cifrado de contraseña BCrypt
* Tokens JSON Web (JWT) para autenticación

## Puntos de Acceso de la API
----------------

### Registro de Usuarios

* **POST /registro**: Registrar un nuevo usuario
	+ Cuerpo de la solicitud: objeto `RegistroUsuarioDTO` con detalles del usuario (nombre, correo electrónico, contraseña, etc.)
	+ Respuesta: objeto `RespuestaUsuarioDTO` con ID y nombre del usuario

### Desactivación de Usuarios

* **DELETE /usuario/{id}/desactivar**: Desactivar un usuario por ID
	+ Variable de ruta: `id` - ID del usuario
	+ Respuesta: objeto `RegistroUsuarioDTO` con detalles del usuario

## Configuración
-------------

### Base de Datos

* Crear un esquema de base de datos para la aplicación del Centro de API
* Actualizar el archivo `application.properties` con los detalles de la conexión a la base de datos

### Ejecutar la Aplicación

* Ejecutar la aplicación utilizando `mvn spring-boot:run` o `gradle bootRun`
* Acceder a los puntos de acceso de la API utilizando un cliente REST o una herramienta como Postman

## Seguridad
------------

* La API utiliza cifrado de contraseña BCrypt para almacenar contraseñas de usuarios de manera segura
* Los tokens JWT no se implementan en este proyecto de ejemplo, pero se pueden agregar para autenticación y autorización

## Contribuciones
---------------


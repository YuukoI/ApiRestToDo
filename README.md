✅ API REST: Gestión de Tareas (To-Do List) con Swagger
Este proyecto es una API RESTful robusta desarrollada con Spring Boot para la gestión de tareas. El diferencial de este desarrollo es su enfoque en la estandarización y documentación automática, facilitando la integración con cualquier equipo de Frontend mediante Swagger.

📋 ¿Qué hace este proyecto?
Administra el ciclo de vida de tareas de productividad con una estructura profesional:

CRUD Completo: Creación, edición, borrado y consulta de tareas.

Persistencia Dinámica: Los datos se mantienen de forma segura en MySQL mediante JPA.

Documentación Interactiva: Implementación de Swagger UI que permite testear todos los endpoints desde el navegador sin herramientas externas.

Validaciones de Negocio: Control de campos obligatorios y estados de tarea para evitar inconsistencias en la DB.

🛠️ Stack Tecnológico
Backend: Java & Spring Boot.

Persistencia: Spring Data JPA / Hibernate + MySQL.

Documentación: Swagger (Springdoc-OpenAPI).

Arquitectura: Modelo de capas (Controller, Service, Repository).

📐 Ventajas de esta Implementación
Self-Documented API: Al usar Swagger, la documentación siempre está actualizada con el código.

Manejo de Respuestas: Configuración de códigos de estado HTTP (201 Created, 204 No Content, 404 Not Found) para una comunicación clara con el cliente.

Desacoplamiento: Lógica de negocio centralizada en la capa de servicios, permitiendo una fácil expansión.

🚀 Cómo probar la API
1. Clonar el repositorio.

2. Ejecutar la aplicación en tu IDE.

3. Acceder a la documentación interactiva en:http://localhost:8080/swagger-ui/index.html.

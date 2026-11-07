# AAIact1_t4

**Autora:** Ingrid Arcadio Aparicio

**Actividad:** Act1. Introducción a Spring Boot: Configuración y Primeros Controladores

## Descripción

En esta actividad configuré mi entorno de desarrollo con Java y Spring Boot, creé un proyecto con Spring Initializr y desarrollé controladores para atender peticiones web. Primero probé el proyecto en mi computadora y después lo desplegué en un VPS.

## Lo que realicé

1. Verifiqué la instalación del JDK 21 en mi computadora.
2. Configuré Visual Studio Code con las extensiones de Java y Spring Boot.
3. Creé el proyecto con Maven y las dependencias Spring Web, Thymeleaf y Spring Boot DevTools.
4. Desarrollé los ejemplos del video: una respuesta HTML y una respuesta JSON.
5. Creé mis propios controladores y endpoints.
6. Probé los endpoints en `localhost` antes de desplegarlos.
7. Generé el archivo `.jar` con Maven.
8. Instalé Java 21 en el VPS y permití el puerto 8082 en el firewall.
9. Subí el `.jar` al VPS con SCP y lo ejecuté con `nohup`.
10. Verifiqué que los endpoints respondieran desde fuera del servidor.

## Tecnologías

- Java 21
- Spring Boot 4.1.2
- Spring Web
- Thymeleaf
- Spring Boot DevTools
- Maven
- Ubuntu 24.04
- Git y GitHub

## Controladores y endpoints propios

| Controlador | Endpoint | Respuesta | Enlace |
|---|---|---|---|
| `ProyectoController` | `/proyecto` | Página HTML con el nombre del proyecto | http://179.197.82.130:8082/proyecto |
| `EstudianteRestController` | `/materias` | JSON con una lista de materias | http://179.197.82.130:8082/materias |
| `EstudianteRestController` | `/estudiante` | JSON con iniciales y semestre | http://179.197.82.130:8082/estudiante |

## Ejemplos del video

| Controlador | Endpoint | Respuesta | Enlace |
|---|---|---|---|
| `EjemploController` | `/detalles_info` | Página HTML | http://179.197.82.130:8082/detalles_info |
| `EjemploRestController` | `/detalles_info2` | JSON | http://179.197.82.130:8082/detalles_info2 |

## Ejecución local

```powershell
.\mvnw.cmd spring-boot:run
```

Después, abre http://localhost:8080/proyecto en el navegador.

## Despliegue

El proyecto corre en el VPS en el puerto **8082**:

```bash
nohup java -jar ~/iaaact1t4-0.0.1-SNAPSHOT.jar --server.port=8082 > ~/app.log 2>&1 &
```
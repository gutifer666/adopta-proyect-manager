# Adopt Junior Project Manager

Adopt Junior Project Manager es una aplicación de gestión de proyectos desarrollada con Spring Boot y H2 Database. Permite a los usuarios crear, leer, actualizar y eliminar proyectos.

## Características

- **Crear Proyectos**: Añade nuevos proyectos con nombre, descripción y fecha límite.
- **Listar Proyectos**: Visualiza todos los proyectos existentes.
- **Actualizar Proyectos**: Modifica los detalles de un proyecto existente.
- **Eliminar Proyectos**: Elimina proyectos que ya no son necesarios.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Spring Boot**: Framework para la creación de aplicaciones Java.
- **H2 Database**: Base de datos en memoria para pruebas y desarrollo.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu-usuario/adopt-junior-project-manager.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd adopt-junior-project-manager
    ```
3. Compila y ejecuta la aplicación:
    ```sh
    mvn spring-boot:run
    ```

## Uso

### Endpoints

- **GET /projects**: Obtiene todos los proyectos.
- **GET /projects/{id}**: Obtiene un proyecto por su ID.
- **POST /projects**: Crea un nuevo proyecto.
- **PUT /projects/{id}**: Actualiza un proyecto existente.
- **DELETE /projects/{id}**: Elimina un proyecto por su ID.

### Ejemplo de Proyecto

```json
{
  "name": "Nuevo Proyecto",
  "description": "Descripción del proyecto",
  "deadline": "2023-12-31"
}

# Solucionario Evalación Formativa FS1 2026-01
## CASO 1: Sistema de Gestión de Productos
### Contexto:
- Una pequeña librería necesita un servicio para administrar sus productos.
- El sistema debe permitir agregar, listar y eliminar productos, incluyendo nombre, precio y categoría.
### Requisitos mínimos:
- Datos almacenados en una lista (ArrayList o Map).
### Endpoints:
- GET /api/v1/productos → lista todos los productos.
_ POST /api/v1/productos → agrega un nuevo producto.
- DELETE /api/v1/productos/{nombre} → elimina un producto por su nombre.

Validaciones con @NotBlank, @NotNull y manejo de errores con ResponseEntity.

Trabajo Practico Traza2 correspondiente a Java Avanzado-Presencial.

Este trabajo práctico implementa un sistema de gestión de artículos y categorías en Java, aplicando colecciones y buenas prácticas de programación orientada a objetos.

El objetivo de este tp es:

  Implementar operaciones CRUD (Crear, Leer, Actualizar, Eliminar).
  Utilizar colecciones adecuadas (Set y Map) para garantizar unicidad y eficiencia.
  Aplicar Streams y Lambdas para filtrar y recorrer colecciones de forma clara.
  Asegurar un código mantenible mediante validaciones (null, listas vacías, etc.).

Las funciones principales del mismo son "Categorias" y "Articulos"

  Para categorias nos permite:
    Agregar nuevas categorías.
    Listar todas las categorías registradas.
    
  Para artículos nos permite
    Agregar artículos (insumos o manufacturados).
    Mostrar todos los insumos con sus atributos.
    Mostrar manufacturados en detalle (categoría, imágenes, insumos relacionados).
    Buscar manufacturados por ID.
    Actualizar nombre y precio de un manufacturado.
    Eliminar manufacturados por ID.

Para el Diseño
    Se crearon las clases Articulo, Categoria, Imagen, DetalleArticulo, Servicio.
    La clase ArticuloServicio que centraliza la lógica de negocio.
    Main: punto de entrada donde se crean datos de prueba y se ejecutan las operaciones.


Desarrollado por Matias Fernandez, Alumno de 3k10 Desarollo de Software

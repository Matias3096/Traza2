package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArticuloServicio servicio = new ArticuloServicio();

        //Creando categorias
        Categoria catPizzas = Categoria.builder()
                .id(1)
                .nombre("Pizza")
                .build();
        Categoria catSanguche = Categoria.builder()
                .id(2)
                .nombre("Sanguche")
                .build();
        Categoria catLomos = Categoria.builder()
                .id(3)
                .nombre("Lomos")
                .build();
        Categoria catInsumos = Categoria.builder()
                .id(4)
                .nombre("Insumo")
                .build();


        servicio.agregarCategoria(catPizzas);
        servicio.agregarCategoria(catSanguche);
        servicio.agregarCategoria(catLomos);
        servicio.agregarCategoria(catInsumos);

        //Unidad de medida (enum) ya estan disponibles: Kilogramos, litros, gramos

        //Creando articulos insumos: sal, aceite, carne, y harina (esParaelaborar = true)
        Articulo sal= Articulo.builder()
                .id(1)
                .nombre("Sal")
                .precio(890.0)
                .categoria(catInsumos).unidadMedida(UnidadMedida.KILOGRAMOS)
                .esParaElaborar(true).tipoArticulo(TipoArticulo.INSUMO)
                .build();

        Articulo aceite = Articulo.builder()
                .id(2)
                .nombre("Aceite")
                .precio(2900.0)
                .categoria(catInsumos).unidadMedida(UnidadMedida.LITROS)
                .esParaElaborar(true).tipoArticulo(TipoArticulo.INSUMO)
                .build();

        Articulo carne = Articulo.builder()
                .id(3)
                .nombre("Carne")
                .precio(7900.0)
                .categoria(catInsumos).unidadMedida(UnidadMedida.KILOGRAMOS)
                .esParaElaborar(true).tipoArticulo(TipoArticulo.INSUMO)
                .build();

        Articulo harina = Articulo.builder()
                .id(4)
                .nombre("Harina")
                .categoria(catInsumos).unidadMedida(UnidadMedida.KILOGRAMOS)
                .esParaElaborar(true).tipoArticulo(TipoArticulo.INSUMO)
                .build();

        servicio.agregarArticulo(sal);
        servicio.agregarArticulo(aceite);
        servicio.agregarArticulo(carne);
        servicio.agregarArticulo(harina);

        //Crear imagenes simulando flyer para el menu
        Imagen img1 = Imagen.builder().id(1).nombre("imagen 1").ruta("jamonCrudoYrucula.jpg").build();
        Imagen img2 = Imagen.builder().id(2).nombre("Imagen 2").ruta("Especial.jpg").build();
        Imagen img3 = Imagen.builder().id(3).nombre("imagen3").ruta("hawaina3.jpg").build();
        Imagen img4 = Imagen.builder().id(4).nombre("imagen4").ruta("lomo1.jpg").build();
        Imagen img5 = Imagen.builder().id(5).nombre("imagen5").ruta("lomo2.jpg").build();
        Imagen img6 = Imagen.builder().id(6).nombre("imagen6").ruta("lomo3.jpg").build();

        // 5) Crear detalles (solo un insumo por detalle, según enunciado)
        DetalleArticuloManufacturado detPizza1 = DetalleArticuloManufacturado.builder().id(1).cantidad(1.0).insumo(sal).build();
        DetalleArticuloManufacturado detPizza2 = DetalleArticuloManufacturado.builder().id(2).cantidad(2.0).insumo(harina).build();
        DetalleArticuloManufacturado detPizza3 = DetalleArticuloManufacturado.builder().id(3).cantidad(1.0).insumo(aceite).build();

        DetalleArticuloManufacturado detLomo1 = DetalleArticuloManufacturado.builder().id(4).cantidad(1.0).insumo(sal).build();
        DetalleArticuloManufacturado detLomo2 = DetalleArticuloManufacturado.builder().id(5).cantidad(1.0).insumo(aceite).build();
        DetalleArticuloManufacturado detLomo3 = DetalleArticuloManufacturado.builder().id(6).cantidad(1.0).insumo(carne).build();

        // 6) Crear Artículo Manufacturado Pizza Hawaina e incorporarle imágenes y detalles
        Articulo pizzaHawaina = Articulo.builder()
                .id(10)
                .nombre("Pizza Hawaina")
                .precio(850.0)
                .categoria(catPizzas)
                .unidadMedida(UnidadMedida.GRAMOS) // ejemplo: porción en gramos
                .esParaElaborar(false)
                .tipoArticulo(TipoArticulo.MANUFACTURADO)
                .build();
        pizzaHawaina.getImagenes().add(img1);
        pizzaHawaina.getImagenes().add(img2);
        pizzaHawaina.getImagenes().add(img3);
        pizzaHawaina.getDetalleArticulos().add(detPizza1);
        pizzaHawaina.getDetalleArticulos().add(detPizza2);
        pizzaHawaina.getDetalleArticulos().add(detPizza3);

        servicio.agregarArticulo(pizzaHawaina);

        // 7) Crear Artículo Manufacturado Lomo Completo e imágenes y detalles
        Articulo lomoCompleto = Articulo.builder()
                .id(11)
                .nombre("Lomo Completo")
                .precio(1200.0)
                .categoria(catLomos)
                .unidadMedida(UnidadMedida.GRAMOS)
                .esParaElaborar(false)
                .tipoArticulo(TipoArticulo.MANUFACTURADO)
                .build();
        lomoCompleto.getImagenes().add(img4);
        lomoCompleto.getImagenes().add(img5);
        lomoCompleto.getImagenes().add(img6);
        lomoCompleto.getDetalleArticulos().add(detLomo1);
        lomoCompleto.getDetalleArticulos().add(detLomo2);
        lomoCompleto.getDetalleArticulos().add(detLomo3);

        servicio.agregarArticulo(lomoCompleto);

        // ============================================================
        // RESPUESTAS A REQUERIMIENTOS: ejecución del TP en consola
        // ============================================================

        // Mostrar todas las categorías
        servicio.mostrarCategorias();

        // Mostrar todos los artículos que son insumos
        servicio.mostrarInsumos();

        // Mostrar todos los artículos que son manufacturados
        servicio.mostrarManufacturados();

        // Buscar un Artículo Manufacturado por Id
        System.out.println("\n--- BUSCAR MANUFACTURADO ID = 10 ---");
        Articulo buscado = servicio.buscarManufacturadoPorId(10);
        if (buscado != null) servicio.mostrarDetalleArticulo(buscado);
        else System.out.println("No se encontró el manufacturado con ID 10.");

        // Actualizar un Artículo Manufacturado por Id (ej: cambiar precio y nombre)
        System.out.println("\n--- ACTUALIZAR MANUFACTURADO ID = 10 ---");
        boolean actualizado = servicio.actualizarManufacturado(10, "Pizza Hawaina XL", 950.0);
        System.out.println(actualizado ? "Actualizado correctamente." : "No se pudo actualizar.");
        // Mostrar el actualizado
        Articulo actualizadoObj = servicio.buscarManufacturadoPorId(10);
        servicio.mostrarDetalleArticulo(actualizadoObj);

        // Eliminar un Artículo Manufacturado por Id
        System.out.println("\n--- ELIMINAR MANUFACTURADO ID = 11 ---");
        boolean eliminado = servicio.eliminarManufacturado(11);
        System.out.println(eliminado ? "Eliminado correctamente." : "No se pudo eliminar.");
        // Listar manufacturados luego de eliminar
        servicio.mostrarManufacturados();

    }
}

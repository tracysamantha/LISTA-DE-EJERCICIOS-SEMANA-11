public class Director {

    public void construirLibroRomance(Builder builder) {

        builder.setTitulo("mariposa");
        builder.setAutor("Kafka");
        builder.setAnioPub("2005");
        builder.setGenero("Romance");
        builder.setNumeroPag("200");
        builder.setEstadoPrestado(LibroEstado.LIBRE.toString());
        builder.setNroCap("8");
        builder.setFechaLiberacion("04/05/2025");
    }

    public void construirLibroConCapitulos(Builder builder) {
        builder.setTitulo("Diamantes y Pedernales");
        builder.setAutor("Arguedas");
        builder.setAnioPub("1954");
        builder.setGenero("Drama");
        builder.setNumeroPag("200");
        builder.setEstadoPrestado(LibroEstado.OCUPADO.toString());
        builder.setNroCap("8");
        builder.setFechaLiberacion("04/12/2024");
    }

    public void construirLibroFiccion(Builder builder) {
        builder.setTitulo("La magia de tu casa");
        builder.setAutor("Cifuentes");
        builder.setAnioPub("2021");
        builder.setGenero("Ficcion");
        builder.setNumeroPag("150");
        builder.setEstadoPrestado(LibroEstado.NO_EXISTE.toString());
        builder.setNroCap("8");
        builder.setFechaLiberacion("04/05/2025");
    }

    public void construirLibroSinCapitulos(Builder builder) {
        builder.setTitulo("Luna de Pluton");
        builder.setAutor("Dross Rotzank");
        builder.setAnioPub("2016");
        builder.setGenero("Terror");
        builder.setNumeroPag("300");
        builder.setEstadoPrestado(LibroEstado.LIBRE.toString());
        builder.setFechaLiberacion("04/05/2025");
    }
}

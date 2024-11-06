import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        LibroBuilder builderconCapitulos = new LibroBuilder();
        director.construirLibroConCapitulos(builderconCapitulos);

        LibroBuilder builderSinCapitulos = new LibroBuilder();
        director.construirLibroSinCapitulos(builderSinCapitulos);

        Libro libroConCapitulos = builderconCapitulos.getResult();
        System.out.println("Libro con capitulos");
        System.out.println(libroConCapitulos.toString());

        Libro libroSinCapitulos = builderSinCapitulos.getResult();
        System.out.println("Libro SIN capitulos");
        System.out.println(libroSinCapitulos.toString());


        /** PATRON OBSERVER*/

        GestorNotificaciones gestor=new GestorNotificaciones();

        Observer observador1 = new Observer("Tracy", "tracyhuaman@email.com","234 567 890" );
        Observer observador2 = new Observer("Lia", "liahumareda@email.com","123456789" );

        gestor.suscribirObserver("Su fecha para regresar el/los libros esta por expirar", observador1);
        gestor.suscribirObserver("Adquiere los nuevos libros!", observador2);
        gestor.suscribirObserver("Aumenta tu tiempo para regresar el libro que te llevaste!", observador1);

        Notificacion notificacion1 = new Notificacion (observador1,"Tu libro vence en 2 dias\n" );
        Notificacion notificacion2= new Notificacion (observador2,"El nuevo libro del gato con botas, llegara en solo 4 dias\n" );
        notificacion1.enviarNotificacion("Email");
        notificacion2.enviarNotificacion("Email");

        Notificador notificador = new Notificador(gestor);
        gestor.eliminarSuscripcion("Nuevos libros de Mark Anthony", observador2);

        notificador.generarEvento("Nuevos libros de Harry porter", "Se han suscrito para recibir notificaciones de la nueva saga");


        /** PATRON REPOSITORY */
        LibroRepository repositorio = new AplicarRepository();
        repositorio.guardar(libroSinCapitulos);
        repositorio.guardar(libroConCapitulos);
        List<Libro> libroEnc = repositorio.buscarPorAutor("Arguedas");

        System.out.println("Se guardo el Libro " + libroSinCapitulos.getTitulo() +" en el TXT");

    }
}
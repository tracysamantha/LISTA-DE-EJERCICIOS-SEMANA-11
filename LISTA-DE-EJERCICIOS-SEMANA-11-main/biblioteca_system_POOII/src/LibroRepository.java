import java.util.List;

/**
 *
 * @author Sofía
 */
public interface LibroRepository {
    void guardar(Libro libro);
    void buscar(Libro libro);
    List<Libro> buscarPorAutor(String autor);
    List<Libro> buscarPorGenero(String genero);
    List<Libro> obtenerTodosLosLibros();
    void actualizar(Libro libro);
}


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Sofía
 */
public class AplicarRepository implements LibroRepository {

    private List<Libro> listalibros;

    private final String archivo = "./src/libros.txt";

    @Override
    public void guardar(Libro libro) {
        try (BufferedWriter BW = new BufferedWriter(new FileWriter(archivo, false))) {
            BW.write(libro.toString());
            BW.newLine();
            System.out.println("Libro guardado: " + libro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Libro> buscarPorAutor(String autor) {

        return listalibros.stream().filter(libro->libro.getAutor().equalsIgnoreCase(autor)).collect(Collectors.toList());
    }

    @Override
    public List<Libro> buscarPorGenero(String genero) {
        return listalibros.stream().filter(libro->libro.getGenero().equalsIgnoreCase(genero)).collect(Collectors.toList());
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        List<Libro> ListaLibros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String d;
            while((d=reader.readLine())!= null){
                ListaLibros.add(Libro.fromString(d));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListaLibros;

    }

    @Override
    public void actualizar(Libro libro) {


    }

    @Override
    public void buscar(Libro libro) {

    }
    
}

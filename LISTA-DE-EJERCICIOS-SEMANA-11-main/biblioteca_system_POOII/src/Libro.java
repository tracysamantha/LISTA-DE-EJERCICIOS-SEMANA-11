public class Libro {
    protected int ID;
    protected String titulo;
    protected String autor;
    protected String anioPub;
    protected String genero;
    protected String numeroPag;
    protected String estadoPres;
    protected String nroCap;
    protected String fechaLib;


    public Libro(int ID, String titulo, String autor, String anioPub, String genero, String numeroPag, String estadoPres, String nroCap, String fechaLib) {
        this.ID = ID;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPub = anioPub;
        this.genero = genero;
        this.numeroPag = numeroPag;
        this.estadoPres = estadoPres;
        this.nroCap = nroCap;
        this.fechaLib = fechaLib;
    }

    public int getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaLib() {
        return fechaLib;
    }

    public String getNroCap() {
        return nroCap;
    }

    public String getEstadoPres() {
        return estadoPres;
    }

    public String getNumeroPag() {
        return numeroPag;
    }

    public String getGenero() {
        return genero;
    }

    public String getAnioPub() {
        return anioPub;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return    "titulo= " + titulo + "\n" +
                ", autor= " + autor + "\n" +
                ", anioPub= " + anioPub + "\n" +
                ", genero= " + genero + "\n" +
                ", numeroPag= " + numeroPag + "\n" +
                ", estadoPres= " + estadoPres + "\n" +
                ", nroCap= " + nroCap + "\n" +
                ", fechaLib= " + fechaLib + "\n";
    }

    public static Libro fromString(String line) {
        String[] data = line.split(",");
        return new Libro(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4],data[5],data[6],data[7],data[8]);
    }
}

public class LibroBuilder implements Builder{
    private int Id;
    private String titulo;
    private String autor;
    private String anioPub;
    private String genero;
    private String numPag;
    private String estadoPres;
    private String nroCap = "0";
    private String fechaLib;

    @Override
    public void setId(int Id) {
        this.Id=Id;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    @Override
    public void setAutor(String autor) {
        this.autor=autor;
    }

    @Override
    public void setAnioPub(String anioPub) {
        this.anioPub=anioPub;
    }

    @Override
    public void setGenero(String genero) {
        this.genero=genero;
    }

    @Override
    public void setNumeroPag(String numPag) {
        this.numPag=numPag;
    }

    @Override
    public void setEstadoPrestado(String estadoPres) {
        this.estadoPres=estadoPres;
    }

    @Override
    public void setNroCap(String nroCap) {
        this.nroCap=nroCap;
    }

    @Override
    public void setFechaLiberacion(String fechaLib) {
        this.fechaLib=fechaLib;
    }

    public Libro getResult(){
        return new Libro(Id, titulo, autor, anioPub, genero, numPag, estadoPres, nroCap, fechaLib);
    }
}

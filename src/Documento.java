import java.util.ArrayList;

public class Documento {

    private ArrayList<String> paginas;
    private boolean emCores;

    public Documento(ArrayList<String> paginas, boolean emCores) {
        this.paginas = paginas;
        this.emCores = emCores;
    }

    public boolean isEmCores() {
        return emCores;
    }

    public int getQuantPaginas() {
        return (paginas.size());
    }

    public String getPagina(int numeroDaPagina) {
        return paginas.get(numeroDaPagina);
    }
}

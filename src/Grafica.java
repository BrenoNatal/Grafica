import java.util.ArrayList;

public class Grafica {

    private float precoPorPaginaColorido;
    private float precoPorPaginaPB;
    private int maiorNumeroDeDocumentosImpressos = 0;
    private int numeroDaImpressora;
    private ArrayList<Impressora> listaDeImpressoras = new ArrayList<Impressora>();

    public void imprimirDocumento(Documento documento) {
        for (int i = 0; i < listaDeImpressoras.size(); i++) {
            if ((listaDeImpressoras.get(i).getQuantidadeDocumentosImpressos() < maiorNumeroDeDocumentosImpressos) || (listaDeImpressoras.get(i).getQuantidadeDocumentosImpressos() == 0) ){
                numeroDaImpressora = i;
            }
            if (listaDeImpressoras.get(i).getQuantidadeDocumentosImpressos() > maiorNumeroDeDocumentosImpressos) {
                maiorNumeroDeDocumentosImpressos = listaDeImpressoras.get(i).getQuantidadeDocumentosImpressos();
            }

        }
        listaDeImpressoras.get(numeroDaImpressora).imprimirDocumento(documento);
    }

    public float orcarImpressao(Documento documento) {
        if (documento.isEmCores()) {
            return (documento.getQuantPaginas() * precoPorPaginaColorido);
        }
        return (documento.getQuantPaginas() * precoPorPaginaPB);
    }

    public void adicionarImpressora(Impressora impressora) {
        this.listaDeImpressoras.add(impressora);
    }

    public void setPrecoPorPagina(float precoPorPagina, boolean emCores) {
        if (emCores) {
            precoPorPaginaColorido = precoPorPagina;
        }
        if (!(emCores)) {
            precoPorPaginaPB = precoPorPagina;
        }
    }
}

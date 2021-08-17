public abstract class Impressora {

    private int numeroDePapeis = 0;
    private int numeroDeDocumentosImpressos = 0;

    public boolean imprimirDocumento(Documento documento) {
        // verifica se há papel suficiente (se não houver, não imprime)
        if (documento.getQuantPaginas() > this.numeroDePapeis){
            return false;
        }


        // para cada página, manda imprimir de fato
        for (int i = 0; i < documento.getQuantPaginas(); i++) {
            executarImpressaoPagina(documento.getPagina(i));
            this.numeroDePapeis -= 1;
        }
        // incrementa o número de documentos impressos
        this.numeroDeDocumentosImpressos += 1;

        return true;
    }

    public void carregarPapel(int numeroDeFolhas) {
        this.numeroDePapeis = numeroDePapeis + numeroDeFolhas;
    }

    public int getQuantidadeFolhasRestantes() {
        return this.numeroDePapeis;
    }

    public int getQuantidadeDocumentosImpressos() {
        return this.numeroDeDocumentosImpressos;
    }

    public abstract void executarRotinaLimpeza();

    public abstract void executarImpressaoPagina(String pagina);
}

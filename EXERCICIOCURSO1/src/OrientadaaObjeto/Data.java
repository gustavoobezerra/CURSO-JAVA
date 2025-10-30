package OrientadaaObjeto;

/**
 * Representa uma data com dia, mês e ano.
 */
 class Data {
    // Atributos
    private final int ano;
    private final int mes;
    private final int dia;

    /**
     * Constrói uma nova instância de Data.
     *
     * @param dia O dia do mês.
     * @param mes O mês do ano.
     * @param ano O ano.
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Retorna a data formatada como uma string no formato "dd/mm/aaaa".
     *
     * @return A data formatada.
     */
    public String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
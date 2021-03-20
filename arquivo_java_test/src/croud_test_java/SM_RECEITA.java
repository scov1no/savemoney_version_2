package croud_test_java;

public class SM_RECEITA  extends SM_USUARIO_RECEITA{

    private String ID_RECEITA;
    private String NOME_RECEITA;
    private String VALOR_RECEITA;
    private String DESC_RECEITA;
    private String DATA_RECEITA;

    public String getID_RECEITA() {
        return ID_RECEITA;
    }

    public void setID_RECEITA(String ID_RECEITA) {
        this.ID_RECEITA = ID_RECEITA;
    }

    public String getNOME_RECEITA() {
        return NOME_RECEITA;
    }

    public void setNOME_RECEITA(String NOME_RECEITA) {
        this.NOME_RECEITA = NOME_RECEITA;
    }

    public String getVALOR_RECEITA() {
        return VALOR_RECEITA;
    }

    public void setVALOR_RECEITA(String VALOR_RECEITA) {
        this.VALOR_RECEITA = VALOR_RECEITA;
    }

    public String getDESC_RECEITA() {
        return DESC_RECEITA;
    }

    public void setDESC_RECEITA(String DESC_RECEITA) {
        this.DESC_RECEITA = DESC_RECEITA;
    }

    public String getDATA_RECEITA() {
        return DATA_RECEITA;
    }

    public void setDATA_RECEITA(String DATA_RECEITA) {
        this.DATA_RECEITA = DATA_RECEITA;
    }
}

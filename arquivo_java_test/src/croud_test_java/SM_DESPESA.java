package croud_test_java;

public class SM_DESPESA  extends SM_USUARIO_DESPESA{

    private String ID_DESPESA;
    private String NOME_DESPESA;
    private String VALOR_DESPESA;
    private String DESC_DESPESA;
    private String DATA_DESPESA;


    public String getID_DESPESA() {
        return ID_DESPESA;
    }

    public void setID_DESPESA(String ID_DESPESA) {
        this.ID_DESPESA = ID_DESPESA;
    }

    public String getNOME_DESPESA() {
        return NOME_DESPESA;
    }

    public void setNOME_DESPESA(String NOME_DESPESA) {
        this.NOME_DESPESA = NOME_DESPESA;
    }

    public String getVALOR_DESPESA() {
        return VALOR_DESPESA;
    }

    public void setVALOR_DESPESA(String VALOR_DESPESA) {
        this.VALOR_DESPESA = VALOR_DESPESA;
    }

    public String getDESC_DESPESA() {
        return DESC_DESPESA;
    }

    public void setDESC_DESPESA(String DESC_DESPESA) {
        this.DESC_DESPESA = DESC_DESPESA;
    }

    public String getDATA_DESPESA() {
        return DATA_DESPESA;
    }

    public void setDATA_DESPESA(String DATA_DESPESA) {
        this.DATA_DESPESA = DATA_DESPESA;
    }
}

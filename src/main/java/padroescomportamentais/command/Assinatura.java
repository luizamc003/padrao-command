package padroescomportamentais.command;

public class Assinatura {

    private String cliente;
    private String plano;
    private String situacao;

    public Assinatura(String cliente, String plano) {
        this.cliente = cliente;
        this.plano = plano;
    }

    public String getSituacao() {
        return situacao;
    }

    public void ativarAssinatura() {
        this.situacao = "Assinatura ativa";
    }

    public void suspenderAssinatura() {
        this.situacao = "Assinatura suspensa";
    }
}
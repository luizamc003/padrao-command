package padroescomportamentais.command;

public class SuspenderAssinaturaOperacao implements Operacao {

    private Assinatura assinatura;

    public SuspenderAssinaturaOperacao(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public void executar() {
        this.assinatura.suspenderAssinatura();
    }

    public void cancelar() {
        this.assinatura.ativarAssinatura();
    }
}
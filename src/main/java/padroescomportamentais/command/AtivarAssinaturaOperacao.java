package padroescomportamentais.command;

public class AtivarAssinaturaOperacao implements Operacao {

    private Assinatura assinatura;

    public AtivarAssinaturaOperacao(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public void executar() {
        this.assinatura.ativarAssinatura();
    }

    public void cancelar() {
        this.assinatura.suspenderAssinatura();
    }
}
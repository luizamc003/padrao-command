package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtendimentoTest {

    Atendimento atendimento;
    Assinatura assinatura;

    @BeforeEach
    void setUp() {
        atendimento = new Atendimento();
        assinatura = new Assinatura("Maria", "Premium");
    }

    @Test
    void deveAtivarAssinatura() {
        Operacao ativarAssinatura = new AtivarAssinaturaOperacao(assinatura);
        atendimento.executarOperacao(ativarAssinatura);

        assertEquals("Assinatura ativa", assinatura.getSituacao());
    }

    @Test
    void deveSuspenderAssinatura() {
        Operacao suspenderAssinatura = new SuspenderAssinaturaOperacao(assinatura);
        atendimento.executarOperacao(suspenderAssinatura);

        assertEquals("Assinatura suspensa", assinatura.getSituacao());
    }

    @Test
    void deveCancelarSuspensaoAssinatura() {
        Operacao ativarAssinatura = new AtivarAssinaturaOperacao(assinatura);
        Operacao suspenderAssinatura = new SuspenderAssinaturaOperacao(assinatura);

        atendimento.executarOperacao(ativarAssinatura);
        atendimento.executarOperacao(suspenderAssinatura);

        atendimento.cancelarUltimaOperacao();

        assertEquals("Assinatura ativa", assinatura.getSituacao());
    }

}
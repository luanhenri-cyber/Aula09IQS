package br.com.iqs.aula09;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @Test
    void aceitaEmailValido() {
        assertDoesNotThrow(() -> service.enviarEmail("aluno@exemplo.com.br"));
    }

    @Test
    void rejeitaEmailSemArroba() {
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail("alunoexemplo.com"));
    }

    @Test
    void rejeitaEmailSemDominio() {
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail("aluno@"));
    }

    @Test
    void rejeitaEmailVazio() {
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail(""));
    }

    @Test
    void rejeitaEmailNulo() {
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail(null));
    }
}

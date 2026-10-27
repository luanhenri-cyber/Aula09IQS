package br.com.iqs.aula09;

import java.util.regex.Pattern;

// Desafio Colaborativo: classe NotificacaoService com método enviarEmail()
// que valida o formato do email (regex). O envio é apenas simulado.
public class NotificacaoService {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public void enviarEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Email inválido: " + email);  // Fail fast
        }
        // Aqui entraria o envio real do email (simulado nesta atividade).
    }
}

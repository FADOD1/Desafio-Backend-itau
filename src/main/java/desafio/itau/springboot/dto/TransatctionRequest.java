package desafio.itau.springboot.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransatctionRequest {

    @NotNull
    private Double valor;

    @NotNull
    private OffsetDateTime daHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDaHora() {
        return daHora;
    }

}

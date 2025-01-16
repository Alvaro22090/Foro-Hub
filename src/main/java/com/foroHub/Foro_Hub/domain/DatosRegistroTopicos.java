package com.foroHub.Foro_Hub.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosRegistroTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        LocalDate fecha,
        @NotNull
        StatusTopico status,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}

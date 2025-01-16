package com.foroHub.Foro_Hub.domain;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        StatusTopico status,
        String curso
) {}

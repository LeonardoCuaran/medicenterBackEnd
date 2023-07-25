package com.doc.medicenter.models;

import com.doc.medicenter.enums.Especialidad;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("citaMedica")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CitaMedica{

    @Id
    private Long id;

    @NotNull
    private Long pacienteIdentification;

    @NotNull
    private Especialidad especialidades;

    @NotNull
    private Long doctorId;

    @NotNull
    private Long pacienteId;
}

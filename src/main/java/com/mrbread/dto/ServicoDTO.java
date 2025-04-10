package com.mrbread.dto;

import com.mrbread.domain.model.Status;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServicoDTO {
    private UUID id;
    private String nomeServico;
    private String descricao;
    private BigDecimal precoBase;
    private UUID organizacaoId;
    private Status status;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
}

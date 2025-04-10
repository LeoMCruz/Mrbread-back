package com.mrbread.dto;

import com.mrbread.domain.model.PerfilAcesso;
import com.mrbread.domain.model.Status;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrgUserDTO {
    private UUID id;
    private String username;
    private String nome;
    private Status status;
    private PerfilAcesso perfilAcesso;
    private String nomeOrganizacao;
    private UUID organizacaoId;
    private String cnpj;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
}

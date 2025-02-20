package com.mrbread.dto;

import com.mrbread.domain.model.PerfilAcesso;
import com.mrbread.domain.model.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    @NotBlank(message = "A senha é obrigatória")
    private String password;
    @NotBlank(message = "O email é obrigatório")
    private String username;
    @NotBlank(message = "O nome é obrigatório")
    private String nome;
    private Status status;
    private PerfilAcesso perfilAcesso;
    private UUID organizacaoId;
    private String nomeOrganizacao;
    @Pattern(regexp = "^(\\d{2})\\.(\\d{3})\\.(\\d{3})\\/\\d{4}\\-\\d{2}$",
            message = "CNPJ inválido. O formato deve ser XX.XXX.XXX/XXXX-XX")
    private String cnpj;
}

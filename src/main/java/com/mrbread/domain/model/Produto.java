package com.mrbread.domain.model;

import jakarta.persistence.*;
import jdk.jfr.Registered;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto implements PertenceOrganizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String nomeProduto;
    @Column
    private String descricao;
    @Column
    private BigDecimal precoBase;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organizacao_id", referencedColumnName = "idOrg")
    private Organizacao organizacao;
    @Column
    private Status status;
    @Column
    private LocalDateTime dataCriacao;
    @Column
    private LocalDateTime dataAlteracao;
}

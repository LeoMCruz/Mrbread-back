package com.mrbread.domain.repository;

import com.mrbread.domain.model.Produto;
import com.mrbread.domain.model.Servico;
import com.mrbread.domain.model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface ServicoRepository extends PertenceOrganizacaoRespository<Servico, UUID> {
    @Query("select e from Servico e where " +
            "e.organizacao.idOrg = :organizacaoId and e.status = com.mrbread.domain.model.Status.ATIVO " +
            " and e.nomeServico like :search")
    Optional<Servico> findByName(UUID organizacaoId, String search);
}

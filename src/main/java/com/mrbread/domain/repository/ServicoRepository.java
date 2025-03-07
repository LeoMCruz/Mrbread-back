package com.mrbread.domain.repository;

import com.mrbread.domain.model.Produto;
import com.mrbread.domain.model.Servico;
import com.mrbread.domain.model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ServicoRepository extends PertenceOrganizacaoRespository<Servico, UUID> {
//    Page<Servico> findByOrganizacaoIdOrgAndStatus(UUID organizacaoId, Status status, Pageable pageable);
}

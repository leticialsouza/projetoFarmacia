package org.generation.farmacia.repository;

import java.util.List;

import org.generation.farmacia.model.produtoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produtoRepository extends JpaRepository<produtoModel, Long> {
	
	public List<produtoModel> findAllByNomeContainingIgnoreCase(String nome);

}

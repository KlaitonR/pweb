package br.unisul.pweb.quarta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.unisul.pweb.quarta.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepositoryImplementation<Estado, Integer>{
	
	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByNome();
	
	List<Estado> findDistinctByNomeContainingOrderByNome(String nome);

}

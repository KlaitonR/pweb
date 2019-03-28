package br.unisul.pweb.quarta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.transaction.annotation.Transactional;

import br.unisul.pweb.quarta.domain.Estado;

public interface EstadoRepository extends JpaRepositoryImplementation<Estado, Integer>{
	
	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByNome();

}

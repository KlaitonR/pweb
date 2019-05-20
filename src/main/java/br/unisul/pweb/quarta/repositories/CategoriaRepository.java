package br.unisul.pweb.quarta.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import br.unisul.pweb.quarta.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepositoryImplementation<Categoria, Integer>{

	List<Categoria> findDistinctByNomeContainingOrderByNome(String nome);
	
}

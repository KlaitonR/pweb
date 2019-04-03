package br.unisul.pweb.quarta.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import br.unisul.pweb.quarta.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepositoryImplementation<Categoria, Integer>{

}

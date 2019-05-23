package br.unisul.pweb.quarta.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unisul.pweb.quarta.domain.Cidade;
import br.unisul.pweb.quarta.domain.Estado;
import br.unisul.pweb.quarta.repositories.CidadeRepository;
import br.unisul.pweb.quarta.repositories.EstadoRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository rep;
	
	@Autowired
	private EstadoService estadoService;
	
	@Autowired
	private EstadoRepository estadoRepository;

	public List<Cidade> findByEstado(Integer estadoId) {
		return rep.findCidades(estadoId);
	}
	
	//BUSCAR POR ID
	public Cidade find (Integer id) {
	 Optional<Cidade> obj = rep.findById(id);
	 return obj.orElse(null);
	}
	
	public Estado buscar(Integer id) {
		Optional<Estado> obj = estadoRepository.findById(id);
		return obj.orElse(null);
	}

	//INSERIR
	public Cidade insert (Cidade obj) {
		obj.setId(null);
		obj.setEstado(estadoService.find(obj.getEstado().getId()));
		obj = rep.save(obj);
		return obj;
	}

	//ATUALIZAR
	public Cidade update (Cidade obj) {
	 find(obj.getId());
	 return rep.save(obj);
	}

	//DELETAR
	public void delete (Integer id) {
	 find(id);
	 rep.deleteById(id);
	}

	//LISTAR TODAS
	 public List<Cidade> findAll(){
	  return rep.findAll();
	 }
	 
	 //LISTAR POR NOME(FILTRAR)
	 public List<Cidade> buscaPorNome(String nome){
		 return rep.findDistinctByNomeContainingOrderByNome(nome);
	 }
	
}

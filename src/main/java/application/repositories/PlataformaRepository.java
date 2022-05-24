package application.repositories;

import org.springframework.data.repository.CrudRepository;

import application.models.Jogo;

public interface PlataformaRepository extends CrudRepository<Plataforma,Integer>{
    
}
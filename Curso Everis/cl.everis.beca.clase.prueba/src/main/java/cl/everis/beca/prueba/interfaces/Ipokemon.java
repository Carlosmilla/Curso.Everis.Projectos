package cl.everis.beca.prueba.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cl.everis.beca.prueba.models.Pokemon;

@Repository
public interface Ipokemon {
	
	/**
	 * Declaracion de metodo borrar
	 * @param id
	 */
	@Transactional
	public void borrarPorId(Long id);


}

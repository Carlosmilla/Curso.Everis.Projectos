package cl.everis.beca.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.everis.beca.models.Persona;


public interface Ipersona extends JpaRepository<Persona, Long>{



}

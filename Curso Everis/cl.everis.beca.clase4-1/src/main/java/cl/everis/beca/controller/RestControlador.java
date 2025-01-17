package cl.everis.beca.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import cl.everis.beca.interfaces.Ipersona;
import cl.everis.beca.models.Persona;

import cl.everis.beca.services.PersonaService;


@RestController
@RequestMapping("/Persona")
public class RestControlador {

	@Autowired
	private Ipersona personaRepo;
	
	@Autowired
	private PersonaService persoService;
	
	@GetMapping(value = "/agregarPersona", produces = "application/json")
	public ResponseEntity<Persona> agregar(@RequestParam String nombre, @RequestParam String rut, @RequestParam Integer edad) {
		Persona persona = new Persona();
		persona.setSNombre(nombre);
		persona.setRut(rut);
		persona.setEdad(edad);
		return new ResponseEntity<Persona>(personaRepo.save(persona), HttpStatus.OK);
	}
	
	@GetMapping(value = "/findById", produces = "application/json")
	public ResponseEntity<Optional<Persona>> findById(@RequestParam Long id) {
		return new ResponseEntity<Optional<Persona>>(personaRepo.findById(id) , HttpStatus.OK);
	}
	
	@GetMapping(value = "/findAll", produces = "application/json")
	public ResponseEntity<List<Persona>> findById() {
		return new ResponseEntity<List<Persona>>(personaRepo.findAll() , HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteById", produces = "application/json")
	public ResponseEntity<Object> delteById(Long id) {
		persoService.borrarPorId(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value = "/ordenarPersona", produces = "application/json")
	public ResponseEntity<List<Persona>> listarPersona(@RequestParam boolean upOrder){ // parametro boolean 
        if(!upOrder) { // condicional 
    		return new ResponseEntity<List<Persona>>(personaRepo.findAll(Sort.by("nombre").descending()), HttpStatus.OK); // si boolean = true el orden es ascendente
		}else {
			return new ResponseEntity<List<Persona>>(personaRepo.findAll(Sort.by("nombre").ascending()), HttpStatus.OK); // si boolean = false el orden es descendente
		}
	}
	
	
}

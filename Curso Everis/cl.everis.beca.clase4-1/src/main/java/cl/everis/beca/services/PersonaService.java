package cl.everis.beca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.everis.beca.interfaces.Ipersona;
import cl.everis.beca.interfaces.IpersonaService;
import cl.everis.beca.models.Persona;

@Service
public class PersonaService implements IpersonaService{

	@Autowired
	private Ipersona data;
	
	@Override
	public List<Persona> listar() {
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarPorId(Long id) {
		return data.findById(id);
	}

	@Override
	public int guardar(Persona p) {
		int res = 0;
		Persona persona = data.save(p);
		if(!persona.equals(null)) {
			res = 1;
		}
		return res;
	}
	

	@Override
	public void borrarPorId(Long id) {
		data.deleteById(id);
	}

	



}

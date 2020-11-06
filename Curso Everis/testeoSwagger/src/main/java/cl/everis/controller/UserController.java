package cl.everis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.everis.Dto.UserDTO;

@RestController
public class UserController {

	private List<UserDTO> users = new ArrayList<>();
	
	public UserController() {
		users.add(new UserDTO(1L, "admin"));
		users.add(new UserDTO(2L, "admin2"));
		users.add(new UserDTO(3L, "admin3"));
	}
	
	@GetMapping(value = "users")
	public ResponseEntity<List<UserDTO>> findAll(){
		return ResponseEntity.ok(users); 
	}

	/**
	 * 
	 * @param request
	 * @return
	 */
	@PutMapping(value = "users")
	public ResponseEntity<UserDTO> update(UserDTO request) {
		UserDTO user = users.stream()
				.filter(currentUser -> currentUser.getId() == request.getId())
				.findFirst()
				.orElseThrow(() -> new RuntimeException("no existe el usuario"));
		user.setName(request.getName());
		return ResponseEntity.ok(user);		
	}
	
	@PostMapping(value = "users")
	public ResponseEntity<UserDTO> create(UserDTO request){
		users.add(request);
		return ResponseEntity.ok(request);
	}
	
	@DeleteMapping(value = "users/{userId}")
	public ResponseEntity<?> delete( @PathVariable("userId") long userId ) {
		UserDTO user = users.stream()
		.filter(currentUser -> currentUser.getId() == userId)
		.findFirst()
		.orElseThrow(() -> new RuntimeException("No existe el usuario"));
		users.remove(user);
		return ResponseEntity.ok().build();
		
	}
	
}

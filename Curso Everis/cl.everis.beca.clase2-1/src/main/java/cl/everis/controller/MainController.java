package cl.everis.controller;

import org.springframework.stereotype.Controller;

import cl.everis.service.ImplementService;

/**
 * Main Controller
 * @author Carlos
 *
 */
@Controller
public class MainController {

	public static void main (String[] args) {
		
		ImplementService iser = new ImplementService();
		
		iser.suma(2, 2);
		iser.resta(4, 2);
		iser.Multiplicacion(2, 2);
		iser.division(2, 2);
	}
}

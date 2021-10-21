package applibreria3.appAnimal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import starter3.libreria3.config.AnimalProperties;


@RestController
public class AnimalController {
	
@Autowired AnimalProperties ap;
	
	@GetMapping("/")
	public String saludo() {
		
		
		
		
		return "Animal Api";
		
		
	}
	@GetMapping("/raza")
	public String  getRaza() {
		
		
		
		System.out.println(ap.getRaza());
		return ap.getRaza();
		
		
	}
	
	
	

}

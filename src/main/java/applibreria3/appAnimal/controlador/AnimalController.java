package applibreria3.appAnimal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import starter3.libreria3.config.AnimalProperties;

@RestController
public class AnimalController {
	
@Autowired AnimalProperties ap;
	
	@GetMapping("/")
	public String  getNombre() {
		
		
		
		System.out.println(ap.getRaza());
		return ap.getRaza();
		
		
	}

}

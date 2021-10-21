package applibreria3.appAnimal.controlador;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RestControllerEndpoint(id="endPointCustomizado")
public class CustomEndpoint {

	
	@GetMapping("/animal")
	public ResponseEntity<String> endPointCustomizado(){
		
		return new ResponseEntity<>("Hola desde el endpoint customizado", HttpStatus.OK);
		
	}
	
	@ResponseBody
	@GetMapping("/animal/{id}")
	public String prueba(@PathVariable int id) {
		
		String respuesta = "Animal con id: " + id;
		return respuesta;
		
	}
	
	
	
	
}
	
	

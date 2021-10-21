package applibreria3.appAnimal.actuators;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RestControllerEndpoint(id="segundoEndPointCustomizado")
public class CustomActuators {

	@GetMapping("/")
	public ResponseEntity<String> endPointCustomizado(){
		
		return new ResponseEntity<>("Hola desde el endpoint customizado aleatorio", HttpStatus.OK);
		
	}
	
	@ResponseBody
	@GetMapping("/aleatorio/{id}")
	public String prueba(@PathVariable int id) {
		
		String respuesta = "Animal con id: " + id;
		return respuesta;
		
	}
	@GetMapping("/aleatorio/{nombre}")
	public String prueba(@PathVariable String nombre) {
		
		String respuesta = "Hola: " + nombre;
		return respuesta;
		
	}
	
	
	
}
package applibreria3.appAnimal.controlador;

import java.util.*;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id= "estados")
public class CustomEndPoint2 {
	
	private List<String> listado = new ArrayList<>();
	
	@ReadOperation
	public List<String> estados(){
		return listado;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String estadoNuevo){
		listado.add(estadoNuevo);
		
	}
	
	@ReadOperation
	public void deleteOperation(@Selector String estadoBorrar){
		listado.remove(estadoBorrar);
	}
	
	

}

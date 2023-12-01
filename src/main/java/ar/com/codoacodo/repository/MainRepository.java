package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainRepository {

	 public static void main(String[] args) {
		
		 //Interface i = new ClaseQueImplementa();
		 OradorRepository repository = new MysqlOradorRepository();
		 
		 Orador carlos =repository.getById(3L);
		 
		 carlos.setApellido("perez");
		 carlos.setNombre("martin");
		 carlos.setTema("c#");
		 
		 repository.update(carlos);
		 
		 System.out.println(repository.findAll());
		 
	}
}
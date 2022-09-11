package backendclase25;

import backendclase25.bd.BD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendClase25Application {

	public static void main(String[] args) {
		BD.crearTablas();
		SpringApplication.run(BackendClase25Application.class, args);
	}

}

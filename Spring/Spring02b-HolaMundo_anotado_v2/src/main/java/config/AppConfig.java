package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.HolaMundoServiceImpl;
import service.HolaMundoService;
 
@Configuration
public class AppConfig {
	
	// Fijate que en esta version declaro aquí los beans
    @Bean(name="HOLAMUNDO")
    //En Spring 4 existe una anotacion llamada @Description
    public HolaMundoServiceImpl helloWorld() {
    	//Y aqui aplico logica de negocio para buscar la solucion ms adecuada
        return new HolaMundoServiceImpl();
    }

}


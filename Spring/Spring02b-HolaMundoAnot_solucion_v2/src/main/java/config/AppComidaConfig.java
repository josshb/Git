package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.ComidaServiceImpl;
import service.ComidaService;
 
//Le indicamos que es un fichero de configuraci�n
@Configuration
public class AppComidaConfig {
	
    @Bean(name="ENDOCRINO")
    //En Spring 4 existe una anotacion llamada @Description
    public ComidaService dameComida() {
        return new ComidaServiceImpl();
    }

}


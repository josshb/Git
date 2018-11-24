package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import model.Estudiante;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource(value="classpath:valores.properties")
public class AppConfig {

    @Value("#{'${estudiante.nombre}'.split(',')}")
    private List<String> nombres;
    @Value("#{'${estudiante.edad}'.split(',')}")    
    private List<Integer> edades;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

	public List<String> getNombres() {
		return nombres;
	}


	public List<Integer> getEdades() {
		return edades;
	}
	
	public List<Estudiante> getListaStudents() {
		//Tengo que montar la lista	
		//El problema es que las propiedades las cojo como listas sueltas
		//Y si quiero tener un listado e objetos... 
		//No estoy muy orgulloso de este código...
		//pero esta es una forma de hacerlo
		List<Estudiante> listaStudents = new ArrayList<>();
		for (int i= 0;i< nombres.size();i++){
			listaStudents.add(new Estudiante(nombres.get(i),edades.get(i)));
		}
		return listaStudents;
	}

}

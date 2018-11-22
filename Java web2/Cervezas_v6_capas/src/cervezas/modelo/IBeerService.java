package cervezas.modelo;

import java.util.List;

import cervezas.domain.Cerveza;

public interface IBeerService {
	
    public List<Cerveza> getBrands(String color);

}

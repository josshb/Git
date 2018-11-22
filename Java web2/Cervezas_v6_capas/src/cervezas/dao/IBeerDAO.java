package cervezas.dao;

import java.util.List;
import cervezas.domain.Cerveza;

public interface IBeerDAO {
	
	public List<Cerveza> getBrands(String color);

}

package cervezas.modelo;

import java.util.List;

import cervezas.dao.BeerDAO;
import cervezas.dao.IBeerDAO;
import cervezas.domain.Cerveza;

public class BeerService implements IBeerService {
	
	private IBeerDAO BeerDAO = new BeerDAO();
	
    public List<Cerveza> getBrands(String color) {
       return BeerDAO.getBrands(color);
    }

}

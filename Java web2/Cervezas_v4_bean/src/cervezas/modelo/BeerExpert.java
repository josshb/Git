package cervezas.modelo;

import java.util.*;

import cervezas.domain.Cerveza;

public class BeerExpert {

    public List<Cerveza> getBrands(String color) {
        List<Cerveza> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add(new Cerveza("Jack Amber"));
            brands.add(new Cerveza("Red Moose"));
        } else {
            brands.add(new Cerveza("Jail Pale Ale"));
            brands.add(new Cerveza("Gout Stout"));
        }
        return (brands);
    }
}
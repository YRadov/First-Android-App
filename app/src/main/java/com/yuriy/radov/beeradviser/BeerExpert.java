package com.yuriy.radov.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("light")) {
            brands.add("light Jack Amber");
            brands.add("light Red Moose");
            brands.add("light Ordinary Bitter");
            brands.add("light Blonde Ale");
        } else if (color.equals("amber")) {
            brands.add("amber Jack Amber");
            brands.add("amber Red Moose");
            brands.add("amber Ordinary Bitter");
            brands.add("amber Blonde Ale");
        } else if (color.equals("brown")) {
            brands.add("brown Jack Amber");
            brands.add("brown Red Moose");
            brands.add("brown Ordinary Bitter");
            brands.add("brown Blonde Ale");
        } else if (color.equals("dark")) {
            brands.add("dark Jack Amber");
            brands.add("dark Red Moose");
            brands.add("dark Ordinary Bitter");
            brands.add("dark Blonde Ale");
        }

        return brands;
    }

}

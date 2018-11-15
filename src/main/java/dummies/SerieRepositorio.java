package dummies;

import model.Serie;

import java.util.ArrayList;
import java.util.List;

public class SerieRepositorio {
    private List<Serie> series = new ArrayList<>();

    public SerieRepositorio(){
        //0
        Serie serie1 = new Serie("Game of Thrones", "7", "Vista");

        //1
        Serie serie2 = new Serie("Stranger Things", "2", "Vista");

        //2
        Serie serie3 = new Serie("Breaking Bad", "5", "Pendiente");

        //3
        Serie serie4 = new Serie("The Last Kingdom", "2", "Vista");

        //4
        Serie serie5 = new Serie("Vikings", "4", "Mirando");

        //5
        Serie serie6 = new Serie("Daredevil", "3", "Mirando");

        //6
        Serie serie7 = new Serie("The Defenders", "2", "Pendiente");

        //7
        Serie serie8 = new Serie("Iron Fist", "2", "Pendiente");

        //8
        Serie serie9 = new Serie("La Casa de Papel", "2", "Mirando");

        //9
        Serie serie10 = new Serie("Black Mirrow", "4", "Vista");

        //10
        Serie serie11 = new Serie("Merli", "3", "Vista");

        series.add(serie1);series.add(serie2);series.add(serie3);
        series.add(serie4);series.add(serie5);series.add(serie6);
        series.add(serie7);series.add(serie8);series.add(serie9);
        series.add(serie10);series.add(serie11);
    }

    public List<Serie> getSeries() { return series; }
}
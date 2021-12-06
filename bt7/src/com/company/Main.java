package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movies> listMovies = new ArrayList<>();
        Movies m = new Movies(1, "Venom", "Action", 129, "Andy Serkis", 2021);
        listMovies.add(m);
        listMovies.add(new Movies(2, "Sieu quay", "Comedy", 94, "Gray", 2020));
        listMovies.add(new Movies(3, "Red Notice", "Action", 115, "Rawson", 2021));
        listMovies.add(new Movies(4, "The Cursed", "Horror", 110, "Yong Wan", 2021));
        listMovies.add(new Movies(5, "Conan", "Anime", 120, "Gosho", 2020));


        for (Movies movies : listMovies){
            System.out.println(movies);
        }

        String str = "Action";
        System.out.println("Danh sach phim hanh dong: ");
        for (int i = 0; i < listMovies.size(); i++ ){
            if(listMovies.get(i).getType().toLowerCase().equals(str.toLowerCase())){
                System.out.println(listMovies.get(i));
            }
        }

    }
}

package ru.netology.domain;

public class MovieManager {

    private Movie[] films = new Movie[0];
    private int limit;

    public MovieManager() {
        limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }


    public void add(Movie film) {

        Movie[] tmp = new Movie[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Movie[] findAll() {

        return films;
    }

    public Movie[] findLast() {
        Movie[] ans;
        if (limit < films.length) {
            ans = new Movie[limit];
        } else {
            ans = new Movie[films.length];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = films[films.length - i - 1];
        }
        return ans;

    }

}

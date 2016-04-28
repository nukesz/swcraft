package org.swcraft.java8.data;

public class Movie {

    private final String title;
    private final int duration;
    private final int releaseYear;

    public Movie(String title, int duration, int releaseYear) {
        this.title = title;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", duration=" + duration + ", releaseYear=" + releaseYear + "]";
    }

}

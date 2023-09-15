package org.example.FileSystemWithoutComposite;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        File border = new File("Border");
        movieDirectory.add(border);

        Directory horrorMovieDirectory = new Directory("Horror Movie");
        File exorcist = new File("Exorcist");
        horrorMovieDirectory.add(exorcist);
        File nun = new File("Nun");
        horrorMovieDirectory.add(nun);

        movieDirectory.add(horrorMovieDirectory);

        movieDirectory.ls();

    }
}

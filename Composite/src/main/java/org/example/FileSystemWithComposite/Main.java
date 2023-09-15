package org.example.FileSystemWithComposite;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        FileSystem border = new File("Border");
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

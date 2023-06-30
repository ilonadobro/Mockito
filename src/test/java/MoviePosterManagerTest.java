import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterManagerTest {

    @Test
    public void findLastTest() {
        MoviePosterManager movieManager = new MoviePosterManager();

        movieManager.add("Titanic");
        movieManager.add("Trolls");
        movieManager.add("Notebook");

        String[] expected = {"Notebook", "Trolls", "Titanic"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithCountTest() {
        MoviePosterManager movieManager = new MoviePosterManager(5);

        movieManager.add("Titanic");
        movieManager.add("Trolls");
        movieManager.add("Notebook");
        movieManager.add("Home");
        movieManager.add("Hotel");
        movieManager.add("Ocean");
        movieManager.add("Beach");

        String[] expected = {"Beach", "Ocean", "Hotel", "Home", "Notebook"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovieTest() {
        MoviePosterManager movieManager = new MoviePosterManager();
        movieManager.add("Notebook");

        String[] expected = {"Notebook"};
        String[] actual = movieManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}

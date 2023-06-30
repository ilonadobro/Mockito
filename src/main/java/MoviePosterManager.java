public class MoviePosterManager {

    private String[] movies = new String[0];
    private int moviesCount;

    public MoviePosterManager() {
        this.moviesCount = 5;
    }

    public MoviePosterManager(int moviesCount) {
        this.moviesCount = moviesCount;
    }

    public void add(String name) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = name;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (moviesCount > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = moviesCount;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }


}


public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int defaultPosterLength = 10;

    PosterManager() {
    }

    public PosterManager(int posterLength) {
        if (posterLength > 0) {
            defaultPosterLength = posterLength;
        }
    }

    public void addPoster(Poster poster) {
        int length = posters.length + 1;
        Poster[] tmp = new Poster[length];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        int lastPoster = tmp.length - 1;
        tmp[lastPoster] = poster;
        posters = tmp;
    }

    public Poster[] getLastPoster() {
        int moviesLength = posters.length;
        if (moviesLength < defaultPosterLength) {
            defaultPosterLength = moviesLength;
        }
        Poster[] customFilm = new Poster[defaultPosterLength];
        for (int i = 0; i < customFilm.length; i++) {
            int result = moviesLength - i - 1;
            customFilm[i] = posters[result];
        }
        return customFilm;
    }
}


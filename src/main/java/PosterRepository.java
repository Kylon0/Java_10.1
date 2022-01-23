public class PosterRepository {
    private Poster[] film = new Poster[0];
    private int showLength = 10;

    public void add(Poster poster) {
        int length = film.length + 1;
        Poster[] tmp = new Poster[length];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        film = tmp;
    }

    public Poster[] getAll() {
        Poster[] result = new Poster[showLength];
        for (int i = showLength - 1; i > -1; i--) {
            int index = film.length - i - 1;
            result[i] = film[index];
        }
        return result;
    }

    public Poster[] getAll2(int posterLength) {
        Poster[] result = new Poster[posterLength];
        for (int i = posterLength - 1; i > -1; i--) {
            int index = film.length - i - 1;
            result[i] = film[index];
        }
        return result;
    }
}


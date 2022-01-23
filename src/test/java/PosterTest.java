import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PosterTest {

    @Test
    public void setPoster() {
        Poster first = new Poster(1, "Имя1", "Жанр1");
        Poster second = new Poster(2, "Имя2", "Жанр2");
        Poster third = new Poster(3, "Имя3", "Жанр3");
        Poster fourth = new Poster(4, "Имя4", "Жанр4");
        Poster fifth = new Poster(5, "Имя5", "Жанр5");
        Poster sixth = new Poster(6, "Имя6", "Жанр6");
        Poster seventh = new Poster(7, "Имя7", "Жанр7");
        Poster eighth = new Poster(8, "Имя8", "Жанр8");
        Poster ninth = new Poster(9, "Имя9", "Жанр9");
        Poster tenth = new Poster(10, "Имя10", "Жанр10");

        PosterRepository repo = new PosterRepository();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);
        repo.add(tenth);

        Poster[] actual = repo.getAll();
        Poster[] expected = new Poster[]{tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void setPoster2() {
        Poster first = new Poster(1, "Имя1", "Жанр1");
        Poster second = new Poster(2, "Имя2", "Жанр2");
        Poster third = new Poster(3, "Имя3", "Жанр3");
        Poster fourth = new Poster(4, "Имя4", "Жанр4");
        Poster fifth = new Poster(5, "Имя5", "Жанр5");
        Poster sixth = new Poster(6, "Имя6", "Жанр6");
        Poster seventh = new Poster(7, "Имя7", "Жанр7");
        Poster eighth = new Poster(8, "Имя8", "Жанр8");
        Poster ninth = new Poster(9, "Имя9", "Жанр9");
        Poster tenth = new Poster(10, "Имя10", "Жанр10");

        PosterRepository repo = new PosterRepository();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);
        repo.add(tenth);

        Poster[] actual = repo.getAll2(4);
        Poster[] expected = new Poster[]{tenth,ninth,eighth,seventh};
        assertArrayEquals(expected,actual);
    }
}
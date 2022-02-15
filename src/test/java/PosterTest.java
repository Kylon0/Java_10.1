import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {

    PosterManager manager = new PosterManager();

    private Poster first = new Poster(1, "First", "1");
    private Poster second = new Poster(2, "Second", "2");
    private Poster third = new Poster(3, "Third", "3");
    private Poster fourth = new Poster(4, "Fourth", "4");
    private Poster fifth = new Poster(5, "Fifth", "5");
    private Poster sixth = new Poster(6, "Sixth", "6");
    private Poster seventh = new Poster(7, "Seventh", "7");
    private Poster eighth = new Poster(8, "Eighth", "8");
    private Poster ninth = new Poster(9, "Ninth", "9");
    private Poster tenth = new Poster(10, "Tenth", "10");

    Poster[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};


    @Test
    void PosterTest1() {
        PosterManager manager = new PosterManager(10);
        manager.addPoster(first);
        manager.addPoster(second);
        manager.addPoster(third);
        manager.addPoster(fourth);
        manager.addPoster(fifth);
        manager.addPoster(sixth);
        manager.addPoster(seventh);
        manager.addPoster(eighth);
        manager.addPoster(ninth);
        manager.addPoster(tenth);
        Poster[] actual = manager.getLastPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    void PosterTest2() {
        PosterManager manager = new PosterManager(0);
        Poster[] actual = manager.getLastPoster();
        Poster [] expected = new Poster[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    void PosterTest3() {
        PosterManager manager = new PosterManager(5);
        manager.addPoster(first);
        manager.addPoster(second);
        manager.addPoster(third);
        manager.addPoster(fourth);
        manager.addPoster(fifth);
        manager.addPoster(sixth);
        manager.addPoster(seventh);
        manager.addPoster(eighth);
        manager.addPoster(ninth);
        manager.addPoster(tenth);
        Poster movieToAdd = new Poster(11, "Eleventh", "11");
        manager.addPoster(movieToAdd);
        Poster[] actual = manager.getLastPoster();
        Poster[] expected = {movieToAdd, tenth, ninth, eighth, seventh};
        assertArrayEquals(actual,expected);
    }

    @Test
    void PosterTest4() {
        PosterManager manager = new PosterManager(11);
        manager.addPoster(first);
        manager.addPoster(second);
        manager.addPoster(third);
        manager.addPoster(fourth);
        manager.addPoster(fifth);
        manager.addPoster(sixth);
        manager.addPoster(seventh);
        manager.addPoster(eighth);
        manager.addPoster(ninth);
        manager.addPoster(tenth);
        Poster[] actual = manager.getLastPoster();
        assertArrayEquals(expected, actual);

    }


}
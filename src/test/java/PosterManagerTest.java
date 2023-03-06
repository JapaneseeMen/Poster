import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.items.PosterItems;

public class PosterManagerTest {

    private PosterItems one = new PosterItems(1, "Патриот", "исторический фильм");
    private PosterItems two = new PosterItems(2, "Матрица", "фантсатика");
    private PosterItems three = new PosterItems(3, "Аватар", "фантастика");
    private PosterItems four = new PosterItems(4, "Хоббит", "фантастика");
    private PosterItems five = new PosterItems(5, "Властелин Колец", "фантастика");
    private PosterItems six = new PosterItems(6, "Форсаж", "боевик");
    private PosterItems seven = new PosterItems(7, "Отступники", "боевик");
    private PosterItems eight = new PosterItems(8, "Титаник", "драма");
    private PosterItems nine = new PosterItems(9, "Заклятие", "ужасы");
    private PosterItems ten = new PosterItems(10, "Семь", "триллер, детектив");


    @Test

    public void showLastTenFilms() {
        PosterManager add = new PosterManager();
        add.addFilm(one);
        add.addFilm(two);
        add.addFilm(three);
        add.addFilm(four);
        add.addFilm(five);
        add.addFilm(six);
        add.addFilm(seven);
        add.addFilm(eight);
        add.addFilm(nine);
        add.addFilm(ten);
        PosterItems[] expected = {ten, nine, eight, seven, six, five, four, three, two, one};
        PosterItems[] actual = add.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsMissing() {
        PosterManager manager = new PosterManager(0);
        PosterItems[] actual = manager.findLast();
        PosterItems[] expected = new PosterItems[0];

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void showAddFilm() {
        PosterManager manager = new PosterManager(5);
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        PosterItems film = new PosterItems(11, "Эквилибриум", "фантастика");
        manager.addFilm(film);
        PosterItems[] actual = manager.findLast();
        PosterItems[] expected = {film, ten, nine, eight, seven};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void shoLastTenFilmsWithAdd(){
        PosterManager manager = new PosterManager();
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        PosterItems film = new PosterItems(11, "Эквилибриум", "фантастика");
        manager.addFilm(film);
        PosterItems[] actual = manager.findLast();
        PosterItems[] expected = {film,ten, nine, eight, seven, six, five, four, three, two};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void showAllFilms(){
        PosterManager manager = new PosterManager();
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        PosterItems[] actual = manager.findAll();
        PosterItems[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test

    public void showAllFilmsWithAdd(){
        PosterManager manager = new PosterManager();
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        PosterItems film = new PosterItems(11, "Эквилибриум", "фантастика");
        manager.addFilm(film);
        PosterItems[] actual = manager.findAll();
        PosterItems[] expected = {one, two, three, four, five, six, seven, eight, nine, ten, film};
        Assertions.assertArrayEquals(expected, actual);

    }

}




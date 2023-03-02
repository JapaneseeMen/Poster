import ru.netology.items.PosterItems;
public class PosterManager {
    private PosterItems[] items = new PosterItems[0];
    private int defaultLengths = 10;

    public PosterManager(){

    }
    public PosterManager(int numberOfFilms){
        if (numberOfFilms > 0){
            defaultLengths = numberOfFilms;
        }
    }
    public void addFilm(PosterItems films){
        PosterItems[] tmp = new PosterItems[items.length + 1];
        for (int i = 0; i < items.length; i++ ){
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = films;
        items = tmp;
    }

    public PosterItems[] getItems() {
        int resultLength = items.length;
        if (resultLength < defaultLengths){
             defaultLengths = resultLength;
        }


        PosterItems[] reversed = new PosterItems[defaultLengths];
        for (int i = 0; i < reversed.length; i ++){
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}


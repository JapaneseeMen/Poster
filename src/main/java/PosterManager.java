import ru.netology.items.PosterItems;
public class PosterManager {
    private PosterItems[] items = new PosterItems[0];
    private int defaultLengths;

    public PosterManager(){
        this.defaultLengths = 10;

    }
    public PosterManager(int defaultLengths){
        this.defaultLengths = defaultLengths;
    }

    public PosterItems[] findAll(){

        return items;
    }

    public void addFilm(PosterItems films){
        PosterItems[] tmp = new PosterItems[items.length + 1];
        for (int i = 0; i < items.length; i++ ){
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = films;
        items = tmp;
    }

    public PosterItems[] findLast() {
        int resultLength = items.length;
        if (resultLength < defaultLengths){
            resultLength = items.length;
        }
        else {
            resultLength = defaultLengths;
        }

        PosterItems[] reversed = new PosterItems[resultLength];
        for (int i = 0; i < reversed.length; i ++){
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}


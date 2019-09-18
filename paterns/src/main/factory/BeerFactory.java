package main.factory;

public class BeerFactory {
    public Beer getBeer(BeerTypes beer){
        Beer newBeer = null;

        switch (beer){
            case BUD: newBeer = new Bud(4); break;
            case GARAGE: newBeer = new Garage(3); break;
            case Jiguli: newBeer = new Jiguli(5); break;
        }

        return newBeer;
    }
}

package main.factory;

public abstract class Beer {

    int percent;

    public Beer(int percent) {
        this.percent = percent;
    }

    public String drink(){
        return  "drinking a " + percent + "% " + getClass().getSimpleName();
    }
}

package test;

public class Students {
    String name;
    int score;
    long number;

    public Students(String newName){
        name = newName;
    }

    public void newNumber(long newNumber){
        number=newNumber;
    }

    public void newScore(int newScore){
        score=newScore;
    }

    public String getName(){
        return name;
    }
}

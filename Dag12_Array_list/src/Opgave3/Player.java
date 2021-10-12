package Opgave3;

import com.sun.source.tree.ReturnTree;

public class Player {

    //Opgave 3 a Attributer//
    private String name;
    private int age;
    private int score;

    //Opgave 3 b.1 Constructor//
    public Player(String name,int age){
        this.name = name;
        this.age = age;
        this.score = 0;
    }


    //Opgave 3 b.2 Get metoder til nav og alder//
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    //Opgave 3 b.3 Get og set metoder til score//
    public void setscore(int score){
        this.score = score;
    }

    public int getscore(){
        return this.score;
    }

    //Opgave 3 b.4 tilføge points til en score//
    public void addScore(int points){
        this.score = this.score + points;
    }



}

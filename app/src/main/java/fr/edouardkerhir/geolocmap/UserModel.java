package fr.edouardkerhir.geolocmap;

import java.util.ArrayList;

public class UserModel {
    private double poid = 0.0;
    private int candy = 0;
    private int level = 10;
    private ArrayList<CandyModel> usersCandies = initArray();
    private ArrayList<CandyModel> usersCandies1 = initArray1();
    private ArrayList<CandyModel> usersCandies2 = initArray2();

    public UserModel(double poid, int candy, ArrayList usersCandies, ArrayList usersCandies1, ArrayList usersCandies2) {
        this.poid = poid;
        this.candy = candy;
        this.level=10;
        this.usersCandies= usersCandies;
        this.usersCandies1 = usersCandies1;
        this.usersCandies2 = usersCandies2;
    }

    public void setUsersCandies2(ArrayList<CandyModel> usersCandies2) {
        this.usersCandies2 = usersCandies2;
    }
    public void setUsersCandies1(ArrayList<CandyModel> usersCandies1) {
        this.usersCandies1 = usersCandies1;
    }

    public UserModel() {
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public int getCandy() {
        return candy;
    }

    public void setCandy(int candy) {
        this.candy = candy;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<CandyModel> getUsersCandies() {
        return usersCandies;
    }

    public ArrayList<CandyModel> getUsersCandies1() {
        return usersCandies1;
    }

    public ArrayList<CandyModel> getUsersCandies2() {
        return usersCandies2;
    }

    public void setUsersCandies(ArrayList<CandyModel> usersCandies) {
        this.usersCandies = usersCandies;
    }

    public ArrayList<CandyModel> initArray(){
        CandySingleton candySingleton = CandySingleton.getInstance();
        usersCandies = candySingleton.getCandyArrayList();
        return usersCandies;
    }

    public ArrayList<CandyModel> initArray1(){
        CandySingleton candySingleton = CandySingleton.getInstance();
        usersCandies1 = candySingleton.getCandyArrayList1();
        return usersCandies1;
    }

    public ArrayList<CandyModel> initArray2(){
        CandySingleton candySingleton = CandySingleton.getInstance();
        usersCandies2 = candySingleton.getCandyArrayList2();
        return usersCandies2;
    }

}

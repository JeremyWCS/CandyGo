package fr.edouardkerhir.geolocmap;

import android.content.Context;

import java.util.ArrayList;

class CandySingleton {

    private static final CandySingleton ourInstance = new CandySingleton();

    private ArrayList<CandyModel> CandyArrayList = new ArrayList<>();

    private CandySingleton() {
    }

    static CandySingleton getInstance() {
        return ourInstance;
    }

    public ArrayList<CandyModel> getCandyArrayList() {
        CandyArrayList.clear();
        CandyArrayList.add(new CandyModel("Tagada", R.drawable.tagada, 5));
        CandyArrayList.add(new CandyModel("Dragibus", R.drawable.dragibus, 4));
        CandyArrayList.add(new CandyModel("Schtrumpf", R.drawable.schtroumpfs, 6));
        CandyArrayList.add(new CandyModel("Crocodile", R.drawable.crocodile, 3));
        CandyArrayList.add(new CandyModel("Chamalow", R.drawable.chamlow, 4));
        CandyArrayList.add(new CandyModel("Carambar", R.drawable.carambar, 6.5));
        CandyArrayList.add(new CandyModel("Reglisse", R.drawable.baton2, 8));
        CandyArrayList.add(new CandyModel("Koala", R.drawable.lutti, 4.5));
        CandyArrayList.add(new CandyModel("Scoubidou", R.drawable.lasso, 6));
        CandyArrayList.add(new CandyModel("Coca", R.drawable.cola, 5));

        return CandyArrayList;
    }

    public ArrayList<CandyModel> getCandyArrayList1() {
        CandyArrayList.clear();
        CandyArrayList.add(new CandyModel("Tagada", R.drawable.tagada1, 10));
        CandyArrayList.add(new CandyModel("Dragibus", R.drawable.dragibus1, 8));
        CandyArrayList.add(new CandyModel("Schtrumpf", R.drawable.schtroumpfs1, 12));
        CandyArrayList.add(new CandyModel("Crocodile", R.drawable.crocodile1, 6));
        CandyArrayList.add(new CandyModel("Chamalow", R.drawable.chamlow1, 8));
        CandyArrayList.add(new CandyModel("Carambar", R.drawable.carambar1, 13));
        CandyArrayList.add(new CandyModel("Reglisse", R.drawable.baton1, 16));
        CandyArrayList.add(new CandyModel("Koala", R.drawable.lutti1, 9));
        CandyArrayList.add(new CandyModel("Scoubidou", R.drawable.lasso1, 12));
        CandyArrayList.add(new CandyModel("Coca", R.drawable.cola1, 10));

        return CandyArrayList;
    }

    public ArrayList<CandyModel> getCandyArrayList2() {
        CandyArrayList.clear();
        CandyArrayList.add(new CandyModel("Tagada", R.drawable.tagada2, 20));
        CandyArrayList.add(new CandyModel("Dragibus", R.drawable.dragibus2, 16));
        CandyArrayList.add(new CandyModel("Schtrumpf", R.drawable.schtroumpfs2, 24));
        CandyArrayList.add(new CandyModel("Crocodile", R.drawable.crocodile2, 12));
        CandyArrayList.add(new CandyModel("Chamalow", R.drawable.chamlow2, 16));
        CandyArrayList.add(new CandyModel("Carambar", R.drawable.carambar2, 26));
        CandyArrayList.add(new CandyModel("Reglisse", R.drawable.baton, 28));
        CandyArrayList.add(new CandyModel("Koala", R.drawable.lutti2, 18));
        CandyArrayList.add(new CandyModel("Scoubidou", R.drawable.lasso2, 24));
        CandyArrayList.add(new CandyModel("Coca", R.drawable.cola2, 20));

        return CandyArrayList;
    }
}

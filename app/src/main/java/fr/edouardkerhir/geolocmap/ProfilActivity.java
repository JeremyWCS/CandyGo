package fr.edouardkerhir.geolocmap;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class ProfilActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent goToMap = new Intent(ProfilActivity.this, MainActivity.class);
                    startActivity(goToMap);
                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_notifications:
                    Intent goToList = new Intent(ProfilActivity.this, ListActivity.class);
                    startActivity(goToList);
                    return true;
            }
            return false;
        }
    };
    private String jsonUser;


    private TextView tv_nbBonbon;
    private TextView tv_pdBonbon;
    private TextView tvLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        tv_nbBonbon = findViewById(R.id.tv_nbBonbon);
        tv_pdBonbon = findViewById(R.id.tv_pdBonbon);
        tvLevel = findViewById(R.id.tv_level);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        jsonUser = sharedPreferences.getString("currentUser", null);
        UserModel userModel = gson.fromJson(jsonUser, UserModel.class);

        userModel.setLevel(getlevelUser(userModel.getCandy()));
        int nbBonbon = userModel.getCandy();
        ArrayList<CandyModel> userCandyList= userModel.getUsersCandies();
        double pdBonbon = nbBonbon*userModel.getPoid();

        for (CandyModel candies : userCandyList) {
             pdBonbon += candies.getNbCandy()*candies.getPoids();
        }
        ImageView ivPoids = findViewById(R.id.iv_pd);
        if(pdBonbon>0 && pdBonbon<=50){
            Drawable image1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.petite_citrouille);
            ivPoids.setImageDrawable(image1);
        } else if (pdBonbon>0 && pdBonbon<=200){
            Drawable image2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.moy_citrouille);
            ivPoids.setImageDrawable(image2);
        } else if (pdBonbon>0 && pdBonbon<=400){
            Drawable image3 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.grosse_citrouille);
            ivPoids.setImageDrawable(image3);
        }

            tv_nbBonbon.setText("Vous avez " + nbBonbon + " bonbons!");
        tv_pdBonbon.setText("Vous avez un poids de " + pdBonbon + "g de bonbons!");
        tvLevel.setText(String.valueOf(userModel.getLevel()));


        Button btCitrouille = findViewById(R.id.bt_citrouille);
        btCitrouille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToCitrouilleList = new Intent(ProfilActivity.this,
                        CitrouilleListActivity.class);
                startActivity(goToCitrouilleList);
            }
        });
    }


    public int getlevelUser(int nbCandy){

        int level = 0;

        if (nbCandy < 20) {
            level = 0;
        } else if (nbCandy > 20 && nbCandy < 30) {
            level = 1;
        } else if (nbCandy > 30 && nbCandy < 40) {
            level = 3;
        } else if (nbCandy > 40 && nbCandy < 50) {
            level = 4;
        } else if (nbCandy > 50 && nbCandy < 60) {
            level = 5;
        } else if (nbCandy > 60 && nbCandy < 75) {
            level = 6;
        } else if (nbCandy > 75 && nbCandy < 90) {
            level = 7;
        } else if (nbCandy > 90 && nbCandy < 105) {
            level = 8;
        } else if (nbCandy > 105 && nbCandy < 120) {
            level = 9;
        } else if (nbCandy > 120 && nbCandy < 140) {
            level = 10;
        } else if (nbCandy > 140) {
            level = 11;
        }
        return level;
    }
}

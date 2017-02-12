package com.yuriy.radov.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finde_beer);
    }

    // Call when the user click the button
    public void onClickFindBeer(View view) {
        //Получить ссылку на TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Получить ссылку на Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Получить вариант, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Вывести выбранный вариант
        //brands.setText(beerType);
        //---------------------------------------------
        // Получить рекомендации от класса BeerExpert
        List<String> brandList = expert.getBrands(beerType);
        // Построить String по данным из List
        StringBuilder brandFomatted = new StringBuilder();
        for (String brand : brandList) {
            brandFomatted.append(brand).append('\n');
        }
        // Вывести сорта пива
        brands.setText(brandFomatted);
    }
}

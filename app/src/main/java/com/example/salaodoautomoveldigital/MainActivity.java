package com.example.salaodoautomoveldigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        CarListAdapter adapter = new CarListAdapter(populateCarList(),MainActivity.this);
        recyclerView.setAdapter(adapter);
    }

    private List<Car> populateCarList() {
        List<Car> carList = new ArrayList<>();

        Bitmap fusca = BitmapFactory.decodeResource(getResources(), R.drawable.car1);
        Bitmap chevette = BitmapFactory.decodeResource(getResources(), R.drawable.car2);
        Bitmap monza = BitmapFactory.decodeResource(getResources(), R.drawable.car3);
        Bitmap passat = BitmapFactory.decodeResource(getResources(), R.drawable.car4);
        Bitmap opala = BitmapFactory.decodeResource(getResources(), R.drawable.car5);

        carList.add(new Car(fusca,"Fusca","110hp","1935"));
        carList.add(new Car(chevette,"Chevette","430hp","1973"));
        carList.add(new Car(monza,"Monza","100hp","1982"));
        carList.add(new Car(passat,"Passat","115hp","1974"));
        carList.add(new Car(opala,"Opala","150hp","1968"));

        return carList;

    }
}

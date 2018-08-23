package com.demo.joseezequielgallardo.scalingimages;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = this.findViewById(R.id.list_view);

        Integer [] refs = {
                R.drawable.baadajoz,
                R.drawable.balon,
                R.drawable.betis,R.drawable.blaona,
                R.drawable.cartagema, R.drawable.cordoba2,
                R.drawable.ecija, R.drawable.ejido,
                R.drawable.extremadura, R.drawable.flecha,
                R.drawable.fondoscfd, R.drawable.futbolista,
                R.drawable.granada, R.drawable.jumilla,
                R.drawable.lolo, R.drawable.lorcadep,
                R.drawable.marbella, R.drawable.mellla,
                R.drawable.merida, R.drawable.murcia,
                R.drawable.palmas, R.drawable.pedro,
                R.drawable.recre, R.drawable.sfcd,
                R.drawable.sfcd3, R.drawable.ucam,
                R.drawable.villanovense, R.drawable.images
        };

        Adapter adapter = new Adapter(Arrays.asList(refs), context);

        listView.setAdapter(adapter);
    }
}

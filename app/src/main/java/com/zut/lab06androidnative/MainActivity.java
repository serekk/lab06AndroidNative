package com.zut.lab06androidnative;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void gameList(View v) {
        Intent intencja = new Intent(getApplicationContext(), GamesList.class);
        intencja.putExtra("gra", v.getId());
        startActivity(intencja);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "ooga booga", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}

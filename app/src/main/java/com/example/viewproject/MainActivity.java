package com.example.viewproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }



    public void hideView (View v) {

        View redView;
        redView = (View) findViewById(R.id.colourView);
        redView.setVisibility(View.INVISIBLE);


        Toast.makeText(this, "Hidden!",Toast.LENGTH_SHORT).show();

    }

    public void showView (View v) {
        View redView;
        redView = (View) findViewById(R.id.colourView);
        redView.setVisibility(View.VISIBLE);

        Toast.makeText(this, "Shown!",Toast.LENGTH_SHORT).show();
    }


}
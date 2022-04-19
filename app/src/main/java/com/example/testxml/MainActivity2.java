package com.example.testxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button pagePrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pagePrevious = (Button) findViewById(R.id.button4);
        pagePrevious.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });

    }

    public void goBack(View view){
        Toast toast = Toast.makeText(this, R.string.go_back,
                Toast.LENGTH_SHORT);
        toast.show();
    }

}
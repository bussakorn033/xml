package com.example.testxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button btnDown;
    private Button buttonNewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);

        btnDown = (Button) findViewById(R.id.button2);
        btnDown.setEnabled(mCount > 0);


        buttonNewPage = (Button) findViewById(R.id.happybirthday);
        buttonNewPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }

    public void openNewActivity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onHappyirthday(View view) {
        Toast toast = Toast.makeText(this, R.string.happy_birthday,
                Toast.LENGTH_SHORT);
        toast.show();

//        buttonNewPage = (Button) findViewById(R.id.happybirthday);
//        buttonNewPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openNewActivity();
//            }
//        });
    }


    public void countUp(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_countUp,
                Toast.LENGTH_SHORT);
        toast.show();

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        btnDown = (Button) findViewById(R.id.button2);
        btnDown.setEnabled(mCount > 0);

    }

    public void countDown(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_countDown,
                Toast.LENGTH_SHORT);
        toast.show();
        mCount--;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        btnDown = (Button) findViewById(R.id.button2);
        btnDown.setEnabled(mCount > 0);
    }
}
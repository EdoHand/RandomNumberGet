package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
   public static int getMainActivity2(){
        return new Random().nextInt();
   }
   public int getRandomNumber(int limit){
        return new Random().nextInt(limit);
   }
}
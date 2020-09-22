package com.example.kiddo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UI_interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i_interface);
    }
    public void  tiger(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","tiger");
        startActivity(intent);
    }
    public void  door(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","door");
        startActivity(intent);
    }
    public void  police(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","police");
        startActivity(intent);
    }
    public void  fox(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","fox");
        startActivity(intent);
    }
    public void  cannon(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","cannon");
        startActivity(intent);
    }
    public void  car(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","car");
        startActivity(intent);
    }
    public void  sofa(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","sofa");
        startActivity(intent);
    }
    public void  chair(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","chair");
        startActivity(intent);
    }
    public void  cup(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","cup");
        startActivity(intent);
    }
    public void  ufo(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","ufo");
        startActivity(intent);
    }
    public void  frog(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","frog");
        startActivity(intent);
    }
    public void  gas(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","gas");
        startActivity(intent);
    }
    public void  ladder(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","ladder");
        startActivity(intent);
    }
    public void  donut(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","donut");
        startActivity(intent);
    }
    public void  airplane(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","airplane");
        startActivity(intent);
    }
    public void  rocket(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("check","rocket");
        startActivity(intent);
    }


}
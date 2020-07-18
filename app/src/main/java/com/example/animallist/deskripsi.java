package com.example.animallist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class deskripsi extends AppCompatActivity {

    ImageView fotoHewan;
    TextView  namaHewan,infoHewan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);


        fotoHewan= findViewById(R.id.fotoHewan);
        namaHewan=findViewById(R.id.namaHewan);
        infoHewan= findViewById(R.id.infoHewan);

    getIncomingExtra();
    }

private void getIncomingExtra(){
        if(getIntent().hasExtra("fotohewan")&& getIntent().hasExtra("namahewan")&&
        getIntent().hasExtra("infohewan")){

            Integer fotohewan = getIntent().getIntExtra("fotohewan",1);
//            Integer fotohewan =  R.drawable.monkey;
            String namahewan = getIntent().getStringExtra("namahewan");
            String infohewan = getIntent().getStringExtra("infohewan");

            setdataActivity(fotohewan,namahewan,infohewan);
             }

       }
   private void setdataActivity(Integer fotohewan,String namahewan,String infohewan){
       Glide.with(this).asBitmap().load(fotohewan).into(fotoHewan);
       namaHewan.setText(namahewan);
       infoHewan.setText(infohewan);

   }
}

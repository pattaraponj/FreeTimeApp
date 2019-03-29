package com.example.pjapp.myfirstapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.PriorityQueue;

import static com.example.pjapp.myfirstapp.R.drawable.ic_launcher_foreground;

public class DetailActivity extends AppCompatActivity {
    private ImageView _ImageViewDetail;
    private TextView _TextViewHeader;
    private TextView _TextviewDetail;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

      _ImageViewDetail=findViewById(R.id.imageViewDetail);
      _TextViewHeader=findViewById(R.id.textViewHerderDetial);
      _TextviewDetail=findViewById(R.id.textViewDetail);

    String _StringName= getIntent().getStringExtra("Name");
    _TextViewHeader.setText(_StringName);

    String _StringDetail= getIntent().getStringExtra("Detail");
    _TextviewDetail.setText(_StringDetail);


    int _Pic=getIntent().getIntExtra("Pic",ic_launcher_foreground);
    _ImageViewDetail.setImageResource(_Pic);


    }
}

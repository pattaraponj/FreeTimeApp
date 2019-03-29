package com.example.pjapp.myfirstapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView _HeaderText;
private ListView _ListView;
private Button _BtnClickMe;
private String _UrlAddress ="http://www.englishtown.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _HeaderText=(TextView) findViewById(R.id.textView);
        _ListView=(ListView) findViewById(R.id.listView);
        _BtnClickMe=(Button) findViewById(R.id.mainButton);

        _BtnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 clickActionPlayer("You clicked");
                 }
            }
        );
    final int[] _intsPic=new int[]{R.drawable.gaara,
        R.drawable.hinata,
        R.drawable.jiraiya,
        R.drawable.kakashi,
        R.drawable.neji,
        R.drawable.rocklee,
        R.drawable.sasuke,
        R.drawable.u_naruto,};
        final String[] stringsName= getResources().getStringArray(R.array.data_naruto);
        final String[] stringsDetail=getResources().getStringArray(R.array.data_Detail);

        MainAdapter mainAdapter= new MainAdapter(this,_intsPic,stringsName,stringsDetail);
        _ListView.setAdapter(mainAdapter);
        _ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("Name",stringsName[position]);
                intent.putExtra("Detail",stringsDetail[position]);
                intent.putExtra("Pic",_intsPic[position]);
                intent.putExtra("Index",position);
                startActivity(intent);

            }
        });

    }


    private void clickActionPlayer(String Message){

        MediaPlayer _ClickPlay= MediaPlayer.create(getBaseContext(),R.raw.click);
        Intent _internet= new Intent(Intent.ACTION_VIEW);
        _ClickPlay.start();
        _HeaderText.setText(Message);
        _internet.setData(Uri.parse(_UrlAddress));
        startActivity(_internet);
    }
}

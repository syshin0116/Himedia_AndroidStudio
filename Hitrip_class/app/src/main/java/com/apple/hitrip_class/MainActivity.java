package com.apple.hitrip_class;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_orange, button_green, button_red, button_yellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_orange = findViewById(R.id.button_orange);
        button_green = findViewById(R.id.button_green);
        button_red = findViewById(R.id.button_red);
        button_yellow = findViewById(R.id.button_yellow);

        button_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("네이버 연결!");
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.naver.com")
                );
                startActivity(intent);
            }
        });
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("달력!");
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:/01041951949")
                );
                startActivity(intent);
            }
        });
        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("내 앨범!");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(intent);
            }
        });
        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("종료!");
                finish();
            }
        });


    }
    public void print(String data){
        Toast.makeText(getApplicationContext(),
                data,
                Toast.LENGTH_SHORT).show();
    }
}

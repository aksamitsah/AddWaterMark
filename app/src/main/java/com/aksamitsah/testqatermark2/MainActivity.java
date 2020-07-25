package com.aksamitsah.testqatermark2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.click1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                ImageView iv = (ImageView)findViewById(R.id.imageview1);
                iv.setImageResource(R.drawable.background);

                Bitmap bg = BitmapFactory.decodeResource(getResources(),R.drawable.background);
                Bitmap icon = BitmapFactory.decodeResource(getResources(),R.drawable.cover_aks);

                iv.setImageBitmap(AksBitmapWatermark.addWatermark(bg,icon,0.2f));

                Toast.makeText(MainActivity.this, "Watermark added", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
package com.success.sonpham.democustomimageview;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RoundedImageView imageView = (RoundedImageView) findViewById(R.id.imageView_round);

        Glide.with(this).load("http://pad.mymovies.it/cinemanews/2009/24387/avatar_24.jpg").asBitmap().into(imageView);
    }
}

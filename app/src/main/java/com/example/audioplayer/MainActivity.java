package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

   MediaPlayer mediaPlayer;
    public void buttonTapped(View view)
    {
        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);

       // Log.i("buttonTapped",ourId);
        int resourceId = getResources().getIdentifier(ourId,"raw","com.example.audioplayer");
        mediaPlayer = MediaPlayer.create(this,resourceId);
          mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

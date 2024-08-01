package com.example.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackButton);
        greenBtn = findViewById(R.id.greenButton);
        purpleBtn = findViewById(R.id.purpleButton);
        redBtn = findViewById(R.id.redButton);
        yellowBtn = findViewById(R.id.yellowButton);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int clickedBtn = v.getId();
        if (clickedBtn == R.id.blackButton) {
            PlaySounds(R.raw.black);
        } else if (clickedBtn == R.id.greenButton) {
            PlaySounds(R.raw.green);
        } else if (clickedBtn == R.id.purpleButton) {
            PlaySounds(R.raw.purple);
        } else if (clickedBtn == R.id.redButton) {
            PlaySounds(R.raw.red);
        } else if (clickedBtn == R.id.yellowButton) {
            PlaySounds(R.raw.yellow);
        }
    }

    public void PlaySounds(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }
}
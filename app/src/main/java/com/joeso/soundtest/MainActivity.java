package com.joeso.soundtest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int mSoundId;
    Button bnShortSound;
    Button bnLongMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool=new SoundPool.Builder()
            .setMaxStreams(2) //最多播放音频数
            .build();

        mSoundPool.load(this.getApplicationContext())

        AudioAttributes.Builder attrBuilder = new AudioAttributes.Builder();

    }
}

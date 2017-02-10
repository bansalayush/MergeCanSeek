package com.scorpio.mergecanseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
//android:progressDrawable="@android:color/transparent"

public class MainActivity extends AppCompatActivity {

    SeekBar seekbar;
    AirTube airTube;
    static int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        airTube = (AirTube) findViewById(R.id.airTube);
        seekbar = (SeekBar)findViewById(R.id.seekbar);
        //seekbar.getThumb().mutate().setAlpha(0);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.i("Seek bar value changed ",i+"");
                k=i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}

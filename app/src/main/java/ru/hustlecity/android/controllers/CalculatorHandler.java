package ru.hustlecity.android.controllers;

import android.util.Log;
import android.widget.SeekBar;

import ru.hustlecity.android.models.Calculator;

/**
 * Created by wispoz on 23.06.16.
 */
public class CalculatorHandler implements SeekBar.OnSeekBarChangeListener {
    public Calculator place = null;
    private Boolean isFrom = false;
    public CalculatorHandler(Calculator place,Boolean from) {
        this.place  = place;
        this.isFrom = from;
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(isFrom) {
            int position = seekBar.getProgress()  / 2;
            this.place.setDndPosition(Integer.toString(position));
            this.place.setFrom(Integer.toString(seekBar.getProgress()));
        } else {
            int position = seekBar.getProgress()  / 2;
            this.place.setClassicPosition(Integer.toString(position));
            this.place.setPlace(Integer.toString(seekBar.getProgress()));
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

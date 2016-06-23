package ru.hustlecity.android.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import ru.hustlecity.android.R;
import ru.hustlecity.android.controllers.CalculatorHandler;
import ru.hustlecity.android.databinding.CalculatorBinding;
import ru.hustlecity.android.models.Calculator;

/**
 * Created by wispoz on 23.06.16.
 */
public class CalculatorView extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CalculatorBinding binding = DataBindingUtil.inflate(inflater, R.layout.calculator, container, false);
        View view = binding.getRoot();
        SeekBar placeSelect =(SeekBar) view.findViewById(R.id.seekBar);
        SeekBar placeFrom =(SeekBar) view.findViewById(R.id.seekBar2);
        Calculator place = new Calculator("0","0");
        placeSelect.setOnSeekBarChangeListener(new CalculatorHandler(place,false));
        placeFrom.setOnSeekBarChangeListener(new CalculatorHandler(place,true));
        binding.setCalculator(place);
        return view;
    }
}

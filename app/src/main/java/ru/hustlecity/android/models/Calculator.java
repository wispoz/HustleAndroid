package ru.hustlecity.android.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ru.hustlecity.android.BR;

/**
 * Created by wispoz on 23.06.16.
 */
public class Calculator extends BaseObservable {
    private  String place;
    private  String from;
    private  String classicPosition;
    private  String dndPosition;
    @Bindable
    public String getPlace() {
        return this.place;
    }
    @Bindable
    public String getClassicPosition() {
        return this.classicPosition;
    }
    @Bindable
    public String getDndPosition() {
        return this.dndPosition;
    }
    @Bindable
    public String getFrom() {
        return this.from;
    }
    public void setClassicPosition(String position) {
        this.classicPosition = position;
        notifyPropertyChanged(BR.classicPosition);
    }
    public void setDndPosition(String position) {
        this.dndPosition = position;
        notifyPropertyChanged(BR.dndPosition);
    }
    public void setPlace(String place) {
        this.place = place;
        notifyPropertyChanged(BR.place);
    }
    public void setFrom(String from) {
        this.from = from;
        notifyPropertyChanged(BR.from);
    }
    public Calculator(String place, String from) {
        this.place = place;
        this.from = from;
    }



}

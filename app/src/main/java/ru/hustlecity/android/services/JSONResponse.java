package ru.hustlecity.android.services;

import ru.hustlecity.android.models.Dancer;

/**
 * Created by wispoz on 23.06.16.
 */
public class JSONResponse {
    private Dancer[] dancers;
    private Dancer dancer;
    public Dancer[] getDancers() {
        return dancers;
    }

    public Dancer getDancer() {
        return dancer;
    }

}

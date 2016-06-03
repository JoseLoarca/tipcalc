package org.jcloarca.tipcalculator;

import android.app.Application;

/**
 * Created by JCLoarca on 6/2/2016.
 */
public class TipCalcApp extends Application {
    private final static String URL_ABOUT = "https://about.me/joseloarca";

    public String getUrlAbout() {
        return URL_ABOUT;
    }
}

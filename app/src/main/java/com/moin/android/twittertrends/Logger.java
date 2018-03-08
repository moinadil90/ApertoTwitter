package com.moin.android.twittertrends;

import android.util.Log;

/**
 * Created by moin on 3/8/18.
 */
public class Logger {

    /*
        DEBUG
     */

    public static void d(String tag, String message, Throwable t) {
        if (BuildConfig.DEBUG)
            Log.d(tag, message, t);
    }

    public static void d(String tag, String message) {
        if (BuildConfig.DEBUG)
            Log.d(tag, message);
    }


    /*
        ERROR
     */

    public static void e(String tag, String message, Throwable t) {
        if (BuildConfig.DEBUG)
            Log.e(tag, message, t);
    }

    public static void e(String tag, String message) {
        if (BuildConfig.DEBUG)
            Log.e(tag, message);
    }

}

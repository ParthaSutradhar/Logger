package com.developer.logger;

import android.util.Log;

public class Logger {


    public static void warn(String key,String message){
        Log.e(key,message);
    }

}

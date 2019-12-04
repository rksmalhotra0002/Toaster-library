package com.arjun.toastlibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void makeText(Context context, String message){

        Toast.makeText(context,message, Toast.LENGTH_LONG).show();

    }

}

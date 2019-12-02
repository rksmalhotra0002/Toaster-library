package com.arjun.toastlibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_LONG).show();

    }

}

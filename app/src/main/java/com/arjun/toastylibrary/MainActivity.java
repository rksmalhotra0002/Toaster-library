package com.arjun.toastylibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.arjun.toastlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       printToast();

    }
    private void printToast()
    {

        ToasterMessage.makeText(MainActivity.this,"shubham");
    }
}

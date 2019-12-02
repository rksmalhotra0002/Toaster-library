# Toaster-library
A simple library to show Toast 


allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}


dependencies {

    implementation 'com.github.rksmalhotra0002:Toaster-library:0.10'
    
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.s(this,"shubham malhotra");

    }
}

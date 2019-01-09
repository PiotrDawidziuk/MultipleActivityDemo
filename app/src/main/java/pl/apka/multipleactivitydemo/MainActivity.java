package pl.apka.multipleactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void goToNext(View view) {

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        intent.putExtra("age", 29);
        startActivity(intent);
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

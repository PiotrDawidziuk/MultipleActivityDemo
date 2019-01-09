package pl.apka.multipleactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public void goToNext(View view) {

       // Intent intent = new Intent(getApplicationContext(), MainActivity.class);

       // startActivity(intent);

        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int age = intent.getIntExtra("age",0);

        Toast.makeText(this, "Age is "+age, Toast.LENGTH_LONG).show();
    }
}

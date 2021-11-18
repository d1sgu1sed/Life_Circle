package com.example.life_circle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.my_text);//нашли элемент на разметке(Писать обязательно после setContentView!)

        //перезапись текста - .setText, дополнение текста - .append
        text.append("\nActivity created!\n");

        Toast.makeText(getApplicationContext(), "Activity created!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        text.append("Activity started!\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        text.append("Activity resumed!\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        text.append("Activity paused!\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        text.append("Activity stopped!\n");
        Toast.makeText(getApplicationContext(), "Activity stoped",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Activity destroyed!",
                    Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        text.append("Activity restarted!\n");
    }
}
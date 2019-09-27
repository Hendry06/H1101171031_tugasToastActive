package com.example.h1101171031_tugastoastactive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 31;
    Button button_count_down, button_count_up,button_toast;
    TextView tigapuluhsatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_count_down=(Button)findViewById(R.id.button_count_down);
        button_count_up=(Button)findViewById(R.id.button_count_up);
        button_toast=(Button)findViewById(R.id.button_toast);
        tigapuluhsatu=(TextView)findViewById(R.id.tigapuluhsatu);

        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hallo Hendry",Toast.LENGTH_SHORT).show();
            }
        });

        button_count_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tigapuluhsatu.setText(Integer.toString(count));
            }
        });

        button_count_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tigapuluhsatu.setText(Integer.toString(count));
            }
        });
    }

}

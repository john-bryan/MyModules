package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid;
    TextView tvIpad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.android);
        tvIpad = findViewById(R.id.iPad);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AndroidActivity.class);
                intent.putExtra("module", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", "2018");
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);

            }
        });

        tvIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AndroidActivity.class);
                intent.putExtra("module", "C349");
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", "2018");
                intent.putExtra("sem", 2);
                intent.putExtra("cred", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);

            }
        });

    }
}

package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidActivity extends AppCompatActivity {

    TextView tvMod;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCred;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        tvMod = findViewById(R.id.mod);
        tvName = findViewById(R.id.name);
        tvYear = findViewById(R.id.year);
        tvSem = findViewById(R.id.sem);
        tvCred = findViewById(R.id.cred);
        tvVenue = findViewById(R.id.venue);

        Intent intentReceived = getIntent();
        String mod = intentReceived.getStringExtra("module");
        tvMod.setText("Module Code: " + mod);

        String name = intentReceived.getStringExtra("name");
        tvName.setText("Module Name: " + name);

        String year = intentReceived.getStringExtra("year");
        tvYear.setText("Academic Year: " + year);

        int semester = intentReceived.getIntExtra("sem", 0);
        tvSem.setText("Semester: " + semester);

        int credits = intentReceived.getIntExtra("cred", 0);
        tvCred.setText("Module Credit: " + credits);

        String venue = intentReceived.getStringExtra("venue");
        tvVenue.setText("Venue: " + venue);

    }
}

package sg.edu.rp.c346.id20011280.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346;// calling variables
    TextView c349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.C346); // determining variables
        c349 = findViewById(R.id.C349);

        c346.setOnClickListener(new View.OnClickListener() { // textview
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("AcademicYear",2020);
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W66M");


                startActivity(intent);
            }
        });
        c349.setOnClickListener(new View.OnClickListener() { // textview
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class); // main file first, class file or sub file
                intent.putExtra("ModuleCode","C349"); // signals to second activity
                // informs second activity to display information
                intent.putExtra("ModuleName","IPad Programming");
                intent.putExtra("AcademicYear",2020);
                intent.putExtra("Semester",2);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W65E");

                startActivity(intent);
            }
        });
    }
}
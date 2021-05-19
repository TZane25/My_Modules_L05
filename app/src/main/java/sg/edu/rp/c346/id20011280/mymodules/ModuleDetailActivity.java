package sg.edu.rp.c346.id20011280.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView module_code; // calling the variables
    TextView module_name;
    TextView AcademicYear;
    TextView Semester;
    TextView Credit;
    TextView venue;
    Button back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        module_code = findViewById(R.id.ModuleCode); // determining variables
        module_name = findViewById(R.id.ModuleName);
        AcademicYear = findViewById(R.id.AcademicYear);
        Semester = findViewById(R.id.Semester);
        Credit = findViewById(R.id.ModuleCredit);
        venue = findViewById(R.id.Venue);
        back = findViewById(R.id.backbutton);


        Intent received = getIntent(); // intent method

        // words are format sensitive and must resonate with the main activity file

        String moduleCode = received.getStringExtra("ModuleCode"); // receiving the data from the main activity
        // after putextra is used so the signal comes to this file
        String moduleName = received.getStringExtra("ModuleName");
        int AcadYear = received.getIntExtra("AcademicYear",0);
        int semester = received.getIntExtra("Semester",0);
        int credit = received.getIntExtra("ModuleCredit",0);
        String Venue = received.getStringExtra("Venue");

        module_code.setText("Module code : " + moduleCode); // setting the new text into the output
        module_name.setText("Module Name : " + moduleName);
        AcademicYear.setText("Academic Year : " + AcadYear);
        Semester.setText("Semester : " + semester);
        Credit.setText("Module Credit : " + credit);
        venue.setText("Venue : " + Venue);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish(); // back to the home page
            }
        });












    }
}
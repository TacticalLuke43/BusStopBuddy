package csc383.busstopbuddy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class StudentCheckIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_check_in);

        Button logoutbtn = (Button)findViewById(R.id.logoutButton);
        Button updatebtn = (Button)findViewById(R.id.updateStudentButton);
        final CheckBox checkbox1 = (CheckBox)findViewById(R.id.studentCheck1);
        final CheckBox checkbox2 = (CheckBox)findViewById(R.id.studentCheck2);
        final CheckBox checkbox3 = (CheckBox)findViewById(R.id.studentCheck3);
        final CheckBox checkbox4 = (CheckBox)findViewById(R.id.studentCheck4);
        final CheckBox checkbox5 = (CheckBox)findViewById(R.id.studentCheck5);
        final CheckBox checkbox6 = (CheckBox)findViewById(R.id.studentCheck6);

        final SharedPreferences.Editor editor = getSharedPreferences("Checks", MODE_PRIVATE).edit();
        SharedPreferences prefs = getSharedPreferences("Checks", MODE_PRIVATE);

        checkbox1.setChecked(prefs.getBoolean("checked1",false));
        checkbox2.setChecked(prefs.getBoolean("checked2",false));
        checkbox3.setChecked(prefs.getBoolean("checked3",false));
        checkbox4.setChecked(prefs.getBoolean("checked4",false));
        checkbox5.setChecked(prefs.getBoolean("checked5",false));
        checkbox6.setChecked(prefs.getBoolean("checked6",false));


        logoutbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StudentCheckIn.this, StartingScreen.class));
            }
        });

        updatebtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                boolean checked1 = checkbox1.isChecked();
                boolean checked2 = checkbox2.isChecked();
                boolean checked3 = checkbox3.isChecked();
                boolean checked4 = checkbox4.isChecked();
                boolean checked5 = checkbox5.isChecked();
                boolean checked6 = checkbox6.isChecked();
                editor.putBoolean("checked1", checked1);
                editor.putBoolean("checked2", checked2);
                editor.putBoolean("checked3", checked3);
                editor.putBoolean("checked4", checked4);
                editor.putBoolean("checked5", checked5);
                editor.putBoolean("checked6", checked6);
                editor.commit();

            }
        });


    }
}

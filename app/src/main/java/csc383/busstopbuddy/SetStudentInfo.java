package csc383.busstopbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SetStudentInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_student_info);
    }

    public void submitButton(View view) {
        String message = "Info Updated!";
        Toast.makeText(SetStudentInfo.this, message, Toast.LENGTH_LONG).show();
    }
}

package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class ViewStudentInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_student_info);

    }
    public void logOutButton(View view) {
        Intent intent = new Intent(this, StartingScreen.class);
        startActivity(intent);
    }


    public void Update(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String student1 = "Jane Doe";
        String student2 = "John Doe";
        if (String.valueOf(spinner.getSelectedItem()).equals(student1)) {
            TextView StudentAddress = (TextView) findViewById(R.id.StudentAddress);
            StudentAddress.setText("111 Main Street");
            TextView StudentNum = (TextView) findViewById(R.id.StudentNum);
            StudentNum.setText("(810)486-8570");
            TextView SRouteNum = (TextView) findViewById(R.id.SRouteNum);
            SRouteNum.setText("3");

        }

        else if(String.valueOf(spinner.getSelectedItem()).equals(student2)){
            TextView StudentAddress = (TextView) findViewById(R.id.StudentAddress);
            StudentAddress.setText("542 Leeroy Street");
            TextView StudentNum = (TextView) findViewById(R.id.StudentNum);
            StudentNum.setText("(810)469-2946");
            TextView SRouteNum = (TextView) findViewById(R.id.SRouteNum);
            SRouteNum.setText("1");

        }
    }
}

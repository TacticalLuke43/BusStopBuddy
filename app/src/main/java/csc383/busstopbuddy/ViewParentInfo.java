package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class ViewParentInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_driver_info);

    }
    public void logOutButton(View view) {
        Intent intent = new Intent(this, StartingScreen.class);
        startActivity(intent);
    }


    public void Update(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        String student1 = "Jane Doe";
        String student2 = "John Doe";
        if (String.valueOf(spinner.getSelectedItem()).equals(student1)) {
            TextView ParentName = (TextView) findViewById(R.id.ParentName);
            ParentName.setText("DAN WISEMAN");
            TextView ParentNum = (TextView) findViewById(R.id.ParentNum);
            ParentNum.setText("(810)755-8583");
        }

        else if(String.valueOf(spinner.getSelectedItem()).equals(student2)){
            TextView ParentName = (TextView) findViewById(R.id.ParentName);
            ParentName.setText("TAYLOR SHEPHARD ");
            TextView ParentNum = (TextView) findViewById(R.id.ParentNum);
            ParentNum.setText("(810)469-2946");
        }
    }
}

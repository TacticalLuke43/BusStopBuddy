package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class ViewDriverInfo extends AppCompatActivity {

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
        String route1 = "Route 1";
        String route2 = "Route 2";
        if (String.valueOf(spinner.getSelectedItem()).equals(route1)) {
            TextView DriverName = (TextView) findViewById(R.id.DriverName);
            DriverName.setText("Brain Freeman");
            TextView PhoneNum = (TextView) findViewById(R.id.PhoneNum);
            PhoneNum.setText("(810)810-9999");
        }

        else if(String.valueOf(spinner.getSelectedItem()).equals(route2)){
            TextView DriverName = (TextView) findViewById(R.id.DriverName);
            DriverName.setText(" Dennis Kellogg");
            TextView PhoneNum = (TextView) findViewById(R.id.PhoneNum);
            PhoneNum.setText("(810)810-8100");
        }
    }
}

package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
public class SetRoute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_route);
    }

    public void logOutButton(View view) {
        Intent intent = new Intent(this, StartingScreen.class);
        startActivity(intent);
    }


    public void updateFormButton(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.routeSpinner);
        String route1 = "Route 1";
        String route2 = "Route 2";
        if (String.valueOf(spinner.getSelectedItem()).equals(route1)) {
            TextView departTime = (TextView) findViewById(R.id.departureTime);
            departTime.setText("3:00 PM");
            TextView estimateTime = (TextView) findViewById(R.id.estimatedRouteTime);
            estimateTime.setText("40 Minutes");
            TextView numberOfStops = (TextView) findViewById(R.id.numberOfStops);
            numberOfStops.setText("3");
            TextView stopsList = (TextView) findViewById(R.id.stopsTextView);
            stopsList.setText("Stop 1: 111 Main Street \n Stop 2: 222 Main Street \n Stop 3: 333 Brown Road");
        }
        else if(String.valueOf(spinner.getSelectedItem()).equals(route2)){
            TextView departTime = (TextView) findViewById(R.id.departureTime);
            departTime.setText("3:10 PM");
            TextView estimateTime = (TextView) findViewById(R.id.estimatedRouteTime);
            estimateTime.setText("10 Minutes");
            TextView numberOfStops = (TextView) findViewById(R.id.numberOfStops);
            numberOfStops
                    .setText("1");
            TextView stopsList = (TextView) findViewById(R.id.stopsTextView);
            stopsList.setText("Stop 1: 542 Leeroy Street");
        }
    }
}

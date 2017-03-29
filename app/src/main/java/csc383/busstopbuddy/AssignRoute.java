package csc383.busstopbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AssignRoute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_route);
    }

    public void trackingButton(View view)
    {
        Button button = (Button) findViewById(R.id.trackingButton);
        String start = "Start Tracking";
        String stop = "Stop Tracking";
        if (button.getText().toString().equals(start))
        {
            String message = "Tracking has started!";
            Toast.makeText(AssignRoute.this, message, Toast.LENGTH_LONG).show();
            button.setText(stop);
        }
        else
        {
            String message = "Tracking has ended!";
            Toast.makeText(AssignRoute.this, message, Toast.LENGTH_LONG).show();
            button.setText(start);
        }

    }
}

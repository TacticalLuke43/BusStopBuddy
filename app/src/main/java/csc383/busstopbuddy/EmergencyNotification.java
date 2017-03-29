package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EmergencyNotification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_notification);
    }

    public void logOutButton(View view) {
        Intent intent = new Intent(this, StartingScreen.class);
        startActivity(intent);
    }

    public void sendNotification(View view) {
        Intent intent = new Intent(this, AdminMenuActivity.class);
        String message = "Emergency Notification Sent!";
        Toast.makeText(EmergencyNotification.this, message, Toast.LENGTH_LONG).show();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}

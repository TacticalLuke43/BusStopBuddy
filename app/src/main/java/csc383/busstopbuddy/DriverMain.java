package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        // start of dans intents

        Button logoutbtn = (Button) findViewById(R.id.logoutButton);
        Button starttrackbtn = (Button) findViewById(R.id.starttrackbtn);
        Button routebtn = (Button) findViewById(R.id.routebtn);
        Button viewstudentbtn = (Button) findViewById(R.id.viewStudentInfoButton);
        Button viewparentbtn = (Button) findViewById(R.id.viewParentInfoButton);
        Button setdriverbtn = (Button) findViewById(R.id.setDriverInfoButton);
        Button emergencybtn = (Button) findViewById(R.id.emergencyNotificationButton);
        Button setstudentcheckinbtn = (Button) findViewById(R.id.setStudentCheckinButton);

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, StartingScreen.class));
            }
        });
        starttrackbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, BusTrackActivity.class));
            }
        });
        routebtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, ManageBuses.class));
            }
        });
        viewstudentbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, ViewStudentInfo.class));
            }
        });
        viewparentbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, ViewParentInfo.class));
            }
        });
        setdriverbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, SetDriverInfo.class));
            }
        });
        emergencybtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, EmergencyNotification.class));
            }
        });
        setstudentcheckinbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DriverMain.this, StudentCheckIn.class));
            }
        });
    }
}
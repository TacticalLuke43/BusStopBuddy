package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        // start of taylors intents

        Button logoutbtn = (Button)findViewById(R.id.logoutButton);
        Button trackbusbtn = (Button)findViewById(R.id.starttrackbtn);
        Button managebusesbtn = (Button)findViewById(R.id.routebtn);
        Button viewstudentbtn = (Button)findViewById(R.id.viewStudentInfoButton);
        Button viewparentbtn = (Button)findViewById(R.id.viewParentInfoButton);
        Button setdriverbtn = (Button)findViewById(R.id.setDriverInfoButton);
        Button emergencybtn = (Button)findViewById(R.id.emergencyNotificationButton);
        Button setstudentcheckinbtn = (Button)findViewById(R.id.setStudentCheckinButton);

        logoutbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, StartingScreen.class));
            }
        });
        trackbusbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, BusTrackActivity.class));
            }
        });
        managebusesbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, ManageBuses.class));
            }
        });
        viewstudentbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, ViewStudentInfo.class));
            }
        });
        viewparentbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, ViewParentInfo.class));
            }
        });
        setdriverbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, SetDriverInfo.class));
            }
        });
        emergencybtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, EmergencyNotification.class));
            }
        });
        setstudentcheckinbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AdminMenuActivity.this, StudentCheckIn.class));
            }
        });
    }



    /** Behavior for buttons */
    /*
    public void backButton(View view) {
        Intent intent = new Intent(this, StartingScreen.class);
        startActivity(intent);
    }

    public void changeToBusTrack(View view) {
        Intent intent = new Intent(this, BusTrackActivity.class);
        startActivity(intent);
    }
    */
    /*public void changeToManageBus(View view) {
        Intent intent = new Intent(this, ManageBusActivity.class);
        startActivity(intent);
    }
    public void changeToStudentInfo(View view) {
        Intent intent = new Intent(this, StudentInfoActivity.class);
        startActivity(intent);
    }
    public void changeToParentInfo(View view) {
        Intent intent = new Intent(this, ParentInfoActivity.class);
        startActivity(intent);
    }
    public void changeToDriverInfo(View view) {
        Intent intent = new Intent(this, DriverInfoActivity.class);
        startActivity(intent);
    }
    public void changeToStudentCheck(View view) {
        Intent intent = new Intent(this, StudentCheckActivity.class);
        startActivity(intent);
    }*/

    //Taylor Here might delete the stuff above later but i didnt want to touch it
    //Gonna do my own intents in oncreate

}

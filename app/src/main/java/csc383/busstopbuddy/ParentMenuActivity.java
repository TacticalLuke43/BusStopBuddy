package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_menu);

        // start of taylors intents
        //note absence notification doesnt need a activity

        Button logoutbtn = (Button)findViewById(R.id.logoutButton);
        Button trackbusbtn = (Button)findViewById(R.id.starttrackbtn);
        Button getetabtn = (Button)findViewById(R.id.getETAButton);
        Button setstudentbtn = (Button)findViewById(R.id.setStudentInfoButton);
        Button setparentbtn = (Button)findViewById(R.id.setParentInfoButton);
        Button viewdriverbtn = (Button)findViewById(R.id.viewDriverInfoButton);
        Button viewstudentcheckinbtn = (Button)findViewById(R.id.viewStudentCheckButton);

        logoutbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ParentMenuActivity.this, StartingScreen.class));
            }
        });
        trackbusbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ParentMenuActivity.this, BusTrackActivity.class));
            }
        });
        getetabtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ParentMenuActivity.this, GetETA.class));
            }
        });
        setstudentbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ParentMenuActivity.this, SetStudentInfo.class));
            }
        });
        setparentbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ParentMenuActivity.this, SetParentInfo.class));
            }
        });
        viewdriverbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ParentMenuActivity.this, ViewDriverInfo.class));
            }
        });

        viewstudentcheckinbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ParentMenuActivity.this, ViewStudentCheckIn.class));
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
    /*public void changeToGetETA(View view) {
        Intent intent = new Intent(this, ManageBusActivity.class);
        startActivity(intent);
    }
    public void changeToDriverInfo(View view) {
        Intent intent = new Intent(this, DriverInfoActivity.class);
        startActivity(intent);
    }
    public void changeToAbsenceNotify(View view) {
        Intent intent = new Intent(this, AbsenceNotifyActivity.class);
        startActivity(intent);
    }
    public void changeToStudentCheck(View view) {
        Intent intent = new Intent(this, StudentCheckActivity.class);
        startActivity(intent);
    }*/

    // again i wanted to make my own intents so i left the code above untouched
}

package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbsenceNotification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absence_notification);

        Button logoutbtn = (Button)findViewById(R.id.logoutButton);
        Button sendbtn = (Button) findViewById(R.id.sendbtn);

        logoutbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(AbsenceNotification.this, StartingScreen.class));
            }
        });

    }
}

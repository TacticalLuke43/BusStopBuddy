package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class StartingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
    }
    /** Called when the user clicks the Proceed button */
    public void processLogIn(View view) {
        // parse username and password
        EditText editText = (EditText) findViewById(R.id.usernameText);
        String username = editText.getText().toString();
        EditText editText1 = (EditText) findViewById(R.id.passwordText);
        String password = editText1.getText().toString();
        String message = " ";
        String testParent = "parent";
        String testAdmin = "admin";
        String testDriver = "driver";

        if (username.equals(testParent))
        {
            Intent intent = new Intent(this, ParentMenuActivity.class);
            message =  "Hello Parent!";
            Toast.makeText(StartingScreen.this, message, Toast.LENGTH_LONG).show();
            //intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else if (username.equals(testAdmin))
        {
            Intent intent = new Intent(this, AdminMenuActivity.class);
            message = "Hello Admin!";
            Toast.makeText(StartingScreen.this, message, Toast.LENGTH_LONG).show();
            //intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else if (username.equals(testDriver))
        {
            Intent intent = new Intent(StartingScreen.this, DriverMain.class);
            message = "Hello Driver!";
            Toast.makeText(StartingScreen.this, message, Toast.LENGTH_LONG).show();
            //intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else
            Toast.makeText(StartingScreen.this, message, Toast.LENGTH_LONG).show();
    }
}

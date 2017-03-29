package csc383.busstopbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SetParentInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_parent_info);
    }

    public void submitButton(View view) {
        String message = "Info Updated!";
        Toast.makeText(SetParentInfo.this, message, Toast.LENGTH_LONG).show();
    }
}

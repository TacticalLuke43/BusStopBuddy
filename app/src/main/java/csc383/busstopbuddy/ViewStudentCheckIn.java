package csc383.busstopbuddy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

public class ViewStudentCheckIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_student_check_in);

        Button logoutbtn = (Button)findViewById(R.id.logoutButton);
        //Button refreshbtn = (Button)findViewById(R.id.refreshButton);
        final CheckedTextView checkview1 = (CheckedTextView)findViewById(R.id.viewStudentCheck1);
        final CheckedTextView checkview2 = (CheckedTextView)findViewById(R.id.viewStudentCheck2);
        final CheckedTextView checkview3 = (CheckedTextView)findViewById(R.id.viewStudentCheck3);
        final CheckedTextView checkview4 = (CheckedTextView)findViewById(R.id.viewStudentCheck4);
        final CheckedTextView checkview5 = (CheckedTextView)findViewById(R.id.viewStudentCheck5);
        final CheckedTextView checkview6 = (CheckedTextView)findViewById(R.id.viewStudentCheck6);

        final SharedPreferences prefs = getSharedPreferences("Checks", MODE_PRIVATE);

        final boolean[] checked1 = {prefs.getBoolean("checked1", false)};
        final boolean[] checked2 = {prefs.getBoolean("checked2", false)};
        final boolean[] checked3 = {prefs.getBoolean("checked3", false)};
        final boolean[] checked4 = {prefs.getBoolean("checked4", false)};
        final boolean[] checked5 = {prefs.getBoolean("checked5", false)};
        final boolean[] checked6 = {prefs.getBoolean("checked6", false)};

        if (checked1[0] == false)
        {
            checkview1.setCheckMarkDrawable(null);
            checkview1.setChecked(false);
        }
        else
        {
            checkview1.setCheckMarkDrawable(R.drawable.checked);
            checkview1.setChecked(true);
        }
        if (checked2[0] == false)
        {
            checkview2.setCheckMarkDrawable(null);
            checkview2.setChecked(false);
        }
        else
        {
            checkview2.setCheckMarkDrawable(R.drawable.checked);
            checkview2.setChecked(true);
        }
        if (checked3[0] == false)
        {
            checkview3.setCheckMarkDrawable(null);
            checkview3.setChecked(false);
        }
        else
        {
            checkview3.setCheckMarkDrawable(R.drawable.checked);
            checkview3.setChecked(true);
        }
        if (checked4[0] == false)
        {
            checkview4.setCheckMarkDrawable(null);
            checkview4.setChecked(false);
        }
        else
        {
            checkview4.setCheckMarkDrawable(R.drawable.checked);
            checkview4.setChecked(true);
        }
        if (checked5[0] == false)
        {
            checkview5.setCheckMarkDrawable(null);
            checkview5.setChecked(false);
        }
        else
        {
            checkview5.setCheckMarkDrawable(R.drawable.checked);
            checkview5.setChecked(true);
        }
        if (checked6[0] == false)
        {
            checkview6.setCheckMarkDrawable(null);
            checkview6.setChecked(false);
        }
        else
        {
            checkview6.setCheckMarkDrawable(R.drawable.checked);
            checkview6.setChecked(true);
        }

        logoutbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ViewStudentCheckIn.this, StartingScreen.class));
            }
        });
        /* not needed but i left this in for testing purposes
        refreshbtn.setOnClickListener(new View.OnClickListener()
        {


            public void onClick(View v)
            {
                checked1[0] = prefs.getBoolean("checked1", false);
                checked2[0] = prefs.getBoolean("checked2", false);
                checked3[0] = prefs.getBoolean("checked3", false);
                checked4[0] = prefs.getBoolean("checked4", false);
                checked5[0] = prefs.getBoolean("checked5", false);
                checked6[0] = prefs.getBoolean("checked6", false);



                if (checked1[0] == false)
                {
                    checkview1.setCheckMarkDrawable(null);
                    checkview1.setChecked(false);
                }
                else
                {
                    checkview1.setCheckMarkDrawable(R.drawable.checked);
                    checkview1.setChecked(true);
                }
                if (checked2[0] == false)
                {
                    checkview2.setCheckMarkDrawable(null);
                    checkview2.setChecked(false);
                }
                else
                {
                    checkview2.setCheckMarkDrawable(R.drawable.checked);
                    checkview2.setChecked(true);
                }
                if (checked3[0] == false)
                {
                    checkview3.setCheckMarkDrawable(null);
                    checkview3.setChecked(false);
                }
                else
                {
                    checkview3.setCheckMarkDrawable(R.drawable.checked);
                    checkview3.setChecked(true);
                }
                if (checked4[0] == false)
                {
                    checkview4.setCheckMarkDrawable(null);
                    checkview4.setChecked(false);
                }
                else
                {
                    checkview4.setCheckMarkDrawable(R.drawable.checked);
                    checkview4.setChecked(true);
                }
                if (checked5[0] == false)
                {
                    checkview5.setCheckMarkDrawable(null);
                    checkview5.setChecked(false);
                }
                else
                {
                    checkview5.setCheckMarkDrawable(R.drawable.checked);
                    checkview5.setChecked(true);
                }
                if (checked6[0] == false)
                {
                    checkview6.setCheckMarkDrawable(null);
                    checkview6.setChecked(false);
                }
                else
                {
                    checkview6.setCheckMarkDrawable(R.drawable.checked);
                    checkview6.setChecked(true);
                }
            }


        });
        */

    }
}

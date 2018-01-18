package acbcmedia.com.Control_Page.Schedule;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import acbcmedia.com.Control_Page.R;


public class SunEvening extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_evening);


        ListView list = (ListView) findViewById(R.id.sunEvening);
        Log.d(TAG, "onCreate: Started.");

        ArrayList<String> names = new ArrayList<>();
        names.add("SUNDAY NIGHT PROGRAM");
        names.add("Thuthannak:         Inteek");
        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");

        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");
        names.add("Praise and Worshp Team");
        names.add("Thuthannak:         Inteek");
        names.add("Thuthannak:         Inteek");
        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");

        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");
        names.add("Thuthannak:         Inteek");
        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");

        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.content_sun_evening, names);
        list.setAdapter(adapter);
    }

}

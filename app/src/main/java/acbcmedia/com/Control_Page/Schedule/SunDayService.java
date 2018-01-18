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


public class SunDayService extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_day_service);

        ListView list = (ListView) findViewById(R.id.sunDayService);
        Log.d(TAG, "onCreate: Started.");

        ArrayList<String> names = new ArrayList<>();
        names.add("SUNDAY sun Program");

        names.add("Thuthannak:         Inteek");
        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");
        names.add("Bible Zohlo Zuamawk  CCBC, ACBC, FBCI, FCCI, CCBC");
        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");
        names.add("Solo Zuawmawknak      ACBC, FBCI, FCCI, CEBC, FBCMD,");
        names.add("Thuthangtha      Rev. Dr. Khaw Lian Uk,");
        names.add("Thuthangtha       Rev. Dr. Stephen Hre Kio");
        names.add("Thuthannak:         Inteek");
        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");
        names.add("Bible Zohlo Zuamawk  CCBC, ACBC, FBCI, FCCI, CCBC");
        names.add("Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI");
        names.add("Praise and Worshp Team");
        names.add("Thuthannak:         Inteek");


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.content_sun_day_service, names);
        list.setAdapter(adapter);


    }

}

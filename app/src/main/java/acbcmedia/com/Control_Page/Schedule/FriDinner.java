package acbcmedia.com.Control_Page.Schedule;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import acbcmedia.com.Control_Page.R;

import android.util.Log;
//import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class FriDinner extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridaydinner);

        ListView list = (ListView) findViewById(R.id.theList);
        Log.d(TAG, "onCreate: Started.");

        ArrayList<String> names = new ArrayList<>();
        names.add("Friday Zaan Rawl einak");
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


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        list.setAdapter(adapter);


    }

}

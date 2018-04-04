package acbcmedia.com.Control_Page.Locations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

import acbcmedia.com.Control_Page.R;
public class Location1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location1);
        //Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.location_listView);

        //Create the Person objects
        /*
        Person john = new Person("John","12-20-1998","Male",
                getResources().getIdentifier("@drawable/cartman_cop", null,this.getPackageName()));
                */


    }
}

package acbcmedia.com.Control_Page;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by vmang on 3/18/18.
 */

public class Testing extends AppCompatActivity{

    private static final String TAG = "SecondScreen";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_place);
        Log.d(TAG, "onCreate: Starting.");
        ListView mListView = (ListView) findViewById(R.id.listFood);


    }
}

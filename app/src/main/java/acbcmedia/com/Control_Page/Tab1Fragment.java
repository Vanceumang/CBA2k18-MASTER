package acbcmedia.com.Control_Page;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class Tab1Fragment extends Fragment {

    private static final String TAG = "Tab1Fragment";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstances){

        View view = inflater.inflate(R.layout.fragment1_layout, container, false);
        String[] menuItems ={
                "Praise and Worshp",
                "Thuthannak:         Inteek",
                "Bible zoh lo zuamawk:   CCBC, ACBC, FBCI, FCCI",
                "Praise and Worshp",
                "Thuthannak:         Inteek",
                "Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI", "Thuthangtha:   Rev. Dr. Khaw Lian Uk",
                "Bible zoh lo zuamawk:   CCBC, ACBC, FBCI, FCCI",
                "Praise and Worshp",
                "Thuthannak:         Inteek",
                "Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI",
                "Bible zoh lo zuamawk:   CCBC, ACBC, FBCI, FCCI",
                "Praise and Worshp",
                "Thuthannak:         Inteek",
                "Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI","Bible zoh lo zuamawk:   CCBC, ACBC, FBCI, FCCI",
                "Praise and Worshp",
                "Thuthannak:         Inteek",
                "Nubu Laam zuamawk    CCBC, ACBC, FBCI, FCCI"};
        ListView listView = (ListView) view.findViewById(R.id.mainMenu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1,menuItems);

        listView.setAdapter(listViewAdapter);



        //onflate the layout for this fragment
        return view;

    }
}
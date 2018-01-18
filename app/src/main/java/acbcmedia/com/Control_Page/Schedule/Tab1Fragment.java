package acbcmedia.com.Control_Page.Schedule;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import acbcmedia.com.Control_Page.R;


public class Tab1Fragment extends Fragment implements View.OnClickListener{

    public Tab1Fragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);


        // Three buttons are call here
        Button DayService = (Button) view.findViewById(R.id.Fri_Dinner);
        DayService.setOnClickListener(this);
        Button Lunch_Dinner = (Button) view.findViewById(R.id.FriEvening);
        Lunch_Dinner.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Fri_Dinner:
                // launch Activity
                Intent intent = new Intent(getActivity(), FriDinner.class);
                startActivity(intent);
                break;
            case R.id.FriEvening:
                // launch Activity
                Intent intent1 = new Intent(getActivity(), FriEvening.class);
                startActivity(intent1);
                break;

        }

    }
}
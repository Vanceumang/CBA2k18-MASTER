package acbcmedia.com.Control_Page;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Tab2Fragment extends Fragment {

    public Tab2Fragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);

        Button DayService = (Button) view.findViewById(R.id.DayService);
        DayService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),SatDayService.class);
                in.putExtra("Some", "some data");
                startActivity(in);
            }
        });

        return view;
    }
}
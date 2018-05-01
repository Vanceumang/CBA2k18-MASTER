package acbcmedia.com.Control_Page;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


//This class is the adapter for the recyclerView
public class RecyclerOptionsAdapter extends RecyclerView.Adapter<RecyclerOptionsAdapter.ViewHolder> {
    private String[] optionsList;
    private Context mContext;
    private static final String TAG = "RecyclerOptionsAdapter";

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView optionsTextView;
        private LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            optionsTextView = itemView.findViewById(R.id.options_textview);
            parentLayout = itemView.findViewById(R.id.recycler_linear);
        }
    }


    public RecyclerOptionsAdapter(Context context, String[] options) {
        mContext = context;
        this.optionsList = options;
    }

    //     inflate the item layout and create the holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

//        Inflate the custom view
        View optionsView = inflater.inflate(R.layout.item_options, parent, false);

//        Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(optionsView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
//        Get model data based on position
        final String option = optionsList[position];

        final TextView textView = holder.optionsTextView;
        textView.setText(option);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: " + optionsList[position]);
                Toast.makeText(mContext, optionsList[position], Toast.LENGTH_SHORT).show();

//                switch (position) {
//                    case 0:
//                        Intent myIntent = new Intent(mContext, Contact1.class);
//                        mContext.startActivity(myIntent);
//                        break;
//                    default:
//                        break;
//                }

            }
        });

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return optionsList.length;
    }
}

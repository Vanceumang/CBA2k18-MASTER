package acbcmedia.com.Control_Page;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


//This class is the adapter for the recyclerView
public class RecyclerOptionsAdapter extends RecyclerView.Adapter<RecyclerOptionsAdapter.ViewHolder> {
    private String[] optionsList, speakerTop, speakerBottom;
    private Context mContext;
    private Boolean isItSpeakers; //The adapter acts differently over for the speakers
    private static final String TAG = "RecyclerOptionsAdapter";

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView optionsTextView, speakerTopText, speakerBottomText;
        private LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            if (isItSpeakers) {
                speakerTopText = itemView.findViewById(R.id.speakerTop);
                speakerBottomText = itemView.findViewById(R.id.speakerBottom);
            } else {
                optionsTextView = itemView.findViewById(R.id.options_textview);
                parentLayout = itemView.findViewById(R.id.recycler_linear);
            }
        }
    }

    public RecyclerOptionsAdapter(Context context, String[] options) {
        mContext = context;
        this.optionsList = options;
        isItSpeakers = false;
    }

    public RecyclerOptionsAdapter(Context mContext, String[] speakerTop, String[] speakerBottom) {
        this.mContext = mContext;
        this.speakerTop = speakerTop;
        this.speakerBottom = speakerBottom;
        isItSpeakers = true;
    }

    //     inflate the item layout and create the holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View optionsView;

//        Inflate the custom view
        if (isItSpeakers) {
            optionsView = inflater.inflate(R.layout.cardview_items, parent, false);
        } else {
            optionsView = inflater.inflate(R.layout.item_options, parent, false);
        }

//        Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(optionsView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

//        Get the model data based on the current position
        if (isItSpeakers) {
            final String speakerTopText = speakerTop[position];
            final String speakerBotText = speakerBottom[position];

            final TextView topTextView = holder.speakerTopText;
            final TextView botTextView = holder.speakerBottomText;

            topTextView.setText(speakerTopText);
            botTextView.setText(speakerBotText);
        } else {
//        Get model data based on position
            final String option = optionsList[position];

            final TextView textView = holder.optionsTextView;
            textView.setText(option);
        }

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        if (isItSpeakers) {
            return speakerTop.length;
        } else {
            return optionsList.length;
        }
    }
}

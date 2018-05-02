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
    private String[] optionsList, speakerTop, speakerBottom, optionsTextBot;
    private Context mContext;
    private Boolean isItSpeakers; //The adapter acts differently over for the speakers
    private String className;
    private static final String TAG = "RecyclerOptionsAdapter";

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView optionsTextView, optionsTextViewBot, speakerTopText, speakerBottomText;
        private LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            if (isItSpeakers) {
                speakerTopText = itemView.findViewById(R.id.speakerTop);
                speakerBottomText = itemView.findViewById(R.id.speakerBottom);
            } else if (className.equals("Contact1")) {
                optionsTextView = itemView.findViewById(R.id.options_contactview);
                optionsTextViewBot = itemView.findViewById(R.id.options_contactview_lower);

//                optionsTextView.setTextSize(14);
//                optionsTextViewBot.setTextSize(14);

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
        this.className = context.getClass().getSimpleName();
    }

    public RecyclerOptionsAdapter(Context context, String[] speakerTop, String[] speakerBottom) {
        this.mContext = context;
        this.speakerTop = speakerTop;
        this.speakerBottom = speakerBottom;
        isItSpeakers = true;
        this.className = context.getClass().getSimpleName();
    }

    public RecyclerOptionsAdapter(Context context, String[] optionsList, String[] optionsTextViewBot, Boolean isItSpeakers) {
        this.mContext = context;
        this.optionsList = optionsList;
        this.optionsTextBot = optionsTextViewBot;
        this.isItSpeakers = isItSpeakers;
        this.className = context.getClass().getSimpleName();
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
        } else if (className.equals("Contact1")) {
            optionsView = inflater.inflate(R.layout.item_contact_options, parent, false);
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
        } else if (className.equals("Contact1")) {
//        Get model data based on position
            final String option = optionsList[position];
            final String phone = optionsTextBot[position];

            final TextView textView = holder.optionsTextView;
            final TextView botText = holder.optionsTextViewBot;
            textView.setText(option);
            botText.setText(phone);
        } else {
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

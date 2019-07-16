package sg.edu.rp.c346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Box> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivBoxImage = rowView.findViewById(R.id.ivImage);

        Box currentBox = boxList.get(position);
        String currentColor = currentBox.getColor();


        if (currentColor.equalsIgnoreCase("Blue")) {
            ivBoxImage.setImageResource(R.drawable.blue_box);
        } else if (currentColor.equalsIgnoreCase("Brown")) {
            ivBoxImage.setImageResource(R.drawable.brown_box);
        } else {
            // Orange //
            ivBoxImage.setImageResource(R.drawable.orange_box);
        }

        return rowView;
    }

}

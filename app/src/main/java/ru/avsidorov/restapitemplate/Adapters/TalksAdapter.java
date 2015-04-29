package ru.avsidorov.restapitemplate.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ru.avsidorov.restapitemplate.Models.Talks_;
import ru.avsidorov.restapitemplate.R;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */
public class TalksAdapter extends ArrayAdapter<Talks_> {
    ViewHolder mHolder;
    Context mContext;


    public TalksAdapter(Context context, int resource, ArrayList<Talks_> objects) {
        super(context, resource, objects);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Talks_ talk = (Talks_) getItem(position);
        View rowView = convertView;
        if (rowView == null) {
            rowView = LayoutInflater.from(getContext()).inflate(R.layout.talks_item, parent, false);
            mHolder = new ViewHolder();
            mHolder.name = (TextView) rowView.findViewById(R.id.talkName);
            mHolder.description = (TextView) rowView.findViewById(R.id.talkDescription);



            rowView.setTag(mHolder);

        } else {
            mHolder = (ViewHolder) rowView.getTag();
        }

        mHolder.name.setText(talk.getName());
        mHolder.description.setText(talk.getDescription());
        return rowView;
    }

    public static class ViewHolder {
        TextView name;
        TextView description;



    }


}

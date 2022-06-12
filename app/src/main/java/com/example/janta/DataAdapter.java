package com.example.janta;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<numbers> {

    public DataAdapter(Context context, ArrayList<numbers> num) {

        super(context, 0, num);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View recylceView = convertView;
        if (recylceView == null) {
            recylceView = LayoutInflater.from(getContext()).inflate(R.layout.item_emer, parent, false);
        }
        numbers currentWord = getItem(position);

        TextView text = (TextView) recylceView.findViewById(R.id.text);
        text.setText(currentWord.getHelpLineNo());

        ImageView image = (ImageView) recylceView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getHelpImage());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }
        return recylceView;
    }
}

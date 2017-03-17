package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by boss on 11/02/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int activityColor = 0;

    public WordAdapter(Activity context, ArrayList<Word> words, int activityColor){
        super(context, 0, words);
        this.activityColor = activityColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);

        // It means the listView hasn't been populated
        if(convertView == null){
            // Inflate means that Android OS will render the view
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        convertView.setBackgroundColor(this.activityColor);

        ImageView miwokImageView = (ImageView)convertView.findViewById(R.id.miwok_image_view);
        TextView defaultTextView = (TextView)convertView.findViewById(R.id.default_text_view);
        TextView miwokTextView = (TextView)convertView.findViewById(R.id.miwok_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());
        miwokTextView.setText(currentWord.getMiwokTranslation());

        if( currentWord.hasImage())
            miwokImageView.setImageResource(currentWord.getImageResourceID());
        else
            miwokImageView.setVisibility(View.GONE);

        return convertView;
    }
}

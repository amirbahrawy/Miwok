package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amir on 01/05/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
  // this variable for id for background color of list view
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> wordAdapters,int mColorResourceId) {
        super(context, 0, wordAdapters);
        this.mColorResourceId=mColorResourceId;

    }

    @Override
    public View getView(int postion, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
      Word currentWord= getItem(postion);

        TextView defaultTranslations=(TextView) listItemView.findViewById(R.id.defaultText);
        TextView miowkTranslations=(TextView) listItemView.findViewById(R.id.miowkText);
        ImageView iconImage=(ImageView) listItemView.findViewById(R.id.image);
        defaultTranslations.setText(currentWord.getDefaultTranslation());
         miowkTranslations.setText(currentWord.getmMiowkTranslation());
         if(currentWord.getImage()) {
             iconImage.setImageResource(currentWord.getImageResourceId());
             iconImage.setVisibility(View.VISIBLE);
         }
         else
            iconImage.setVisibility(View.GONE);

         //set the theme color for the lis item
        View textContainer=listItemView.findViewById(R.id.text_container);
        //find the color that the resource maps to
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        //set the background color
        textContainer.setBackgroundColor(color);
        return listItemView;

    }
}
package com.example.android.miwok;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import java.util.ArrayList;

import static android.widget.Toast.makeText;

public class FamilyActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View K=inflater.inflate(R.layout.activity_word, container, false);
        ArrayList<Word> family =new ArrayList<Word>();
        family.add(new Word("Father","әpә",R.drawable.family_father));
        family.add(new Word("mother","әṭa",R.drawable.family_mother));
        family.add(new Word("son","angsi",R.drawable.family_son));
        family.add(new Word("daughter","tune",R.drawable.family_daughter));
        family.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        family.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        family.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        family.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        family.add(new Word("grand mother","ama",R.drawable.family_grandmother));
        family.add(new Word("grand father","paapa",R.drawable.family_grandfather));
        WordAdapter adapter =new WordAdapter(getActivity(),family,R.color.family_background);
        ListView listView  =(ListView) K.findViewById(R.id.list_number);
        listView.setAdapter(adapter);
        return K;
    }


}




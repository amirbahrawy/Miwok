package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View K=inflater.inflate(R.layout.activity_word, container, false);
        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("where are you gonig ?","minto wuksus"));
        words.add(new Word("whats your name ?","tinnә oyaase'nә"));
        words.add(new Word("my name is","oyaaset"));
        words.add(new Word("how are you feeling ?","michәksәs"));
        words.add(new Word("i,m feeling good","kuchi achit"));
        words.add(new Word("are you coming ? ","әәnәs'aa?" ));
        words.add(new Word("yes i,m coming ","hәә’ әәnәm"));
        WordAdapter adapter =new WordAdapter(getActivity(),words,R.color.phrase_background);
        ListView listView  =(ListView) K.findViewById(R.id.list_number);
        listView.setAdapter(adapter);
    return K;
    }
}

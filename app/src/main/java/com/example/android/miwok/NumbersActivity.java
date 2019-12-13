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

public class NumbersActivity extends Fragment {

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
        View K=inflater.inflate(R.layout.activity_word, container, false);
        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("One","Lutti",R.drawable.number_one));
        words.add(new Word("Two","Otiiko",R.drawable.number_two));
        words.add(new Word("Three","tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine));
        words.add(new Word("ten","na'aacha",R.drawable.number_ten));
        WordAdapter adapter =new WordAdapter(getActivity(),words,R.color.numbers_background);
        ListView listView  =(ListView) K.findViewById(R.id.list_number);
        listView.setAdapter(adapter);
            return K;
        }


}




package com.nnm.team91.mine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by tristan on 2016-11-03.
 */

public class TodoFragment extends Fragment {
    String[] tag = {"#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag", "#Todotag"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.listfragment_todo, container, false);
        ListView listView = (ListView) view.findViewById(R.id.todoList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, tag);
        listView.setAdapter(adapter);
        return view;
    }
}

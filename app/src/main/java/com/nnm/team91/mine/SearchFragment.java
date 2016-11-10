package com.nnm.team91.mine;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * Created by tristan on 2016-11-10.
 */

public class SearchFragment extends ListFragment {

    ListViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Adapter 생성 및 Adapter 지정.
        adapter = new ListViewAdapter();
        setListAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.search_img), "");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.sharp_img), "이전 검색어", ContextCompat.getDrawable(getActivity(), R.drawable.cross_img));

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        ListViewItem item = (ListViewItem) l.getItemAtPosition(position);
        Drawable sharp = item.getSharpImg();
        String edt = item.getEdtStr();
        Drawable cross = item.getCrossImg();

        super.onListItemClick(l, v, position, id);
    }
}

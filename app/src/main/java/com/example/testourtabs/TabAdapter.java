package com.example.testourtabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class TabAdapter extends PagerAdapter {

    private Context context;

    public TabAdapter(Context context){
        this.context = context;
    }

    @NonNull @Override public Object instantiateItem(@NonNull ViewGroup collection, int position){
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = null;
        if (position==0){
            v = inflater.inflate(R.layout.applied_task, collection, false);
        }
        if (position==1){
            v = inflater.inflate(R.layout.created_task,collection,false);
        }
        collection.addView(v);
        return v;
    }

    public View getTabView(int position) {
        TextView textView = new TextView(context);
        if (position == 0) {
            textView.setText("applieD");
        }
        if (position == 1) {
            textView.setText("createD");
        }
        return textView;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}

package com.example.testourtabs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class qq extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    Button button;

    public static void start(final Context context){
        Intent intent = new Intent(context, qq.class);
        context.startActivity(intent);
        initContext(context);
    }

    public static qq newInstance(int page){
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        qq fragment = new qq();
        fragment.setArguments(args);
        return fragment;
    }


    private static Context context;
    public static void initContext(Context contexed) {
        context = contexed;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPage = getArguments().getInt(ARG_PAGE);
        }
        initView();
    }

    @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        TextView textView = (TextView) view;
        textView.setText("Fragment #" + mPage);
        return view;
    }
private void initView(){
       /*button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"FuckYou",Toast.LENGTH_LONG).show();
            }
        });*/

}
}

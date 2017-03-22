package com.hrc.administrator.myapplication;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private ImageView iv;
    private EditText editText;
    private AnimatedVectorDrawable searchTobar,barTosearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        iv= (ImageView) findViewById(R.id.search);
        editText= (EditText) findViewById(R.id.text);

        searchTobar= (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_search_to_bar,null);
        barTosearch= (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_bar_to_search,null);

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageDrawable(searchTobar);
                searchTobar.start();
            }
        });
    }

    public void lost_focus(View view) {
        iv.setImageDrawable(barTosearch);
        barTosearch.start();
    }
}

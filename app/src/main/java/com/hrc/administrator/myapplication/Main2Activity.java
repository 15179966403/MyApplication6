package com.hrc.administrator.myapplication;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnFocusChangeListener, TextWatcher {
    private ImageView img1;
    private EditText edit1,edit2;
    private AnimatedVectorDrawable anim1,anim2,anim3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img1= (ImageView) findViewById(R.id.img1);
        edit1= (EditText) findViewById(R.id.edit1);
        edit2= (EditText) findViewById(R.id.edit2);

        anim1= (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim1,null);
        anim2= (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim2,null);
        anim3= (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim3,null);

        edit1.setOnFocusChangeListener(this);
        edit2.setOnFocusChangeListener(this);

        edit1.addTextChangedListener(this);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        switch (v.getId()){
            case R.id.edit1:
                if (hasFocus){
                    img1.setImageDrawable(anim1);
                    anim1.start();
                }
                break;
            case R.id.edit2:
                if (hasFocus){
                    img1.setImageDrawable(anim3);
                    anim3.start();
                }
                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (!TextUtils.isEmpty(s)&&edit1.getText().toString().trim().equals("1234")){
            Toast.makeText(Main2Activity.this,"right",Toast.LENGTH_SHORT).show();
            img1.setImageDrawable(anim2);
            anim2.start();
        }
    }
}

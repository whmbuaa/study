package com.quick.databindingstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_basic)
    Button mBtnBasic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }
    private void init(){
        mBtnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               BasicActivity.launch(v.getContext());
            }
        });
    }
}

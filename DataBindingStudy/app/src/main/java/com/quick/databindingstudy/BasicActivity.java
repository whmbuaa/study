package com.quick.databindingstudy;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.quick.databindingstudy.databinding.ActivityBasicBinding;
import com.quick.databindingstudy.model.UUser;
import com.quick.databindingstudy.model.User;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BasicActivity extends AppCompatActivity {

    @BindView(R.id.btn_change_data)
    Button mBtnChangeData;
    private User mUser;
    private ActivityBasicBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         mBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_basic);
        ButterKnife.bind(this);
        mUser = new User("fei", "Liang", 27);
        mBinding.setUser(mUser);

        init();
    }
    private void init(){
        mBtnChangeData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUser.setFirstName("xuxu");
                mUser.setAge(9);
                mUser.setLastName("han");

            }
        });
    }
    public static void launch(Context context){
        Intent intent = new Intent(context,BasicActivity.class);
        context.startActivity(intent);
    }
}

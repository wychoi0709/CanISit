package com.wonyoung.canisit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by WonYoung on 16. 8. 15..
 */
public class ResultActivity extends AppCompatActivity{

    @BindView(R.id.resultRecyclerView)
    RecyclerView resultRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
    }

}

package com.izadalab.cleanarchitecturetraining.presentation.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.izadalab.cleanarchitecturetraining.R;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView ;
    @BindView(R.id.progress)
    ProgressBar progressBar ;
    @BindView(R.id.error)
    TextView errorText ;

    @Override
    public int getContentLayout() {
        return R.layout.activity_main ;
    }

    @Override
    public void initComponents() {
    }


}

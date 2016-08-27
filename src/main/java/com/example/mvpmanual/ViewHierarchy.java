package com.example.mvpmanual;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ViewHierarchy extends AppCompatActivity implements View.OnClickListener, IView {


    private Button add;
    private Button minus;
    private Button multiply;
    private Button divide;
    private IPresenter iPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        iPresenter = new Presenter(this);
    }

    @Override
    public void onClick(View view) {
        iPresenter.viewCall(view);
    }

    @Override
    public void viewResult(int result) {
        System.out.println("result:" + result);
    }
}

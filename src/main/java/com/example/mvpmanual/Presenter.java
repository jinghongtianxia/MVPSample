package com.example.mvpmanual;

import android.view.View;

/**
 * Created by Administrator on 2016/8/26.
 */
public class Presenter implements IPresenter {

    private IView iView;
    private IModel iModel;

    public Presenter(IView iView) {
        this.iView = iView;
        this.iModel = new Model(this);
    }


    @Override
    public void modelResult(int result) {
        iView.viewResult(result);
    }

    @Override
    public void viewCall(View view) {
        switch (view.getId()){
            case R.id.add:
                iModel.add(8,13);
                break;
            case R.id.minus:
                iModel.minus(98,82);
                break;
            case R.id.multiply:
                iModel.multiply(23,9);
                break;
            case R.id.divide:
                iModel.divide(90,15);
                break;
            default:
                System.out.println("error");
        }
    }
}

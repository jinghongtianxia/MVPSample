package com.example.mvpmanual;

/**
 * Created by Administrator on 2016/8/26.
 */
public class Model implements IModel {

    private IPresenter iPresenter;

    public Model(IPresenter iPresenter) {
        this.iPresenter = iPresenter;
    }

    @Override
    public void add(int a, int b) {
        iPresenter.modelResult(a + b);
    }

    @Override
    public void minus(int a, int b) {
        iPresenter.modelResult(a - b);
    }

    @Override
    public void multiply(int a, int b) {
        iPresenter.modelResult(a * b);
    }

    @Override
    public void divide(int a, int b) {
        iPresenter.modelResult(a / b);
    }
}

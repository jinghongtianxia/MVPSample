package com.example.mvpmanual;

import android.view.View;

/**
 * Created by Administrator on 2016/8/26.
 */
public interface IPresenter {
    void modelResult(int result);
    void viewCall(View view);
}

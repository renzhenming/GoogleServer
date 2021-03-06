package com.rzm.commonlibrary.stack.demo;

import android.content.Context;

import com.rzm.commonlibrary.stack.mvp.presenter.BasePresenter;

/**
 * Created by rzm on 2017/8/5.
 */

public class MainPresenter extends BasePresenter<MainView> {

    private MainModel mainModel;

    public MainPresenter(Context context) {
        super(context);
        this.mainModel = new MainModel();
    }

    public void login(String username, String password){
        mainModel.login(username, password, new MainView() {
            @Override
            public void onLoginSuccess(String result) {
                getView().onLoginSuccess(result);
            }

            @Override
            public void onLoginFailed(String result) {
                getView().onLoginFailed(result);
            }
        });
    }
}

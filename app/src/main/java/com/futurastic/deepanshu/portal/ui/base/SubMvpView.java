package com.futurastic.deepanshu.portal.ui.base;

/**
 * Created by deepanshu on 16/3/18.
 */

public interface SubMvpView extends MvpView {
    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void attachParentMvpView(MvpView mvpView);
}

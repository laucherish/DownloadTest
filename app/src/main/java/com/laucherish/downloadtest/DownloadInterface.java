package com.laucherish.downloadtest;

/**
 * Created by laucherish on 2017/10/4.
 */

public interface DownloadInterface {

    void onProgress(int progress);


    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}

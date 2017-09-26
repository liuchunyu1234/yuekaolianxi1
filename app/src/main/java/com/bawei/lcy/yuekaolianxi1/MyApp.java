package com.bawei.lcy.yuekaolianxi1;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by LCY on 2017/9/19.
 */

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration aDefault = ImageLoaderConfiguration.createDefault(this);
        ImageLoader.getInstance().init(aDefault);
    }
}

package com.bawei.lcy.yuekaolianxi1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends AppCompatActivity {

    private Banner banner;
    private Button button;
    private List<String> list;
    private static final String BANNER[] = new String[]{
            "http://juheimg.oss-cn-ha…08_b329262313d97d9d.jpg",
            "http://juheimg.oss-cn-ha…08_2fb703a965d000b5.jpg",
            "http://juheimg.oss-cn-ha…08_6c53224efe151d84.jpg",
            "http://juheimg.oss-cn-ha…08_3ff0b4622ed21b57.jpg",
            "http://juheimg.oss-cn-ha…08_c7b4c6c2a9b6bd6d.jpg",
            "http://juheimg.oss-cn-ha…08_74128fa6ca93ca4a.jpg",
            "http://juheimg.oss-cn-ha…08_c9b044b98d2b1e8b.jpg",
            "http://juheimg.oss-cn-ha…08_06ea598f5f2593e2.jpg",
            "http://juheimg.oss-cn-ha…08_a528c52a13cf9f07.jpg",
            "http://juheimg.oss-cn-ha…08_b641527e8451f21a.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        banner = (Banner) findViewById(R.id.banner);
        button = (Button) findViewById(R.id.button);

        list = new ArrayList<>();
        for(int i = 0;i<BANNER.length;i++){
            list.add(BANNER[i]);
        }

        //设置加载样式
        banner.setIndicatorGravity(Banner.CENTER);
        banner.setBannerStyle(Banner.CIRCLE_INDICATOR_TITLE);
        //是否自动轮播
        banner.isAutoPlay(true);
        //设置轮播的时间间隔
        banner.setDelayTime(2000);
        //设置加载的图片，解析出来的url
        banner.setImages(list);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}

package com.bawei.lcy.yuekaolianxi1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout activity_main;
    private ListView lv;
    private List<CelaBean> beanList;

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private String[] channels = {"推荐","热点","体育","娱乐","社会","汽车","教育","财经","科技","游戏"};
    private String[] Urls={"http://gank.io/api/data/Android/10/1",
            "http://gank.io/api/data/Android/10/2",
            "http://gank.io/api/data/Android/10/3",
            "http://gank.io/api/data/Android/10/4",
            "http://gank.io/api/data/Android/10/5",
            "http://gank.io/api/data/Android/10/6",
            "http://gank.io/api/data/Android/10/7",
            "http://gank.io/api/data/Android/10/8",
            "http://gank.io/api/data/Android/10/9",
            "http://gank.io/api/data/Android/10/10",
    };
    private LayoutInflater mInflater;
    private List<ChannelFragment> mViewList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity_main = (DrawerLayout) findViewById(R.id.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        beanList = new ArrayList<CelaBean>();

        beanList.add(new CelaBean(R.mipmap.ic_launcher,"QQ"));
        beanList.add(new CelaBean(R.mipmap.ic_launcher,"我的"));
        beanList.add(new CelaBean(R.mipmap.ic_launcher,"你的"));
        beanList.add(new CelaBean(R.mipmap.ic_launcher,"他的"));

        CelaAdapter dapter = new CelaAdapter(beanList,MainActivity.this);
        lv.setAdapter(dapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                activity_main.closeDrawer(lv);
            }
        });

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager = (ViewPager) findViewById(R.id.vp_view);
        mInflater = LayoutInflater.from(this);

        for (int i = 0; i < channels.length; i++) {
            //创建栏目的fragment
            ChannelFragment fragment = new ChannelFragment();
            Bundle b = new Bundle();
            b.putString("name", channels[i]);//传递名字
            b.putString("url", Urls[i]);
            fragment.setArguments(b);
            //收集fragment
            mViewList.add(fragment);
            //给tablayout添加tab选项卡
            mTabLayout.addTab(mTabLayout.newTab().setText(channels[i]));//添加tab选项卡

        }
        FragmentManager fm = getSupportFragmentManager();
        MyFragmentPagerAdapter adapter=new MyFragmentPagerAdapter(fm,mViewList);
        mViewPager.setAdapter(adapter);//关联适配器
        mTabLayout.setupWithViewPager(mViewPager);//将Tablayout与Viewpager建立连接

    }
    class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        private List<ChannelFragment> mViewList;

        public MyFragmentPagerAdapter(FragmentManager fm, List<ChannelFragment> mViewList) {
            super(fm);
            this.mViewList = mViewList;
        }

        @Override
        public ChannelFragment getItem(int position) {
            return mViewList.get(position);
        }

        @Override
        public int getCount() {
            return mViewList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {

            return channels[position];//页卡标题
        }
    }
}

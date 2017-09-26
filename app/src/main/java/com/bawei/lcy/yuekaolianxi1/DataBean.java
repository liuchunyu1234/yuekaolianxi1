package com.bawei.lcy.yuekaolianxi1;

import java.util.List;

/**
 * Created by LCY on 2017/9/19.
 */

public class DataBean {


    /**
     * error : false
     * results : [{"_id":"59b7909f421aa911847a0391","createdAt":"2017-09-12T15:45:35.132Z","desc":"View的事件分发机制\u2014\u2014由浅入深解析","publishedAt":"2017-09-19T12:07:31.405Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/e6ceb7f767d8","used":true,"who":"匡罡"},{"_id":"59bfe526421aa911847a03b3","createdAt":"2017-09-18T23:24:22.545Z","desc":"一个简约番茄时钟的实现思路","images":["http://img.gank.io/cc9e461f-3e8d-456f-bba5-e15b80509dfb"],"publishedAt":"2017-09-19T12:07:31.405Z","source":"web","type":"Android","url":"http://rkhcy.github.io/2017/09/18/TomatoView%E5%AE%9E%E7%8E%B0/","used":true,"who":"HuYounger"},{"_id":"59c073e1421aa91187870812","createdAt":"2017-09-19T09:33:21.169Z","desc":"2017 Android插件化框架总结","publishedAt":"2017-09-19T12:07:31.405Z","source":"web","type":"Android","url":"https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247486927&idx=1&sn=29e7439c220387f34df232f04ab283ac","used":true,"who":"陈宇明"},{"_id":"59c08826421aa9118887ac42","createdAt":"2017-09-19T10:59:50.923Z","desc":"快速的 UI 修改工具，帮助你在开发阶段无需一次次修改小参数，编译看效果。","images":["http://img.gank.io/637974ea-4718-4d5a-899b-561856cb2ba0"],"publishedAt":"2017-09-19T12:07:31.405Z","source":"chrome","type":"Android","url":"https://github.com/material-foundation/material-remixer-android","used":true,"who":"代码家"},{"_id":"59c08919421aa911847a03b6","createdAt":"2017-09-19T11:03:53.911Z","desc":"常用、好用的 Android Studio 插件集合。","publishedAt":"2017-09-19T12:07:31.405Z","source":"chrome","type":"Android","url":"https://github.com/balsikandar/Android-Studio-Plugins","used":true,"who":"代码家"},{"_id":"59b7a98e421aa911847a0392","createdAt":"2017-09-12T17:31:58.794Z","desc":"ViewStub学习","images":["http://img.gank.io/9f51b7bc-73d3-4ce4-bd59-c61cb0c64325"],"publishedAt":"2017-09-14T16:36:51.63Z","source":"web","type":"Android","url":"http://rkhcy.github.io/2017/09/12/ViewStub%E5%AD%A6%E4%B9%A0/","used":true,"who":"HuYounger"},{"_id":"59b7d963421aa911847a0394","createdAt":"2017-09-12T20:56:03.184Z","desc":"基于Snowflake算法而写的一种unique id生成器","publishedAt":"2017-09-14T16:36:51.63Z","source":"web","type":"Android","url":"https://github.com/zjutkz/ASnowflake","used":true,"who":null},{"_id":"59b8ad56421aa911878707ed","createdAt":"2017-09-13T12:00:22.260Z","desc":"看我逆向小米rom层应用做碎片化适配","publishedAt":"2017-09-14T16:36:51.63Z","source":"web","type":"Android","url":"https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247486906&idx=1&sn=d6f473abffdea7b2ece6f6bb1f72e084","used":true,"who":"陈宇明"},{"_id":"59b9dfc1421aa9118c8262c1","createdAt":"2017-09-14T09:47:45.123Z","desc":"一个用 Kotlin 写的查单词 idea 插件","images":["http://img.gank.io/4939784c-eea2-4b60-9c7a-d1b4d9f9c8b5"],"publishedAt":"2017-09-14T16:36:51.63Z","source":"web","type":"Android","url":"https://github.com/jungletian/BreakWords","used":true,"who":"ZhangTitanjum"},{"_id":"59ba01b6421aa911878707f5","createdAt":"2017-09-14T12:12:38.108Z","desc":"Floo 开源了，一个支持 AOP、栈控制、跨页面带信、和动态变更映射的 URL 路由","publishedAt":"2017-09-14T16:36:51.63Z","source":"web","type":"Android","url":"https://github.com/drakeet/Floo","used":true,"who":"drakeet"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 59b7909f421aa911847a0391
         * createdAt : 2017-09-12T15:45:35.132Z
         * desc : View的事件分发机制——由浅入深解析
         * publishedAt : 2017-09-19T12:07:31.405Z
         * source : web
         * type : Android
         * url : http://www.jianshu.com/p/e6ceb7f767d8
         * used : true
         * who : 匡罡
         * images : ["http://img.gank.io/cc9e461f-3e8d-456f-bba5-e15b80509dfb"]
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}

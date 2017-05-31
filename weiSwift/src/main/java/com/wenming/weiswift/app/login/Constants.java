/*
 * Copyright (C) 2010-2013 The SINA WEIBO Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wenming.weiswift.app.login;

public interface Constants {
    //图片形状
    public static final String IMGSIZE_HORIZONTAL = "1"; //水平方向的长方形尺寸
    public static final String IMGSIZE_VERTICAL = "2";//竖直方向的长方形尺寸
    public static final String IMGSIZE_SQUARE = "3";//正方形尺寸

    //首页分组
    public static final long GROUP_TYPE_ALL = 0;//全部微博
    public static final long GROUP_TYPE_FRIENDS_CIRCLE = 1;//好友圈


    //评论页分组
    public static final int GROUP_COMMENT_TYPE_ALL = 0x12;//全部评论
    public static final int GROUP_COMMENT_TYPE_FRIENDS = 0x13;//关注的人
    public static final int GROUP_COMMENT_TYPE_BYME = 0x14;//我发出的

    //@我的分组
    public static final int GROUP_RETWEET_TYPE_ALL = 0x15;//所有微博
    public static final int GROUP_RETWEET_TYPE_FRIENDS = 0x16;//关注人的微博
    public static final int GROUP_RETWEET_TYPE_ORIGINWEIBO = 0x17;//原创微博
    public static final int GROUP_RETWEET_TYPE_ALLCOMMENT = 0x18;//所有评论
    public static final int GROUP_RETWEET_TYPE_FRIEDNSCOMMENT = 0x19;//关注人的评论

    //我的微博
    public static final int GROUP_MYWEIBO_TYPE_ALL = 0;
    public static final int GROUP_MYWEIBO_TYPE_ORIGIN = 1;
    public static final int GROUP_MYWEIBO_TYPE_PICWEIBO = 2;

    //删除微博的类型
    public static final String DELETE_WEIBO_TYPE1 = "全部微博";

    public static final String DELETE_WEIBO_TYPE2 = "我的全部微博";
    public static final String DELETE_WEIBO_TYPE3 = "我的原创微博";
    public static final String DELETE_WEIBO_TYPE4 = "我的图片微博";
    public static final String DELETE_WEIBO_TYPE5 = "好友圈";
    public static final String DELETE_WEIBO_TYPE6 = "我的收藏";

}

package com.aomame.swipetwitter

import com.aomame.swipetwitter.entity.Tweet
import com.aomame.swipetwitter.entity.User

interface TwitterRepositoryInterface {
    //ホームのツイートを複数get
    //次一件目のツイートトークンと、ツイートの配列を返す
    fun getTweetsByHome(limit: Int, nextToken: String): Pair<String, List<Tweet>>

    //検索ツイートを複数get
    //次一件目のツイートトークンと、ツイートの配列を返す
    fun getTweetsBySearch(word: String,limit: Int, nextToken: String): Pair<String, List<Tweet>>

    //ツイートをいいね
    //いいねできたらTrueを返す
    fun postLike(tweetId: String): Boolean

    //ツイートをリツイート
    //リツイできたらTrueを返す
    fun postReTweet(tweetId: String): Boolean

    //自身のプロフィールをget
    //自身のUserを返す
    fun getProfile(): User
}
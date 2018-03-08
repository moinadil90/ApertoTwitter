package com.moin.android.twittertrends.model;

/**
 * Created by moin on 3/8/18.
 */
public class Trend implements Comparable<Trend> {

    public long tweet_volume;

    public String name;

    public String query;

    public String url;

    @Override
    public int compareTo(Trend another) {
        if (tweet_volume > another.tweet_volume)
            return 1;

        if (tweet_volume < another.tweet_volume)
            return -1;

        return 0;
    }
}

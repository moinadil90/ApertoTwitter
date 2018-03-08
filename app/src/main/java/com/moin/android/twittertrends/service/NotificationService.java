package com.moin.android.twittertrends.service;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.moin.android.twittertrends.R;
import com.moin.android.twittertrends.activity.ShowTweetActivity;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 */
public class NotificationService extends IntentService {

    private final int NOTIFICATION_ID = 30;

    public NotificationService() {
        super("NotificationService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
        builder.setSmallIcon(R.drawable.composer_logo_white);
        builder.setContentTitle("Aperto Twitter Trends");
        builder.setContentText("Latest trends near your Location!");
        builder.setAutoCancel(true);

        Intent showTweets = new Intent(getApplicationContext(), ShowTweetActivity.class);
        PendingIntent openActivity = PendingIntent.getActivity(getApplicationContext(), 0, showTweets, PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setContentIntent(openActivity);

        NotificationManager notifMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notifMgr.notify(NOTIFICATION_ID, builder.build());
    }


}

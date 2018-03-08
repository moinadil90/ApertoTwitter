package com.moin.android.twittertrends;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by moin on 3/8/18.
 */
public class OnBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            // As per your requirement, set the alarm here. Not setting it as of now, as
            // it was not the requirement mentioned in the task.
        }
    }
}

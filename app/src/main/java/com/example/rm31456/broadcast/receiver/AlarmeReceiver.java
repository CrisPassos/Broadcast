package com.example.rm31456.broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by rm31456 on 21/11/2016.
 */
public class AlarmeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Piiiiiiiiiiiiiiiiiiiiiiiiiii", Toast.LENGTH_SHORT).show();
        


    }
}

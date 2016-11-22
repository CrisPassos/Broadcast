package com.example.rm31456.broadcast.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import com.example.rm31456.broadcast.AlarmeActivity;
import com.example.rm31456.broadcast.R;

/**
 * Created by rm31456 on 21/11/2016.
 */
public class AlarmeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Piiiiiiiiiiiiiiiiiiiiiiiiiii", Toast.LENGTH_SHORT).show();
        enviarNotificacao(context);
    }

    private void enviarNotificacao(Context context){

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentIntent(PendingIntent.getActivity(
                    context, 0, new Intent(context, AlarmeActivity.class), PendingIntent.FLAG_UPDATE_CURRENT));
        builder.setContentTitle("Alarme disparado");
        builder.setContentTitle("Seu alarme foi disparado com sucesso");
        builder.setTicker("Nova Mensagem");

        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setAutoCancel(true);

        NotificationManager manager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        manager.notify(100,builder.build());
    }
}

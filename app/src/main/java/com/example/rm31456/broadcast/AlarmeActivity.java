package com.example.rm31456.broadcast;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.example.rm31456.broadcast.receiver.AlarmeReceiver;

public class AlarmeActivity extends AppCompatActivity {

    EditText edtTempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);

        edtTempo = (EditText) findViewById(R.id.edtTempo);
    }

    public void configurar(View v){
        String tempo = edtTempo.getText().toString();

        if (!tempo.equals("")){

            int t = Integer.parseInt(tempo);
            Intent i = new Intent(this, AlarmeReceiver.class);
            PendingIntent pi = PendingIntent.getBroadcast(
                    this.getApplicationContext(), 0, i, 0);

            //Retorna o serviço de alarme
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

            //qual é o tempo atual
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ (t * 1000), pi );

            Toast.makeText(this, "Configurado para daqui "+ t + " segundos", Toast.LENGTH_SHORT).show();
        }
    }
}

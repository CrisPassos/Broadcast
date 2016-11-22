package com.example.rm31456.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    public void entrar(View v){

        Intent i = new Intent();
        i.setAction("android.app.action.ACTION_PASSWORD_SUCCEEDED");
        sendBroadcast(i);

    }

    public void broadCast(View v){
        Intent i = new Intent();
        i.setAction("orderedbroadcast");
        sendBroadcast(i);
    }
}

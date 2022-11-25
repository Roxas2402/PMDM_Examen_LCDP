package com.example.lcdp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lcdp.constants.Constants;

public class MostrarPersonajeActivity extends AppCompatActivity {
    private TextView lblPersonaje;
    private TextView lblDescripcion;
    private ImageView imgPersonaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_personaje);
        inicia();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null && bundle.getString("BERLIN") != null) {
            lblPersonaje.setText(R.string.berlin);
            lblDescripcion.setText(R.string.descBerlin);
            imgPersonaje.setImageResource(R.drawable.berlin);
        }
        if (bundle != null && bundle.getString("DENVER") != null) {
            lblPersonaje.setText(R.string.denver);
            lblDescripcion.setText(R.string.descDenver);
            imgPersonaje.setImageResource(R.drawable.denver);
        }
        if (bundle != null && bundle.getString("MOSCU") != null) {
            lblPersonaje.setText(R.string.moscu);
            lblDescripcion.setText(R.string.descMoscu);
            imgPersonaje.setImageResource(R.drawable.moscu);
        }
        if (bundle != null && bundle.getString("RIO") != null) {
            lblPersonaje.setText(R.string.rio);
            lblDescripcion.setText(R.string.descRio);
            imgPersonaje.setImageResource(R.drawable.rio);
        }
        if (bundle != null && bundle.getString("TOKIO") != null) {
            lblPersonaje.setText(R.string.tokio);
            lblDescripcion.setText(R.string.descTokio);
            imgPersonaje.setImageResource(R.drawable.tokio);
        }
        if (bundle != null && bundle.getString("PROFE") != null) {
            lblPersonaje.setText(R.string.profe);
            lblDescripcion.setText(R.string.descProfe);
            imgPersonaje.setImageResource(R.drawable.el_profesor);
        }
    }

    private void inicia() {
        lblPersonaje = findViewById(R.id.lblNombreMostrar);
        lblDescripcion = findViewById(R.id.lblDescripcionMostrar);
        imgPersonaje = findViewById(R.id.imgPersonajeMostrar);
    }
}
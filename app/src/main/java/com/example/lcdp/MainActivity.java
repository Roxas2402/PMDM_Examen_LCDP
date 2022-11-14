package com.example.lcdp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lcdp.constants.Constants;

public class MainActivity extends AppCompatActivity {
    private TextView lblBerlin;
    private TextView lblDenver;
    private TextView lblProfe;
    private TextView lblMoscu;
    private TextView lblRio;
    private TextView lblTokio;

    private ImageView imgBerlin;
    private ImageView imgDenver;
    private ImageView imgProfe;
    private ImageView imgMoscu;
    private ImageView imgRio;
    private ImageView imgTokio;

    private ActivityResultLauncher<Intent> launcherBerlin;
    private ActivityResultLauncher<Intent> launcherDenver;
    private ActivityResultLauncher<Intent> launcherProfe;
    private ActivityResultLauncher<Intent> launcherMoscu;
    private ActivityResultLauncher<Intent> launcherRio;
    private ActivityResultLauncher<Intent> launcherTokio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializa();

        launchers();

        lblBerlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("BERLIN", Constants.BERLIN);
                intent.putExtras(bundle);
                launcherBerlin.launch(intent);
            }
        });

        imgBerlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("BERLIN", Constants.BERLIN);
                intent.putExtras(bundle);
                launcherBerlin.launch(intent);
            }
        });

        lblDenver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("DENVER", Constants.DENVER);
                intent.putExtras(bundle);
                launcherDenver.launch(intent);
            }
        });

        imgDenver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("DENVER", Constants.DENVER);
                intent.putExtras(bundle);
                launcherDenver.launch(intent);
            }
        });

        lblMoscu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("MOSCU", Constants.MOSCU);
                intent.putExtras(bundle);
                launcherMoscu.launch(intent);
            }
        });

        imgMoscu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("MOSCU", Constants.MOSCU);
                intent.putExtras(bundle);
                launcherMoscu.launch(intent);
            }
        });

        lblProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("PROFE", Constants.PROFE);
                intent.putExtras(bundle);
                launcherProfe.launch(intent);
            }
        });

        imgProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("PROFE", Constants.PROFE);
                intent.putExtras(bundle);
                launcherProfe.launch(intent);
            }
        });

        lblRio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("RIO", Constants.RIO);
                intent.putExtras(bundle);
                launcherRio.launch(intent);
            }
        });

        imgRio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("RIO", Constants.RIO);
                intent.putExtras(bundle);
                launcherRio.launch(intent);
            }
        });

        lblTokio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TOKIO", Constants.TOKIO);
                intent.putExtras(bundle);
                launcherTokio.launch(intent);
            }
        });

        imgTokio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarPersonajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TOKIO", Constants.TOKIO);
                intent.putExtras(bundle);
                launcherTokio.launch(intent);
            }
        });
    }

    private void launchers() {
        launcherBerlin = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                    }
                });

        launcherDenver = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                    }
                });

        launcherMoscu = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                    }
                });

        launcherRio = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                    }
                });

        launcherTokio = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                    }
                });

        launcherProfe = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                    }
                });
    }

    private void inicializa() {
        lblBerlin = findViewById(R.id.lblBerlin);
        lblDenver = findViewById(R.id.lblDenver);
        lblProfe = findViewById(R.id.lblProfe);
        lblMoscu = findViewById(R.id.lblMoscu);
        lblRio = findViewById(R.id.lblRio);
        lblTokio = findViewById(R.id.lblTokio);

        imgBerlin = findViewById(R.id.imgBerlin);
        imgDenver = findViewById(R.id.imgDenver);
        imgProfe = findViewById(R.id.imgProfe);
        imgMoscu = findViewById(R.id.imgMoscu);
        imgRio = findViewById(R.id.imgRio);
        imgTokio = findViewById(R.id.imgTokio);
    }
}
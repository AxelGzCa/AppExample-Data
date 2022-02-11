package com.example.appexample_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView cajadeImagen;
    boolean estadoBoton;
    private EditText editTextTextPersonName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estadoBoton = true;
        button = findViewById(R.id.button);
        cajadeImagen = findViewById(R.id.ImageView);
        cajadeImagen.setImageResource(R.drawable.neekoone);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String dato = getIntent().getStringExtra("dato");
        Toast.makeText(this,"Hola "+ dato +" continua usando la app y que jhin siga bailando", Toast.LENGTH_SHORT).show();
    }
    public void pulsarBoton (View view) {
        if (estadoBoton) {
            cajadeImagen.setImageResource(R.drawable.neekoone);
            estadoBoton = false;
            Toast.makeText(MainActivity.this,"Give it more clicks so that neeko continues dancing", Toast.LENGTH_SHORT).show();
        }
        else {
            cajadeImagen.setImageResource(R.drawable.neekotwo);
            estadoBoton = true;
            Toast.makeText(MainActivity.this,"Give it more clicks so that neeko continues dancing", Toast.LENGTH_SHORT).show();
        }
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.BOTTOM, 50, 50);
    }
    public void irActividad2 (View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("dato",editTextTextPersonName2.getText().toString());
        startActivity(intent);
    }
}
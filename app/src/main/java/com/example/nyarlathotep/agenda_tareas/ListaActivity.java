package com.example.nyarlathotep.agenda_tareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.nyarlathotep.agenda_tareas.Modelo.Lista;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    TextView tvUsuarioConec;
    Spinner spLista;
    ListView lsTarreas;
    private ArrayAdapter<String> adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        tvUsuarioConec =(TextView) findViewById(R.id.tvUsuarioConec);
        spLista=(Spinner) findViewById(R.id.spLista);
        lsTarreas=(ListView)findViewById(R.id.lsTarreas);

        Lista.cargarLista();
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Lista.listadolista);





    }
}

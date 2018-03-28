package com.example.alunos.listadeimagem;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;
    Integer[] imagens = {
            R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,
            R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,
            R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,
            R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,
            R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,R.drawable.unicornio,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;

        lv = (ListView) findViewById(R.id.lista_imagem);
        lv.setAdapter((ListAdapter) new CustonAdapter(imagens, this));
    }
}

package com.example.apilicores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.apilicores.Adapters.AdapterDestillery;
import com.example.apilicores.Adapters.AdapterWhisky;
import com.example.apilicores.apiManager.RetrofitClient;
import com.example.apilicores.models.Whiskyes;
import com.example.apilicores.models.distillery;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class whisky extends AppCompatActivity implements AdapterView.OnItemClickListener {
     ListView listaWhisky;
    List<Whiskyes> whiskys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky);
        listaWhisky = findViewById(R.id.listwhisky);
        getwisky();
        listaWhisky.setOnItemClickListener(this);

    }

    private void getwisky(){
        Call<List<Whiskyes>> call = RetrofitClient.getInstance().getMyApi().getWhiskyes();
        call.enqueue(new Callback<List<Whiskyes>>() {
            @Override
            public void onResponse(Call<List<Whiskyes>> call, Response<List<Whiskyes>> response) {
               whiskys = response.body();

                AdapterWhisky adapter = new AdapterWhisky(whisky.this, whiskys);
                listaWhisky.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Whiskyes>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent lugIntent = new Intent(this, Listslug.class);
       lugIntent.putExtra("slug", whiskys.get(position).getSlug());
       lugIntent.putExtra("url", whiskys.get(position).getUrl());
        startActivity(lugIntent);
    }
}
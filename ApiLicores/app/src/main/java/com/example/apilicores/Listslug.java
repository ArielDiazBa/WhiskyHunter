package com.example.apilicores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.apilicores.Adapters.AdapterDestillery;
import com.example.apilicores.Adapters.AdapterSlug;
import com.example.apilicores.apiManager.RetrofitClient;
import com.example.apilicores.models.Slug;
import com.example.apilicores.models.distillery;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Listslug extends AppCompatActivity implements View.OnClickListener {
    private ListView listaslug;
    private Button   navegar;
    private String slug;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listslug);
        listaslug = findViewById(R.id.Listslug);
        navegar = findViewById(R.id.btnnavegar);
        navegar.setOnClickListener(this);
        Bundle in = getIntent().getExtras();
        slug = in.getString("slug");
        url = in.getString("url");
        getslugs(slug);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnnavegar) {
            Uri _link = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, _link);
            startActivity(intent);
        }

    }

  private  void getslugs(String slug){
        Call<List<Slug>> call = RetrofitClient.getInstance().getMyApi().getSlug(slug);
        call.enqueue(new Callback<List<Slug>>() {
            @Override
            public void onResponse(Call<List<Slug>> call, Response<List<Slug>> response) {
                List<Slug> slugts = response.body();

                AdapterSlug adapter = new AdapterSlug(Listslug.this, slugts);
               listaslug.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Slug>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });

  }


}
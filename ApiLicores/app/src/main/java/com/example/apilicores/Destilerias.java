package com.example.apilicores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.apilicores.Adapters.AdapterDestillery;
import com.example.apilicores.apiManager.RetrofitClient;
import com.example.apilicores.models.distillery;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Destilerias extends AppCompatActivity {
    ListView listdestillery ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destilerias);
        listdestillery = findViewById(R.id.ListDestillery);
        getdestillery();

    }
    private void getdestillery(){
        Call<List<distillery>> call = RetrofitClient.getInstance().getMyApi().getDestilerias();
        call.enqueue(new Callback<List<distillery>>() {
            @Override
            public void onResponse(Call<List<distillery>> call, Response<List<distillery>> response) {
                List<distillery> Distilleryes = response.body();

              AdapterDestillery adapter = new AdapterDestillery(Destilerias.this, Distilleryes);
                listdestillery.setAdapter(adapter);


            }

            @Override
            public void onFailure(Call<List<distillery>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
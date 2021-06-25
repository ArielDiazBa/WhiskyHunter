package com.example.apilicores.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.apilicores.R;
import com.example.apilicores.models.distillery;

import java.util.List;

public class AdapterDestillery  extends BaseAdapter {
    protected Activity activity;
    protected List<distillery> listadestillery;

    public AdapterDestillery(Activity activity, List<distillery> listadestillery) {
        this.activity = activity;
        this.listadestillery = listadestillery;
    }

    @Override
    public int getCount() {
        return listadestillery.size() ;
    }

    @Override
    public Object getItem(int position) {
        return listadestillery.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (convertView == null){

            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.destillery_item, null);
        }

        distillery destiladora = listadestillery.get(position);

        TextView nameDestiladora = v.findViewById(R.id.txtname);
        nameDestiladora.setText(destiladora.getName());

        TextView slugDestiladora = v.findViewById(R.id.txtslug);
        slugDestiladora.setText(destiladora.getSlug());

        TextView country_Destiladora = v.findViewById(R.id.txtcountry);
        country_Destiladora.setText(destiladora.getCountry());

        return v;
    }
}

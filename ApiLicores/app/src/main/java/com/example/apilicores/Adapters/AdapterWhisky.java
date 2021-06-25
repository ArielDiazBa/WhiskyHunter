package com.example.apilicores.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.apilicores.R;
import com.example.apilicores.models.Whiskyes;
import com.example.apilicores.models.distillery;

import java.util.List;

public class AdapterWhisky  extends BaseAdapter {
    protected Activity activity;
    protected List<Whiskyes> listaWhiskyes;

    public AdapterWhisky(Activity activity, List<Whiskyes> listaWhiskyes) {
        this.activity = activity;
        this.listaWhiskyes = listaWhiskyes;
    }

    @Override
    public int getCount() {
        return listaWhiskyes.size();
    }

    @Override
    public Object getItem(int position) {
        return listaWhiskyes.get(position);
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
            v = inf.inflate(R.layout.wisky_item, null);
        }

        Whiskyes redlabel = listaWhiskyes.get(position);

        TextView namewhiskye = v.findViewById(R.id.txtnameW);
        namewhiskye.setText(redlabel.getName());

        TextView slug = v.findViewById(R.id.txtslugW);
        slug.setText(redlabel.getSlug());

        TextView buyers_fee = v.findViewById(R.id.txtbuyersW);
        buyers_fee.setText  (String.valueOf(redlabel.getBuyers_fee()));

        TextView sellers_fee = v.findViewById(R.id.txtsellerW);
        sellers_fee.setText  (String.valueOf(redlabel.getSellers_fee()));

        TextView reserve_fee = v.findViewById(R.id.txtreserveW);
        reserve_fee.setText  (String.valueOf(redlabel.getReserve_fee()));

        TextView listing_fee = v.findViewById(R.id.txtlistingW);
        listing_fee.setText  (String.valueOf(redlabel.getListing_fee()));

        TextView base_currency = v.findViewById(R.id.txtbaseW);
        base_currency.setText  (String.valueOf(redlabel.getBase_currency()));

        return v;
    }
}

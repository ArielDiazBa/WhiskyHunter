package com.example.apilicores.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.apilicores.R;
import com.example.apilicores.models.Slug;
import com.example.apilicores.models.distillery;

import java.util.List;

public class AdapterSlug extends BaseAdapter {
    protected Activity activity;
    protected List<Slug> listaslug;

    public AdapterSlug(Activity activity, List<Slug> listaslug) {
        this.activity = activity;
        this.listaslug = listaslug;
    }

    @Override
    public int getCount() {
        return listaslug.size();
    }

    @Override
    public Object getItem(int position) {
        return listaslug.get(position);
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
            v = inf.inflate(R.layout.slug_item, null);
        }

        Slug reserva = listaslug.get(position);

        TextView dt = v.findViewById(R.id.txtdtS);
        dt.setText(reserva.getDt());

        TextView winning_bid_max = v.findViewById(R.id.txtwinningmax);
        winning_bid_max.setText  (String.valueOf(reserva.getWinning_bid_max()));

        TextView winning_bid_min = v.findViewById(R.id.txtwinningmin);
        winning_bid_min.setText  (String.valueOf(reserva.getWinning_bid_min()));

        TextView winning_bid_mean = v.findViewById(R.id.txtwinningmean);
        winning_bid_mean.setText  (String.valueOf(reserva.getWinning_bid_mean()));

        TextView auction_trading_volume = v.findViewById(R.id.txttradingvolumen);
        auction_trading_volume.setText  (String.valueOf(reserva.getAuction_trading_volume()));

        TextView auction_lots_count = v.findViewById(R.id.txtlotscount);
        auction_lots_count.setText  (String.valueOf(reserva.getAuction_lots_count()));

        TextView all_auctions_lots_count = v.findViewById(R.id.txtall);
        all_auctions_lots_count.setText  (String.valueOf(reserva.getAll_auctions_lots_count()));

        TextView auction_name = v.findViewById(R.id.txtnameS);
        auction_name.setText(reserva.getAuction_name());

        TextView auction_slug = v.findViewById(R.id.txtautionsslug);
        auction_slug.setText(reserva.getAuction_slug());

        return v;
    }
}
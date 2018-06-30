package com.util.diegusweb.querepasarhoy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.util.diegusweb.querepasarhoy.R;
import com.util.diegusweb.querepasarhoy.model.Panel;

public class AdapterInit extends RecyclerView.Adapter<AdapterInit.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;
        public TextView precio;
        public ImageView imagen;

        public ViewHolder(View v) {
            super(v);
            nombre = v.findViewById(R.id.nombre_comida);
            precio = v.findViewById(R.id.precio_comida);
            imagen = (ImageView) v.findViewById(R.id.miniatura_comida);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_init, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        Panel item = Panel.PANEL_LIST.get(i);

        Glide.with(holder.itemView.getContext())
                .load(item.getIdDrawable())
                .centerCrop()
                .into(holder.imagen);

        holder.nombre.setText(item.getTitle());
        holder.precio.setText("123");
    }

    @Override
    public int getItemCount() {
        return Panel.PANEL_LIST.size();
    }


}

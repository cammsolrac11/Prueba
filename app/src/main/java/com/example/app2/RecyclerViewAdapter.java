package com.example.app2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app2.model.Contact;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<Contact> listContactos;

    public RecyclerViewAdapter(Context mContext, List<Contact> listContactos) {
        this.mContext = mContext;
        this.listContactos = listContactos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.row,viewGroup,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int posicion) {
        myViewHolder.tv_name.setText(listContactos.get(posicion).getName());
        myViewHolder.tv_phone.setText(listContactos.get(posicion).getPhone());
        myViewHolder.tv_foto.setImageResource(listContactos.get(posicion).getPhoto());
        myViewHolder.tv_numPunt.setText(String.valueOf(listContactos.get(posicion).getPoints()));

    }

    @Override
    public int getItemCount() {
        return listContactos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_phone;
        ImageView tv_foto;
        TextView tv_numPunt;

        public MyViewHolder(View v) {
            super(v);
            tv_name = v.findViewById(R.id.nomb);
            tv_phone = v.findViewById(R.id.tel);
            tv_foto = v.findViewById(R.id.photo);
            tv_numPunt = v.findViewById(R.id.punt);
        }
    }
}

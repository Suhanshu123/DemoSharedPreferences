package com.example.suhanshu.demosharedpreferences;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<ModelClass> list_rec;

    public RecyclerViewAdapter(List<ModelClass> list_rec) {
        this.list_rec = list_rec;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_viewcard,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.username.setText(list_rec.get(position).getUsername_model());
        holder.password.setText(list_rec.get(position).getPassword_model());

    }

    @Override
    public int getItemCount() {
        return list_rec.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView username;
        TextView password;
        public MyViewHolder(View itemView) {
            super(itemView);
            username=itemView.findViewById(R.id.username_recyclerView);
            password=itemView.findViewById(R.id.password_recyclerView);
        }
    }
}

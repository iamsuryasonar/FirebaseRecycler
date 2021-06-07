package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends FirebaseRecyclerAdapter<model,MyAdapter.MyViewHolder> {

    public MyAdapter(@NonNull FirebaseRecyclerOptions options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull model model) {

        holder.name.setText(model.name);
        holder.bio.setText(model.bio);
        Glide.with(holder.dp.getContext()).load(model.getDp()).into(holder.dp);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        return new MyViewHolder(view);
    }


    //catches reference from single row of recycler view
    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView bio;
        CircleImageView dp;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            bio = (TextView)itemView.findViewById(R.id.bio);
            dp = (CircleImageView)itemView.findViewById(R.id.dp);
        }
    }
}

package com.example.animallist;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<Hewan> listhewan;
    private long mLastClickTime = 0 ;
    public ListAdapter(ArrayList<Hewan>list) {
        this.listhewan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
      return new ListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Hewan hewan = listhewan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hewan.getFoto())
//                .apply(new RequestOptions().override(55,55))
                .into(holder.imageViewfotohewan);
        holder.textViewnamahewan.setText(hewan.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                    return;
                } { mLastClickTime = SystemClock.elapsedRealtime();
                Toast.makeText(holder.itemView.getContext(), "kamu memilih " + listhewan
                        .get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(),deskripsi.class);
                intent.putExtra("fotohewan",hewan.getFoto());
                intent.putExtra("namahewan",hewan.getName());
                intent.putExtra("infohewan",hewan.getInfo());
                holder.itemView.getContext().startActivity(intent); }
            }
        });
    }
    @Override
    public int getItemCount() {
        return listhewan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewfotohewan;
        TextView textViewnamahewan;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewfotohewan = itemView.findViewById(R.id.imageViewfotohewan);
            textViewnamahewan = itemView.findViewById(R.id.textViewnamahewan);

        }
    }
}

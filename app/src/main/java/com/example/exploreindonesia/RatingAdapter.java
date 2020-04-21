package com.example.exploreindonesia;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RatingAdapter extends RecyclerView.Adapter<RatingAdapter.ViewHolder>{
    ArrayList<CommentReview> cr = new ArrayList<>();

    public void setCr(ArrayList<CommentReview> cr) {
        cr.clear();
        this.cr = cr;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_rating, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Float rating = cr.get(position).getRating();
        CommentReview commentReview = cr.get(position);
//        holder.tvRating.setText(String.valueOf(commentReview.getRating()));
        holder.tvId.setText(commentReview.getId());
    }

    @Override
    public int getItemCount() {
        return cr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvRating;
        TextView tvId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRating = itemView.findViewById(R.id.tv_rating);
            tvId = itemView.findViewById(R.id.tv_id);
        }

        public void bind (CommentReview cr) {
            Float rating = cr.getRating();
            tvRating.setText(""+rating);
            tvId.setText(cr.getId());
        }

        @Override
        public void onClick(View v) {
            /*CommentReview crr = cr.get(getAdapterPosition());
            Intent intent = new Intent(v.getContext(), ShowRatingAll.class);
            intent.putExtra("id", crr.getId());
            v.getContext().startActivity(intent);*/
        }
    }
}

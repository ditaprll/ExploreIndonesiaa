package com.example.exploreindonesia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exploreindonesia.CommentReview;

import org.w3c.dom.Comment;

import java.util.ArrayList;

public class ListReviewAdapter extends RecyclerView.Adapter<ListReviewAdapter.ViewHolder>  {

    private ArrayList<CommentReview> commentReviews = new ArrayList<>();

    ListReviewAdapter(ArrayList<CommentReview> commentReviews){
        this.commentReviews.clear();
        this.commentReviews = commentReviews;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ListReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_detail_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListReviewAdapter.ViewHolder holder, int position) {
        holder.bind(commentReviews.get(position));
    }

    @Override
    public int getItemCount() {
        return commentReviews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvUser, tvComment;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvUser = itemView.findViewById(R.id.tv_user);
            tvComment = itemView.findViewById(R.id.tv_comment);
        }

        public void bind(CommentReview commentReview) {
            tvComment.setText(commentReview.getComment());
        }

    }
}

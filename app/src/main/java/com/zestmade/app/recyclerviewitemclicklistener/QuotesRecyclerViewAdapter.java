package com.zestmade.app.recyclerviewitemclicklistener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuotesRecyclerViewAdapter extends RecyclerView.Adapter<QuotesRecyclerViewAdapter.ViewHolder> {

    private List<Quote> mQuoteList;
    private int mLayoutResource;

    @NonNull
    private OnItemClickListener mOnItemClickListener;

    public QuotesRecyclerViewAdapter(List<Quote> quotes, int layoutResource, @NonNull OnItemClickListener onItemClickListener) {
        mQuoteList = quotes;
        mLayoutResource = layoutResource;
        mOnItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int itemIndexPosition);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {

        View convertView = LayoutInflater.from(parent.getContext()).inflate(mLayoutResource, parent, false);

        LinearLayout llQuoteWrapper = convertView.findViewById(R.id.llQuoteWrapper);
        TextView tvNumber = convertView.findViewById(R.id.tvNumber);
        TextView tvQuote = convertView.findViewById(R.id.tvQuote);
        TextView tvAuthor = convertView.findViewById(R.id.tvAuthor);
        
        return new ViewHolder(
                convertView,
                llQuoteWrapper,
                tvNumber,
                tvQuote,
                tvAuthor);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final Quote quote = mQuoteList.get(position);
        int number = position + 1;

        holder.tvNumber.setText(String.format("%s", number));
        holder.tvQuote.setText(quote.quote);
        holder.tvAuthor.setText(quote.author);
        holder.llQuoteWrapper.setOnClickListener(v -> {
            mOnItemClickListener.onItemClick(position);
        });
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout llQuoteWrapper;
        TextView tvNumber;
        TextView tvQuote;
        TextView tvAuthor;

        ViewHolder(View convertView, LinearLayout llQuoteWrapper,
                  TextView tvNumber, TextView tvQuote, TextView tvAuthor) {
            super(convertView);

            this.llQuoteWrapper = llQuoteWrapper;
            this.tvNumber = tvNumber;
            this.tvQuote = tvQuote;
            this.tvAuthor = tvAuthor;
        }
    }

    @Override
    public int getItemCount() {
        return mQuoteList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}

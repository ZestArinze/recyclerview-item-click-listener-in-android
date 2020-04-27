package com.zestmade.app.recyclerviewitemclicklistener;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Quote> mQuoteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuoteList = DataSource.getQuotes();

        QuotesRecyclerViewAdapter mQuotesRecyclerViewAdapter = new QuotesRecyclerViewAdapter(
                mQuoteList,
                R.layout.quote_list_item,
                this::showQuote);

        RecyclerView rvQuotes = findViewById(R.id.rvQuotes);
        rvQuotes.setLayoutManager(new LinearLayoutManager(this));
        rvQuotes.setAdapter(mQuotesRecyclerViewAdapter);
    }

    private void showQuote(int index) {

        Quote quote = mQuoteList.get(index);

        new AlertDialog.Builder(this)
                .setTitle(quote.author)
                .setMessage(quote.quote)
                .setPositiveButton(android.R.string.yes,null)
                .show();
    }
}

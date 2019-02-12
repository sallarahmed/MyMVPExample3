package com.sallar.mymvpexample3.main.activity.view.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sallar.mymvpexample3.R;


/**
 * ---------------------------------------------------
 * Created by Tin Megali on 18/03/16.
 * Project: tuts+mvp_sample
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 */
public class NotesViewHolder extends RecyclerView.ViewHolder {

    public RelativeLayout container;
    public TextView text, date;
    public ImageButton btnDelete;

    public NotesViewHolder(View itemView) {
        super(itemView);

        setupViews(itemView);
    }

    private void setupViews(View view) {
        container = view.findViewById(R.id.holder_container);
        text =  view.findViewById(R.id.note_text);
        date = view.findViewById(R.id.note_date);
        btnDelete = view.findViewById(R.id.btn_delete);
    }


}

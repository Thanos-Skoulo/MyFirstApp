package thanos.skoulopoulos.gr.myfirstapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ToDoViewHolder extends RecyclerView.ViewHolder{

    CheckBox isdone;
    TextView title;
    TextView description;

    public ToDoViewHolder(@NonNull View itemView) {

        super(itemView);

         isdone = itemView.findViewById(R.id.cb_isDone);
         title = itemView.findViewById(R.id.tv_title);
         description = itemView.findViewById(R.id.tv_description);
    }

    public CheckBox getIsdone() {
        return isdone;
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getDescription() {
        return description;
    }
}

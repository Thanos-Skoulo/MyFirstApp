package thanos.skoulopoulos.gr.myfirstapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoViewHolder> {

    ArrayList<ToDO> myToDoList = new ArrayList<ToDO>();

    public ToDoAdapter()
    {
        myToDoList.add(new ToDO("My First Task", "Added My First Todo in the list", true));
        myToDoList.add(new ToDO("Second Task","Added second task", false));
    }

    @NonNull
    @Override
    public ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_todo, viewGroup, false);

        return new ToDoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoViewHolder toDoViewHolder, int position) {

        ToDO toDO = myToDoList.get(position);

        toDoViewHolder.getTitle().setText(toDO.getTitle());
        toDoViewHolder.getIsdone().setChecked(toDO.getIsDone());
        toDoViewHolder.getDescription().setText(toDO.getDescription());

    }

    @Override
    public int getItemCount() {
        return myToDoList.size();
    }
}


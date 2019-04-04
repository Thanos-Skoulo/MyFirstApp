package thanos.skoulopoulos.gr.myfirstapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoViewHolder> {

    ArrayList<ToDo> myToDoList = new ArrayList<ToDo>();

    public ToDoAdapter()
    {
        myToDoList.add(new ToDo("My First Task", "Added My First Todo in the list", true));
        myToDoList.add(new ToDo("Second Task","Added second task", false));
    }

    @NonNull
    @Override
    public ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ToDoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_todo, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoViewHolder toDoViewHolder, int position) {
        toDoViewHolder.bind(myToDoList.get(position));
    }

    @Override
    public int getItemCount() {
        return myToDoList.size();
    }

    public void add(ToDo newToDo) {
        myToDoList.add(newToDo);
        notifyDataSetChanged();
    }
}


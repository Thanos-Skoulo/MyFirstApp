package thanos.skoulopoulos.gr.myfirstapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    TextView emailView;
    private RecyclerView toDoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secomd);

        emailView = findViewById(R.id.tv_emailView);
        toDoListView = findViewById(R.id.todolist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        toDoListView.setLayoutManager(layoutManager);
        ToDoAdapter adapter = new ToDoAdapter();
        toDoListView.setAdapter(adapter);




        Intent intent = getIntent();
        if (intent != null)
        {
            String email = intent.getStringExtra(MainActivity.EMAIL);

            emailView.setText(email);
        }



    }
}

package thanos.skoulopoulos.gr.myfirstapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TasksActivity extends AppCompatActivity {

    public static final String TASK_CREATION = "task creation";
    public static final String DESCRIPTION_CREATION = "description creation";
    public static final int ADD_TASK = 1;
    TextView emailView;
    private RecyclerView toDoListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        emailView = findViewById(R.id.tv_emailView);
        toDoListView = findViewById(R.id.todolist);
        View fab = findViewById(R.id.fab_addtask);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        toDoListView.setLayoutManager(layoutManager);
        ToDoAdapter adapter = new ToDoAdapter();
        toDoListView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       startActivityForResult(new Intent(TasksActivity.this, AddTaskActivity.class),ADD_TASK);
                                   }

        });

        Intent intent = getIntent();
        if (intent != null)
        {
            String email = intent.getStringExtra(MainActivity.EMAIL);

            emailView.setText(email);
        }



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ADD_TASK){
            if(resultCode == RESULT_OK){
                
            }
        }
    }
}
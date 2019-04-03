package thanos.skoulopoulos.gr.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddTaskActivity extends AppCompatActivity {

    EditText newTaskCreation;
    EditText newDescriptionCreation;
    Button addNewTaskConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        newTaskCreation = findViewById(R.id.et_newtask);
        newDescriptionCreation = findViewById(R.id.et_newdescription);
        addNewTaskConfirm = findViewById(R.id.button_addtask);

        addNewTaskConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newTaskText = newTaskCreation.getText().toString();
                String newDescriptionText = newDescriptionCreation.getText().toString();

                Intent sendNewTask = new Intent(AddTaskActivity.this, TasksActivity.class);
                sendNewTask.putExtra(TasksActivity.TASK_CREATION, newTaskText);
                sendNewTask.putExtra(TasksActivity.DESCRIPTION_CREATION, newDescriptionText);
                setResult(RESULT_OK,sendNewTask);
                finish();
            }
        });



    }
}

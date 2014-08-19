package com.bhp.smartask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;


public class Smartask extends Activity {

    TableLayout mainTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartask);
        mainTable = (TableLayout) findViewById(R.id.MainTable);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.smartask, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent settingsIntent = new Intent(this, Settings.class);
            startActivity(settingsIntent);
            return true;
        } else if(id == R.id.add_task) {
            //Call function to add task to main tasklist
            addNewTask();
        } else if(id == R.id.clear_complete) {
            //Call function to clear completed tasks
            clearCompletedTasks();
        }
        return super.onOptionsItemSelected(item);
    }

    protected void addNewTask() {
        TableRow newRow = new TableRow(this);
        CheckBox newCheck = new CheckBox(this);
        EditText newText = new EditText(this);
        newText.setText("Edit Me");
        newRow.addView(newCheck);
        newRow.addView(newText);
        mainTable.addView(newRow);
    }

    protected void clearCompletedTasks() {

    }
}

package com.example.inclassassignment07_qianziz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        setTitle("People List");


    }

    public void submit(View view) {

        Intent intent = new Intent(this,MainActivity.class);

        String name = ((EditText) findViewById(R.id.name_field)).getText().toString();
        int age = Integer.parseInt(((EditText) findViewById(R.id.age_field)).getText().toString());
        CheckBox isFullTimeCheckBox = (CheckBox) findViewById(R.id.full_time_checkbox);
        boolean isFullTime = isFullTimeCheckBox.isChecked();

        Person person = new Person(name, age, isFullTime);
        intent.putExtra(Keys.PERSON_KEY, person);

        setResult(RESULT_OK, intent);
        finish();

    }

}

package com.example.inclassassignment07_qianziz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("People List");
    }


    public void addPerson(View view) {
        Person person = new Person("Aisling", 22, true);
        Intent data = new Intent(this, DisplayActivity.class);
        data.putExtra(Keys.PERSON_KEY, person);
        setResult(RESULT_OK,data);
        startActivityForResult(data,123);
    }


    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123 && resultCode == RESULT_OK) {
            Person person = (Person) data.getSerializableExtra(Keys.PERSON_KEY);
            TextView textView = findViewById(R.id.display_text);
            String storedPerson;
            storedPerson = textView.getText().toString();
            textView.setText(storedPerson + person.toString());
        }
    }
}





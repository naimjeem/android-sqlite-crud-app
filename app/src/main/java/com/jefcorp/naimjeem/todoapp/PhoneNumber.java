package com.jefcorp.naimjeem.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.jefcorp.naimjeem.todoapp.R.id.show_data;

public class PhoneNumber extends AppCompatActivity {

  TextView tv;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_phone_number);

    tv = (TextView) findViewById(show_data);

    DbFunctions df = new DbFunctions(getApplicationContext());
    String[] data = df.showData();

    tv.setText(data[0]);
  }
}

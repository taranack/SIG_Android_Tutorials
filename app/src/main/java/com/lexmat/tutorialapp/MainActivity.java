package com.lexmat.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;
    boolean whichText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.textView);
        whichText = true;
    }

    public void onClick(View view) { //Method runs when button is clicked
        whichText = !whichText;
        if(whichText){
            text.setText("A");
        }else{
            text.setText("B");
        }
    }

    public void moveToList(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void moveToEdit(View view) {
        Intent intent = new Intent(this, EditTextActivity.class);
        startActivity(intent);
    }

    public void moveToFragment(View view) {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }
}

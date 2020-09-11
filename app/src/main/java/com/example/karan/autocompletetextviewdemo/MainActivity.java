package com.example.karan.autocompletetextviewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView actv;
    private MultiAutoCompleteTextView mactv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find View By id
        actv = findViewById(R.id.actv);
        mactv = findViewById(R.id.mactv);
        //Date Source
        String name[] = getResources().getStringArray(R.array.data);
        //Adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);

        actv.setAdapter(adapter);
        actv.setTextColor(Color.BLUE);

        //MultiArrayAutoComplete
        mactv.setAdapter(adapter);
        mactv.setTextColor(Color.RED);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}

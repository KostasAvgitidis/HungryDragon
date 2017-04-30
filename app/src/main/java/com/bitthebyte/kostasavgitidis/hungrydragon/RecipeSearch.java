package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RecipeSearch extends AppCompatActivity {


    EditText et;
    String itext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_search);


        et = (EditText) findViewById(R.id.editText);
    }

    public void storeValue(View view) {
        itext = et.getText().toString();

    }
}

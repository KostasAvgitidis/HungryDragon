package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class DetailActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        ImageView ivRecipeImage = (ImageView) findViewById(R.id.ivIcon);
        TextView tvSource = (TextView) findViewById(R.id.tvSource);
        TextView tvUrl = (TextView) findViewById(R.id.tvUrl);
        TextView tvCalories = (TextView) findViewById(R.id.tvCalories);
        TextView tvLabel = (TextView) findViewById(R.id.tvLabel);
        TextView tvYield = (TextView) findViewById(R.id.tvYield);

        //GET INTENT
        Intent intent = this.getIntent();

        //RECEIVE DATA
        String label = intent.getExtras().getString("LABEL");
        String source = intent.getExtras().getString("SOURCE");
        String url = intent.getExtras().getString("URL");
        String calories = intent.getExtras().getString("CALORIES");
        String yield = intent.getExtras().getString("YIELD");
        String image = intent.getExtras().getString("IMAGE");
        Picasso.with(this).load(image).into(ivRecipeImage);
        tvSource.setText("Publisher: " + source);
        tvYield.setText("Servings: " + yield);
        tvCalories.setText("Calories: " + calories + " kcal per serving");
        tvUrl.setText("Source: " + url);
        tvLabel.setText(label);

    }
}
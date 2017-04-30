package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bitthebyte.kostasavgitidis.hungrydragon.models.RecipeModel;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;


public class DetailActivity extends ActionBarActivity {

    private ImageView ivRecipeIcon;
    private TextView tvTitle;
    private TextView tvSource_url;
    private TextView tvPublisherUrl;
    private TextView tvPublisher;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Showing and Enabling clicks on the Home/Up button
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // setting up text views and stuff
        setUpUIViews();

        // recovering data from MainActivity, sent via intent
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String json = bundle.getString("recipeModel"); // getting the model from MainActivity send via extras
            RecipeModel recipeModel = new Gson().fromJson(json, RecipeModel.class);

            // Then later, when you want to display image
            ImageLoader.getInstance().displayImage(recipeModel.getImage_url(), ivRecipeIcon, new ImageLoadingListener() {
                @Override
                public void onLoadingStarted(String imageUri, View view) {
                    progressBar.setVisibility(View.VISIBLE);
                }

                @Override
                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onLoadingCancelled(String imageUri, View view) {
                    progressBar.setVisibility(View.GONE);
                }
            });

            tvPublisher.setText("Publisher: " + recipeModel.getPublisher());
            tvPublisherUrl.setText("Website: " + recipeModel.getPublisher_url());
            tvSource_url.setText("Recipe link: " + recipeModel.getSource_url());
            tvTitle.setText(recipeModel.getTitle());


        }

    }

    private void setUpUIViews() {
        ivRecipeIcon = (ImageView)findViewById(R.id.ivIcon);
        tvPublisher = (TextView) findViewById(R.id.tvPublisher);
        tvPublisherUrl = (TextView) findViewById(R.id.tvPublisherUrl);
        tvSource_url = (TextView) findViewById(R.id.tvSource_url);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
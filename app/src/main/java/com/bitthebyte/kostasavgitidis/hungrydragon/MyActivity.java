package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;


public class MyActivity extends AppCompatActivity{

    ListView listview;
    RecipeModel responseObj;
    CustomAdapter adapter;
    String url = RecipeSearch.getItext();
    Gson gson;
    AsyncHttpClient client;
    private ProgressDialog dialog;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new ProgressDialog(this);
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        dialog.setMessage("Loading. Please wait...");
        listview = (ListView) findViewById(R.id.lvRecipes);
        client = new AsyncHttpClient();
        client.get(MyActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String responseString = new String(responseBody);
                gson = new Gson();
                responseObj = gson.fromJson(responseString, RecipeModel.class);
                adapter = new CustomAdapter(MyActivity.this, responseObj.getHits());
                listview.setAdapter(adapter);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(getApplicationContext(), "Not able to fetch data from server, please check your search criteria", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

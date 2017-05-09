package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class CustomAdapter extends BaseAdapter {
    private List<RecipeModel.HitsBean> rRecipeItem;
    private Context rContext;

    public CustomAdapter(Context rContext, List<RecipeModel.HitsBean> rRecipeItem) {
        this.rContext = rContext;
        this.rRecipeItem = rRecipeItem;

    }

    @Override
    public int getCount() {
        return rRecipeItem.size();
    }

    @Override
    public Object getItem(int position) {
        return rRecipeItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) rContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        RecipeModel.HitsBean item = (RecipeModel.HitsBean) getItem(position);
        ImageView ivRecipeImage = (ImageView) rowView.findViewById(R.id.ivIcon);
        TextView tvSource = (TextView) rowView.findViewById(R.id.tvSource);
        TextView tvUrl = (TextView) rowView.findViewById(R.id.tvUrl);
        TextView tvCalories = (TextView) rowView.findViewById(R.id.tvCalories);
        TextView tvLabel = (TextView) rowView.findViewById(R.id.tvLabel);
        TextView tvYield = (TextView) rowView.findViewById(R.id.tvYield);
        final String imageUrl = item.getRecipe().getImage();
        final String source = item.getRecipe().getSource();
        final String label = item.getRecipe().getLabel();
        final String url = item.getRecipe().getUrl();
        Picasso.with(rContext).load(imageUrl).into(ivRecipeImage);
        tvSource.setText("Publisher: " + item.getRecipe().getSource());
        final int b = (int) (Math.round(item.getRecipe().getYield()));
        tvYield.setText("Servings: " + String.valueOf(b));
        final int a = (int) (Math.round(item.getRecipe().getCalories())) / b;
        tvCalories.setText("Calories: " + String.valueOf(a) + " kcal per serving");
        tvUrl.setText("Source: " + item.getRecipe().getUrl());
        tvLabel.setText(item.getRecipe().getLabel());

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity(imageUrl, label, source, url, String.valueOf(a), String.valueOf(b));
            }
        });

        return rowView;
    }

    private void openDetailActivity(String... details) {
        Intent i = new Intent(rContext, DetailActivity.class);
        i.putExtra("IMAGE", details[0]);
        i.putExtra("LABEL", details[1]);
        i.putExtra("SOURCE", details[2]);
        i.putExtra("URL", details[3]);
        i.putExtra("CALORIES", details[4]);
        i.putExtra("YIELD", details[5]);

        rContext.startActivity(i);

    }
}

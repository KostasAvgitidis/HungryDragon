package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {
    /*

    private final String URL_TO_HIT = "https://api.edamam.com/search?q=chicken%20&app_id=f290a7ef&app_key=e872f9068619df645438f4e52127c9b2&from=0&to=3&calories=gte%20591,%20lte%20722";
    private ListView lvRecipes;
    private ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new ProgressDialog(this);
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        dialog.setMessage("Loading. Please wait..."); // showing a dialog for loading the data
        // Create default options which will be used for every
        //  displayImage(...) call if no options will be passed to this method
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .build();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
                .defaultDisplayImageOptions(defaultOptions)
                .build();
        ImageLoader.getInstance().init(config); // Do it on Application start

        lvRecipes = (ListView) findViewById(R.id.lvRecipes);


        // To start fetching the data when app start, uncomment below line to start the async task.
        new JSONTask().execute(URL_TO_HIT);
    }

    public class JSONTask extends AsyncTask<String, String, List<RecipeModel>> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog.show();
        }

        @Override
        protected List<RecipeModel> doInBackground(String... params) {
            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }

                String finalJson = buffer.toString();

                JSONObject parentObject = new JSONObject(finalJson);
                JSONArray parentArray = parentObject.getJSONArray("hits");

                List<RecipeModel> recipeModelList = new ArrayList<>();

                Gson gson = new Gson();
                for (int i = 0; i < parentArray.length(); i++) {
                    JSONObject finalObject = parentArray.getJSONObject(i);

                    RecipeModel recipeModel = gson.fromJson(finalObject.toString(), RecipeModel.class); // a single line json parsing using Gson

                    recipeModelList.add(recipeModel);
                }
                return recipeModelList;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(final List<RecipeModel> result) {
            super.onPostExecute(result);
            dialog.dismiss();
            if (result != null) {
                RecipeAdapter adapter = new RecipeAdapter(getApplicationContext(), R.layout.row, result);
                lvRecipes.setAdapter(adapter);
                lvRecipes.setOnItemClickListener(new AdapterView.OnItemClickListener() {  // list item click opens a new detailed activity
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        RecipeModel recipeModel = result.get(position); // getting the model
                        Intent intent = new Intent(MainActivity.this, MyActivity.class);
                        intent.putExtra("recipeModel", new Gson().toJson(recipeModel)); // converting model json into string type and sending it via intent
                        startActivity(intent);
                    }
                });
            } else {
                Toast.makeText(getApplicationContext(), "Not able to fetch data from server, please check your search criteria", Toast.LENGTH_SHORT).show();
            }
        }
    }


    public class RecipeAdapter extends ArrayAdapter {

        private List<RecipeModel> recipeModelList;
        private int resource;
        private LayoutInflater inflater;

        public RecipeAdapter(Context context, int resource, List<RecipeModel> objects) {
            super(context, resource, objects);
            recipeModelList = objects;
            this.resource = resource;
            inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder = null;

            if (convertView == null) {
                holder = new ViewHolder();
                convertView = inflater.inflate(resource, null);
                holder.ivRecipeImage = (ImageView) convertView.findViewById(R.id.ivIcon);
                holder.tvLabel = (TextView) convertView.findViewById(R.id.tvLabel);
                holder.tvSource = (TextView) convertView.findViewById(R.id.tvSource);
                holder.tvUrl = (TextView) convertView.findViewById(R.id.tvUrl);
                holder.tvCalories = (TextView) convertView.findViewById(R.id.tvCalories);
                holder.tvYield = (TextView) convertView.findViewById(R.id.tvYield);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }


            // Then later, when you want to display image
            final ViewHolder finalHolder = holder;


            holder.tvSource.setText("Publisher: " + recipeModelList.get(position).getHits().get(position).getRecipe().getSource());
            holder.tvCalories.setText(String.valueOf(recipeModelList.get(position).getHits().get(position).getRecipe().getCalories()));
            holder.tvUrl.setText("Source: " + recipeModelList.get(position).getHits().get(position).getRecipe().getUrl());
            holder.tvLabel.setText(recipeModelList.get(position).getHits().get(position).getRecipe().getLabel());
            holder.tvYield.setText(String.valueOf(recipeModelList.get(position).getHits().get(position).getRecipe().getYield()));

            return convertView;
        }


        class ViewHolder {
            private ImageView ivRecipeImage;
            private TextView tvLabel;
            private TextView tvUrl;
            private TextView tvSource;
            private TextView tvYield;
            private TextView tvCalories;

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {
            new JSONTask().execute(URL_TO_HIT);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    */


}
package com.bitthebyte.kostasavgitidis.hungrydragon;

import java.util.List;

public class RecipeModel {

    private List<HitsBean> hits;



    public List<HitsBean> getHits() {
        return hits;
    }

    public void setHits(List<HitsBean> hits) {
        this.hits = hits;
    }

    public static class HitsBean {
        /**
         * recipe : {"label":"Easy Roast Chicken with Asparagus and Leeks","image":"https://www.edamam.com/web-img/2d2/2d2df477b921590db3649c54144d35a7.jpg","source":"Serious Eats","url":"http://www.seriouseats.com/recipes/2011/06/easy-roast-chicken-with-asparagus-and-leeks-recipe.html","yield":4,"calories":2643.577831890576}
         */

        private RecipeBean recipe;

        public RecipeBean getRecipe() {
            return recipe;
        }

        public void setRecipe(RecipeBean recipe) {
            this.recipe = recipe;
        }

        public static class RecipeBean {
            /**
             * label : Easy Roast Chicken with Asparagus and Leeks
             * image : https://www.edamam.com/web-img/2d2/2d2df477b921590db3649c54144d35a7.jpg
             * source : Serious Eats
             * url : http://www.seriouseats.com/recipes/2011/06/easy-roast-chicken-with-asparagus-and-leeks-recipe.html
             * yield : 4.0
             * calories : 2643.577831890576
             */

            private String label;
            private String image;
            private String source;
            private String url;
            private double yield;
            private double calories;

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public double getYield() {
                return yield;
            }

            public void setYield(double yield) {
                this.yield = yield;
            }

            public double getCalories() {
                return calories;
            }

            public void setCalories(double calories) {
                this.calories = calories;
            }
        }
    }
}

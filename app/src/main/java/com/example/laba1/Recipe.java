package com.example.laba1;

public class Recipe {
    private int Calorie;
    private int Time;
    private String Name;
    private String Ingredients;

    public int getCalorie() {
        return Calorie;
    }

    public void setCalorie(int calorie) {
        this.Calorie = calorie;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        this.Time = time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        this.Ingredients = ingredients;
    }
}

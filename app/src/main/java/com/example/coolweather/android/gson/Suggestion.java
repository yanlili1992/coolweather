package com.example.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuht on 2017/2/28.
 */

public class Suggestion {
    @SerializedName("comf")public Comfort comfort;
    @SerializedName("cw") public CarWash carWash;
    @SerializedName("sport") public Sport sport;
    public  class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public  class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public  class Sport{
        @SerializedName("txt")
        public String info;
    }
}

package com.example.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuht on 2017/2/28.
 */

public class Forecast {
    @SerializedName("tmp")public Temperature temperature;
    @SerializedName("cond") public More more;
    public String date;
    public class More{
        @SerializedName("txt")public String info;
    }
    public class Temperature{
        public String max;
        public String min;
    }

}

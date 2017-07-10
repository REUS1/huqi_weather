package com.huqi_weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HuQi on 2017/7/10.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

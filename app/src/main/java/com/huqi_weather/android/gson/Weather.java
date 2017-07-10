package com.huqi_weather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HuQi on 2017/7/10.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

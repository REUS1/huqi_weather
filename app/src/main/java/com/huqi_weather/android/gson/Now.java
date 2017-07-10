package com.huqi_weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HuQi on 2017/7/10.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}

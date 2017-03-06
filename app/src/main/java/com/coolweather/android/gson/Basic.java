package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yf on 2017/3/6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
    public Update update;
}

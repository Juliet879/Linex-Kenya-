
package com.moringaschool.linex_kenya;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("batteryLife")
    @Expose
    private String batteryLife;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("isOrderable")
    @Expose
    private String isOrderable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param isOrderable
     * @param color
     * @param batteryLife
     */
    public Attributes(String batteryLife, String color, String isOrderable) {
        super();
        this.batteryLife = batteryLife;
        this.color = color;
        this.isOrderable = isOrderable;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsOrderable() {
        return isOrderable;
    }

    public void setIsOrderable(String isOrderable) {
        this.isOrderable = isOrderable;
    }

}

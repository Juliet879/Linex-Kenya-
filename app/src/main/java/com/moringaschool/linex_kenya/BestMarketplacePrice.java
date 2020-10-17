
package com.moringaschool.linex_kenya;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BestMarketplacePrice {

    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("sellerInfo")
    @Expose
    private String sellerInfo;
    @SerializedName("standardShipRate")
    @Expose
    private Integer standardShipRate;
    @SerializedName("availableOnline")
    @Expose
    private Boolean availableOnline;
    @SerializedName("clearance")
    @Expose
    private Boolean clearance;
    @SerializedName("offerType")
    @Expose
    private String offerType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BestMarketplacePrice() {
    }

    /**
     * 
     * @param offerType
     * @param standardShipRate
     * @param price
     * @param clearance
     * @param availableOnline
     * @param sellerInfo
     */
    public BestMarketplacePrice(Double price, String sellerInfo, Integer standardShipRate, Boolean availableOnline, Boolean clearance, String offerType) {
        super();
        this.price = price;
        this.sellerInfo = sellerInfo;
        this.standardShipRate = standardShipRate;
        this.availableOnline = availableOnline;
        this.clearance = clearance;
        this.offerType = offerType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public Integer getStandardShipRate() {
        return standardShipRate;
    }

    public void setStandardShipRate(Integer standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    public Boolean getClearance() {
        return clearance;
    }

    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

}


package com.moringaschool.linex_kenya;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GiftOptions {

    @SerializedName("allowGiftWrap")
    @Expose
    private Boolean allowGiftWrap;
    @SerializedName("allowGiftMessage")
    @Expose
    private Boolean allowGiftMessage;
    @SerializedName("allowGiftReceipt")
    @Expose
    private Boolean allowGiftReceipt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GiftOptions() {
    }

    /**
     * 
     * @param allowGiftReceipt
     * @param allowGiftWrap
     * @param allowGiftMessage
     */
    public GiftOptions(Boolean allowGiftWrap, Boolean allowGiftMessage, Boolean allowGiftReceipt) {
        super();
        this.allowGiftWrap = allowGiftWrap;
        this.allowGiftMessage = allowGiftMessage;
        this.allowGiftReceipt = allowGiftReceipt;
    }

    public Boolean getAllowGiftWrap() {
        return allowGiftWrap;
    }

    public void setAllowGiftWrap(Boolean allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    public Boolean getAllowGiftMessage() {
        return allowGiftMessage;
    }

    public void setAllowGiftMessage(Boolean allowGiftMessage) {
        this.allowGiftMessage = allowGiftMessage;
    }

    public Boolean getAllowGiftReceipt() {
        return allowGiftReceipt;
    }

    public void setAllowGiftReceipt(Boolean allowGiftReceipt) {
        this.allowGiftReceipt = allowGiftReceipt;
    }

}

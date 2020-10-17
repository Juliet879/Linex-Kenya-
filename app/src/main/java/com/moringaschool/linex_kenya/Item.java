
package com.moringaschool.linex_kenya;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("itemId")
    @Expose
    private Integer itemId;
    @SerializedName("parentItemId")
    @Expose
    private Integer parentItemId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("msrp")
    @Expose
    private Integer msrp;
    @SerializedName("salePrice")
    @Expose
    private Integer salePrice;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("categoryPath")
    @Expose
    private String categoryPath;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("longDescription")
    @Expose
    private String longDescription;
    @SerializedName("brandName")
    @Expose
    private String brandName;
    @SerializedName("thumbnailImage")
    @Expose
    private String thumbnailImage;
    @SerializedName("mediumImage")
    @Expose
    private String mediumImage;
    @SerializedName("largeImage")
    @Expose
    private String largeImage;
    @SerializedName("productTrackingUrl")
    @Expose
    private String productTrackingUrl;
    @SerializedName("ninetySevenCentShipping")
    @Expose
    private Boolean ninetySevenCentShipping;
    @SerializedName("standardShipRate")
    @Expose
    private Integer standardShipRate;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("shipToStore")
    @Expose
    private Boolean shipToStore;
    @SerializedName("freeShipToStore")
    @Expose
    private Boolean freeShipToStore;
    @SerializedName("modelNumber")
    @Expose
    private String modelNumber;
    @SerializedName("productUrl")
    @Expose
    private String productUrl;
    @SerializedName("customerRating")
    @Expose
    private String customerRating;
    @SerializedName("numReviews")
    @Expose
    private Integer numReviews;
    @SerializedName("customerRatingImage")
    @Expose
    private String customerRatingImage;
    @SerializedName("bestMarketplacePrice")
    @Expose
    private BestMarketplacePrice bestMarketplacePrice;
    @SerializedName("categoryNode")
    @Expose
    private String categoryNode;
    @SerializedName("rhid")
    @Expose
    private String rhid;
    @SerializedName("bundle")
    @Expose
    private Boolean bundle;
    @SerializedName("clearance")
    @Expose
    private Boolean clearance;
    @SerializedName("preOrder")
    @Expose
    private Boolean preOrder;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("addToCartUrl")
    @Expose
    private String addToCartUrl;
    @SerializedName("affiliateAddToCartUrl")
    @Expose
    private String affiliateAddToCartUrl;
    @SerializedName("freeShippingOver35Dollars")
    @Expose
    private Boolean freeShippingOver35Dollars;
    @SerializedName("giftOptions")
    @Expose
    private GiftOptions giftOptions;
    @SerializedName("imageEntities")
    @Expose
    private List<ImageEntity> imageEntities = null;
    @SerializedName("offerType")
    @Expose
    private String offerType;
    @SerializedName("isTwoDayShippingEligible")
    @Expose
    private Boolean isTwoDayShippingEligible;
    @SerializedName("availableOnline")
    @Expose
    private Boolean availableOnline;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param longDescription
     * @param largeImage
     * @param bestMarketplacePrice
     * @param color
     * @param categoryNode
     * @param mediumImage
     * @param numReviews
     * @param offerType
     * @param productTrackingUrl
     * @param parentItemId
     * @param standardShipRate
     * @param msrp
     * @param clearance
     * @param preOrder
     * @param thumbnailImage
     * @param stock
     * @param bundle
     * @param imageEntities
     * @param giftOptions
     * @param brandName
     * @param addToCartUrl
     * @param rhid
     * @param salePrice
     * @param categoryPath
     * @param freeShippingOver35Dollars
     * @param upc
     * @param isTwoDayShippingEligible
     * @param shortDescription
     * @param shipToStore
     * @param itemId
     * @param customerRatingImage
     * @param customerRating
     * @param affiliateAddToCartUrl
     * @param name
     * @param freeShipToStore
     * @param modelNumber
     * @param attributes
     * @param availableOnline
     * @param productUrl
     * @param ninetySevenCentShipping
     */
    public Item(Integer itemId, Integer parentItemId, String name, Integer msrp, Integer salePrice, String upc, String categoryPath, String shortDescription, String longDescription, String brandName, String thumbnailImage, String mediumImage, String largeImage, String productTrackingUrl, Boolean ninetySevenCentShipping, Integer standardShipRate, String color, Boolean shipToStore, Boolean freeShipToStore, String modelNumber, String productUrl, String customerRating, Integer numReviews, String customerRatingImage, BestMarketplacePrice bestMarketplacePrice, String categoryNode, String rhid, Boolean bundle, Boolean clearance, Boolean preOrder, String stock, Attributes attributes, String addToCartUrl, String affiliateAddToCartUrl, Boolean freeShippingOver35Dollars, GiftOptions giftOptions, List<ImageEntity> imageEntities, String offerType, Boolean isTwoDayShippingEligible, Boolean availableOnline) {
        super();
        this.itemId = itemId;
        this.parentItemId = parentItemId;
        this.name = name;
        this.msrp = msrp;
        this.salePrice = salePrice;
        this.upc = upc;
        this.categoryPath = categoryPath;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.brandName = brandName;
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.productTrackingUrl = productTrackingUrl;
        this.ninetySevenCentShipping = ninetySevenCentShipping;
        this.standardShipRate = standardShipRate;
        this.color = color;
        this.shipToStore = shipToStore;
        this.freeShipToStore = freeShipToStore;
        this.modelNumber = modelNumber;
        this.productUrl = productUrl;
        this.customerRating = customerRating;
        this.numReviews = numReviews;
        this.customerRatingImage = customerRatingImage;
        this.bestMarketplacePrice = bestMarketplacePrice;
        this.categoryNode = categoryNode;
        this.rhid = rhid;
        this.bundle = bundle;
        this.clearance = clearance;
        this.preOrder = preOrder;
        this.stock = stock;
        this.attributes = attributes;
        this.addToCartUrl = addToCartUrl;
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
        this.freeShippingOver35Dollars = freeShippingOver35Dollars;
        this.giftOptions = giftOptions;
        this.imageEntities = imageEntities;
        this.offerType = offerType;
        this.isTwoDayShippingEligible = isTwoDayShippingEligible;
        this.availableOnline = availableOnline;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMsrp() {
        return msrp;
    }

    public void setMsrp(Integer msrp) {
        this.msrp = msrp;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    public Boolean getNinetySevenCentShipping() {
        return ninetySevenCentShipping;
    }

    public void setNinetySevenCentShipping(Boolean ninetySevenCentShipping) {
        this.ninetySevenCentShipping = ninetySevenCentShipping;
    }

    public Integer getStandardShipRate() {
        return standardShipRate;
    }

    public void setStandardShipRate(Integer standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getShipToStore() {
        return shipToStore;
    }

    public void setShipToStore(Boolean shipToStore) {
        this.shipToStore = shipToStore;
    }

    public Boolean getFreeShipToStore() {
        return freeShipToStore;
    }

    public void setFreeShipToStore(Boolean freeShipToStore) {
        this.freeShipToStore = freeShipToStore;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }

    public Integer getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }

    public String getCustomerRatingImage() {
        return customerRatingImage;
    }

    public void setCustomerRatingImage(String customerRatingImage) {
        this.customerRatingImage = customerRatingImage;
    }

    public BestMarketplacePrice getBestMarketplacePrice() {
        return bestMarketplacePrice;
    }

    public void setBestMarketplacePrice(BestMarketplacePrice bestMarketplacePrice) {
        this.bestMarketplacePrice = bestMarketplacePrice;
    }

    public String getCategoryNode() {
        return categoryNode;
    }

    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    public String getRhid() {
        return rhid;
    }

    public void setRhid(String rhid) {
        this.rhid = rhid;
    }

    public Boolean getBundle() {
        return bundle;
    }

    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    public Boolean getClearance() {
        return clearance;
    }

    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
    }

    public Boolean getPreOrder() {
        return preOrder;
    }

    public void setPreOrder(Boolean preOrder) {
        this.preOrder = preOrder;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getAddToCartUrl() {
        return addToCartUrl;
    }

    public void setAddToCartUrl(String addToCartUrl) {
        this.addToCartUrl = addToCartUrl;
    }

    public String getAffiliateAddToCartUrl() {
        return affiliateAddToCartUrl;
    }

    public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    public Boolean getFreeShippingOver35Dollars() {
        return freeShippingOver35Dollars;
    }

    public void setFreeShippingOver35Dollars(Boolean freeShippingOver35Dollars) {
        this.freeShippingOver35Dollars = freeShippingOver35Dollars;
    }

    public GiftOptions getGiftOptions() {
        return giftOptions;
    }

    public void setGiftOptions(GiftOptions giftOptions) {
        this.giftOptions = giftOptions;
    }

    public List<ImageEntity> getImageEntities() {
        return imageEntities;
    }

    public void setImageEntities(List<ImageEntity> imageEntities) {
        this.imageEntities = imageEntities;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Boolean getIsTwoDayShippingEligible() {
        return isTwoDayShippingEligible;
    }

    public void setIsTwoDayShippingEligible(Boolean isTwoDayShippingEligible) {
        this.isTwoDayShippingEligible = isTwoDayShippingEligible;
    }

    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

}

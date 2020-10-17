
package com.moringaschool.linex_kenya;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageEntity {

    @SerializedName("thumbnailImage")
    @Expose
    private String thumbnailImage;
    @SerializedName("mediumImage")
    @Expose
    private String mediumImage;
    @SerializedName("largeImage")
    @Expose
    private String largeImage;
    @SerializedName("entityType")
    @Expose
    private String entityType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageEntity() {
    }

    /**
     * 
     * @param largeImage
     * @param entityType
     * @param mediumImage
     * @param thumbnailImage
     */
    public ImageEntity(String thumbnailImage, String mediumImage, String largeImage, String entityType) {
        super();
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.entityType = entityType;
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

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

}

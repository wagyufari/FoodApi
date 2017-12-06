
package com.nacoda.foodapi.model.food;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FoodRecipe implements Serializable {

    @SerializedName("f2f_url")
    private String mF2fUrl;
    @SerializedName("image_url")
    private String mImageUrl;
    @SerializedName("publisher")
    private String mPublisher;
    @SerializedName("publisher_url")
    private String mPublisherUrl;
    @SerializedName("recipe_id")
    private String mRecipeId;
    @SerializedName("social_rank")
    private Long mSocialRank;
    @SerializedName("source_url")
    private String mSourceUrl;
    @SerializedName("title")
    private String mTitle;

    public String getF2fUrl() {
        return mF2fUrl;
    }

    public void setF2fUrl(String f2fUrl) {
        mF2fUrl = f2fUrl;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public void setPublisher(String publisher) {
        mPublisher = publisher;
    }

    public String getPublisherUrl() {
        return mPublisherUrl;
    }

    public void setPublisherUrl(String publisherUrl) {
        mPublisherUrl = publisherUrl;
    }

    public String getRecipeId() {
        return mRecipeId;
    }

    public void setRecipeId(String recipeId) {
        mRecipeId = recipeId;
    }

    public Long getSocialRank() {
        return mSocialRank;
    }

    public void setSocialRank(Long socialRank) {
        mSocialRank = socialRank;
    }

    public String getSourceUrl() {
        return mSourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        mSourceUrl = sourceUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}

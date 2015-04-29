package ru.avsidorov.restapitemplate.Models;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Talks_ implements Serializable{

    @Expose
    private Integer id;
    @SerializedName("event_id")
    @Expose
    private Integer eventId;
    @Expose
    private String name;
    @Expose
    private String description;
    @Expose
    private String slug;
    @SerializedName("native_language_code")
    @Expose
    private String nativeLanguageCode;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("recorded_at")
    @Expose
    private String recordedAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("released_at")
    @Expose
    private String releasedAt;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     *
     * @param eventId
     * The event_id
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     * The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     *
     * @return
     * The nativeLanguageCode
     */
    public String getNativeLanguageCode() {
        return nativeLanguageCode;
    }

    /**
     *
     * @param nativeLanguageCode
     * The native_language_code
     */
    public void setNativeLanguageCode(String nativeLanguageCode) {
        this.nativeLanguageCode = nativeLanguageCode;
    }

    /**
     *
     * @return
     * The publishedAt
     */
    public String getPublishedAt() {
        return publishedAt;
    }

    /**
     *
     * @param publishedAt
     * The published_at
     */
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     *
     * @return
     * The recordedAt
     */
    public String getRecordedAt() {
        return recordedAt;
    }

    /**
     *
     * @param recordedAt
     * The recorded_at
     */
    public void setRecordedAt(String recordedAt) {
        this.recordedAt = recordedAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     * The releasedAt
     */
    public String getReleasedAt() {
        return releasedAt;
    }

    /**
     *
     * @param releasedAt
     * The released_at
     */
    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

}

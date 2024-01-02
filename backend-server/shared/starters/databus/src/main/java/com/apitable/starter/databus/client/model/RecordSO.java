/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.starter.databus.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.apitable.starter.databus.client.model.Comments;
import com.apitable.starter.databus.client.model.RecordMeta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RecordSO
 */
@JsonPropertyOrder({
  RecordSO.JSON_PROPERTY_COMMENT_COUNT,
  RecordSO.JSON_PROPERTY_COMMENTS,
  RecordSO.JSON_PROPERTY_CREATED_AT,
  RecordSO.JSON_PROPERTY_DATA,
  RecordSO.JSON_PROPERTY_ID,
  RecordSO.JSON_PROPERTY_RECORD_META,
  RecordSO.JSON_PROPERTY_REVISION_HISTORY,
  RecordSO.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordSO {
  public static final String JSON_PROPERTY_COMMENT_COUNT = "commentCount";
  private Integer commentCount;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private List<Comments> comments;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_META = "recordMeta";
  private RecordMeta recordMeta;

  public static final String JSON_PROPERTY_REVISION_HISTORY = "revisionHistory";
  private List<Integer> revisionHistory;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public RecordSO() {
  }

  public RecordSO commentCount(Integer commentCount) {
    
    this.commentCount = commentCount;
    return this;
  }

   /**
   * Get commentCount
   * minimum: 0
   * @return commentCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCommentCount() {
    return commentCount;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }


  public RecordSO comments(List<Comments> comments) {
    
    this.comments = comments;
    return this;
  }

  public RecordSO addCommentsItem(Comments commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Comments> getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComments(List<Comments> comments) {
    this.comments = comments;
  }


  public RecordSO createdAt(Long createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public RecordSO data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(Object data) {
    this.data = data;
  }


  public RecordSO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public RecordSO recordMeta(RecordMeta recordMeta) {
    
    this.recordMeta = recordMeta;
    return this;
  }

   /**
   * Get recordMeta
   * @return recordMeta
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordMeta getRecordMeta() {
    return recordMeta;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordMeta(RecordMeta recordMeta) {
    this.recordMeta = recordMeta;
  }


  public RecordSO revisionHistory(List<Integer> revisionHistory) {
    
    this.revisionHistory = revisionHistory;
    return this;
  }

  public RecordSO addRevisionHistoryItem(Integer revisionHistoryItem) {
    if (this.revisionHistory == null) {
      this.revisionHistory = new ArrayList<>();
    }
    this.revisionHistory.add(revisionHistoryItem);
    return this;
  }

   /**
   * Get revisionHistory
   * @return revisionHistory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getRevisionHistory() {
    return revisionHistory;
  }


  @JsonProperty(JSON_PROPERTY_REVISION_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevisionHistory(List<Integer> revisionHistory) {
    this.revisionHistory = revisionHistory;
  }


  public RecordSO updatedAt(Long updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordSO recordSO = (RecordSO) o;
    return Objects.equals(this.commentCount, recordSO.commentCount) &&
        Objects.equals(this.comments, recordSO.comments) &&
        Objects.equals(this.createdAt, recordSO.createdAt) &&
        Objects.equals(this.data, recordSO.data) &&
        Objects.equals(this.id, recordSO.id) &&
        Objects.equals(this.recordMeta, recordSO.recordMeta) &&
        Objects.equals(this.revisionHistory, recordSO.revisionHistory) &&
        Objects.equals(this.updatedAt, recordSO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentCount, comments, createdAt, data, id, recordMeta, revisionHistory, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordSO {\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordMeta: ").append(toIndentedString(recordMeta)).append("\n");
    sb.append("    revisionHistory: ").append(toIndentedString(revisionHistory)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

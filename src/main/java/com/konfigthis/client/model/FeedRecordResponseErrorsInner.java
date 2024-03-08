/*
 * Content Management
 * The content management feed allows you to process content for items in bulk. You can take in content via the content feeds. Use the XSDs to manage content.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.FeedRecordResponseErrorsInnerCausesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * FeedRecordResponseErrorsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FeedRecordResponseErrorsInner {
  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  /**
   * Gets or Sets severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
 public enum SeverityEnum {
    INFO("INFO"),
    
    WARN("WARN"),
    
    ERROR("ERROR");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SeverityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private SeverityEnum severity;

  /**
   * Gets or Sets category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
 public enum CategoryEnum {
    APPLICATION("APPLICATION"),
    
    SYSTEM("SYSTEM"),
    
    REQUEST("REQUEST"),
    
    DATA("DATA");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_CAUSES = "causes";
  @SerializedName(SERIALIZED_NAME_CAUSES)
  private List<FeedRecordResponseErrorsInnerCausesInner> causes = null;

  public static final String SERIALIZED_NAME_ERROR_IDENTIFIERS = "errorIdentifiers";
  @SerializedName(SERIALIZED_NAME_ERROR_IDENTIFIERS)
  private Map<String, Object> errorIdentifiers = null;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  /**
   * Gets or Sets gatewayErrorCategory
   */
  @JsonAdapter(GatewayErrorCategoryEnum.Adapter.class)
 public enum GatewayErrorCategoryEnum {
    INTERNAL_DATA_ERROR("INTERNAL_DATA_ERROR"),
    
    EXTERNAL_DATA_ERROR("EXTERNAL_DATA_ERROR"),
    
    SYSTEM_ERROR("SYSTEM_ERROR");

    private String value;

    GatewayErrorCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GatewayErrorCategoryEnum fromValue(String value) {
      for (GatewayErrorCategoryEnum b : GatewayErrorCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GatewayErrorCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GatewayErrorCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GatewayErrorCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GatewayErrorCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GATEWAY_ERROR_CATEGORY = "gatewayErrorCategory";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ERROR_CATEGORY)
  private GatewayErrorCategoryEnum gatewayErrorCategory;

  public FeedRecordResponseErrorsInner() {
  }

  public FeedRecordResponseErrorsInner info(String info) {
    
    
    
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInfo() {
    return info;
  }


  public void setInfo(String info) {
    
    
    
    this.info = info;
  }


  public FeedRecordResponseErrorsInner description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public FeedRecordResponseErrorsInner code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public FeedRecordResponseErrorsInner field(String field) {
    
    
    
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    
    
    
    this.field = field;
  }


  public FeedRecordResponseErrorsInner severity(SeverityEnum severity) {
    
    
    
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeverityEnum getSeverity() {
    return severity;
  }


  public void setSeverity(SeverityEnum severity) {
    
    
    
    this.severity = severity;
  }


  public FeedRecordResponseErrorsInner category(CategoryEnum category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    
    
    
    this.category = category;
  }


  public FeedRecordResponseErrorsInner causes(List<FeedRecordResponseErrorsInnerCausesInner> causes) {
    
    
    
    
    this.causes = causes;
    return this;
  }

  public FeedRecordResponseErrorsInner addCausesItem(FeedRecordResponseErrorsInnerCausesInner causesItem) {
    if (this.causes == null) {
      this.causes = new ArrayList<>();
    }
    this.causes.add(causesItem);
    return this;
  }

   /**
   * Get causes
   * @return causes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FeedRecordResponseErrorsInnerCausesInner> getCauses() {
    return causes;
  }


  public void setCauses(List<FeedRecordResponseErrorsInnerCausesInner> causes) {
    
    
    
    this.causes = causes;
  }


  public FeedRecordResponseErrorsInner errorIdentifiers(Map<String, Object> errorIdentifiers) {
    
    
    
    
    this.errorIdentifiers = errorIdentifiers;
    return this;
  }

  public FeedRecordResponseErrorsInner putErrorIdentifiersItem(String key, Object errorIdentifiersItem) {
    if (this.errorIdentifiers == null) {
      this.errorIdentifiers = new HashMap<>();
    }
    this.errorIdentifiers.put(key, errorIdentifiersItem);
    return this;
  }

   /**
   * Get errorIdentifiers
   * @return errorIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getErrorIdentifiers() {
    return errorIdentifiers;
  }


  public void setErrorIdentifiers(Map<String, Object> errorIdentifiers) {
    
    
    
    this.errorIdentifiers = errorIdentifiers;
  }


  public FeedRecordResponseErrorsInner component(String component) {
    
    
    
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComponent() {
    return component;
  }


  public void setComponent(String component) {
    
    
    
    this.component = component;
  }


  public FeedRecordResponseErrorsInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public FeedRecordResponseErrorsInner serviceName(String serviceName) {
    
    
    
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    
    
    
    this.serviceName = serviceName;
  }


  public FeedRecordResponseErrorsInner gatewayErrorCategory(GatewayErrorCategoryEnum gatewayErrorCategory) {
    
    
    
    
    this.gatewayErrorCategory = gatewayErrorCategory;
    return this;
  }

   /**
   * Get gatewayErrorCategory
   * @return gatewayErrorCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayErrorCategoryEnum getGatewayErrorCategory() {
    return gatewayErrorCategory;
  }


  public void setGatewayErrorCategory(GatewayErrorCategoryEnum gatewayErrorCategory) {
    
    
    
    this.gatewayErrorCategory = gatewayErrorCategory;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the FeedRecordResponseErrorsInner instance itself
   */
  public FeedRecordResponseErrorsInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedRecordResponseErrorsInner feedRecordResponseErrorsInner = (FeedRecordResponseErrorsInner) o;
    return Objects.equals(this.info, feedRecordResponseErrorsInner.info) &&
        Objects.equals(this.description, feedRecordResponseErrorsInner.description) &&
        Objects.equals(this.code, feedRecordResponseErrorsInner.code) &&
        Objects.equals(this.field, feedRecordResponseErrorsInner.field) &&
        Objects.equals(this.severity, feedRecordResponseErrorsInner.severity) &&
        Objects.equals(this.category, feedRecordResponseErrorsInner.category) &&
        Objects.equals(this.causes, feedRecordResponseErrorsInner.causes) &&
        Objects.equals(this.errorIdentifiers, feedRecordResponseErrorsInner.errorIdentifiers) &&
        Objects.equals(this.component, feedRecordResponseErrorsInner.component) &&
        Objects.equals(this.type, feedRecordResponseErrorsInner.type) &&
        Objects.equals(this.serviceName, feedRecordResponseErrorsInner.serviceName) &&
        Objects.equals(this.gatewayErrorCategory, feedRecordResponseErrorsInner.gatewayErrorCategory)&&
        Objects.equals(this.additionalProperties, feedRecordResponseErrorsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, description, code, field, severity, category, causes, errorIdentifiers, component, type, serviceName, gatewayErrorCategory, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedRecordResponseErrorsInner {\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    errorIdentifiers: ").append(toIndentedString(errorIdentifiers)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    gatewayErrorCategory: ").append(toIndentedString(gatewayErrorCategory)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("info");
    openapiFields.add("description");
    openapiFields.add("code");
    openapiFields.add("field");
    openapiFields.add("severity");
    openapiFields.add("category");
    openapiFields.add("causes");
    openapiFields.add("errorIdentifiers");
    openapiFields.add("component");
    openapiFields.add("type");
    openapiFields.add("serviceName");
    openapiFields.add("gatewayErrorCategory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeedRecordResponseErrorsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FeedRecordResponseErrorsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedRecordResponseErrorsInner is not found in the empty JSON string", FeedRecordResponseErrorsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FeedRecordResponseErrorsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("info") != null && !jsonObj.get("info").isJsonNull()) && !jsonObj.get("info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("info").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("causes") != null && !jsonObj.get("causes").isJsonNull()) {
        JsonArray jsonArraycauses = jsonObj.getAsJsonArray("causes");
        if (jsonArraycauses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("causes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `causes` to be an array in the JSON string but got `%s`", jsonObj.get("causes").toString()));
          }

          // validate the optional field `causes` (array)
          for (int i = 0; i < jsonArraycauses.size(); i++) {
            FeedRecordResponseErrorsInnerCausesInner.validateJsonObject(jsonArraycauses.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("serviceName") != null && !jsonObj.get("serviceName").isJsonNull()) && !jsonObj.get("serviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceName").toString()));
      }
      if ((jsonObj.get("gatewayErrorCategory") != null && !jsonObj.get("gatewayErrorCategory").isJsonNull()) && !jsonObj.get("gatewayErrorCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayErrorCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayErrorCategory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedRecordResponseErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedRecordResponseErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedRecordResponseErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedRecordResponseErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedRecordResponseErrorsInner>() {
           @Override
           public void write(JsonWriter out, FeedRecordResponseErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedRecordResponseErrorsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FeedRecordResponseErrorsInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeedRecordResponseErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeedRecordResponseErrorsInner
  * @throws IOException if the JSON string is invalid with respect to FeedRecordResponseErrorsInner
  */
  public static FeedRecordResponseErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedRecordResponseErrorsInner.class);
  }

 /**
  * Convert an instance of FeedRecordResponseErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


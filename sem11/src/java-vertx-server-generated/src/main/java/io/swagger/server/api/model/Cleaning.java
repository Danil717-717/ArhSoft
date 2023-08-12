package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Cleaning
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-08-12T11:28:15.574453758Z[GMT]")



public class Cleaning   {
  private Long id = null;

  private String dateTime = null;

  private String type = null;

  private String description = null;

  public Cleaning id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cleaning dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
   **/
    public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public Cleaning type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Cleaning description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cleaning cleaning = (Cleaning) o;
    return Objects.equals(this.id, cleaning.id) &&
        Objects.equals(this.dateTime, cleaning.dateTime) &&
        Objects.equals(this.type, cleaning.type) &&
        Objects.equals(this.description, cleaning.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateTime, type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cleaning {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Schedule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-12T11:28:20.035575131Z[GMT]")


public class Schedule   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("dateTime")
  private String dateTime = null;

  @JsonProperty("mode")
  private Long mode = null;

  @JsonProperty("robotId")
  private Long robotId = null;

  public Schedule id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Schedule dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
   **/
  @Schema(example = "dd.mm.yyyy-hh:mm:ss", required = true, description = "")
      @NotNull

    public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public Schedule mode(Long mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   **/
  @Schema(example = "10", required = true, description = "")
      @NotNull

    public Long getMode() {
    return mode;
  }

  public void setMode(Long mode) {
    this.mode = mode;
  }

  public Schedule robotId(Long robotId) {
    this.robotId = robotId;
    return this;
  }

  /**
   * Get robotId
   * @return robotId
   **/
  @Schema(example = "10", required = true, description = "")
      @NotNull

    public Long getRobotId() {
    return robotId;
  }

  public void setRobotId(Long robotId) {
    this.robotId = robotId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.id, schedule.id) &&
        Objects.equals(this.dateTime, schedule.dateTime) &&
        Objects.equals(this.mode, schedule.mode) &&
        Objects.equals(this.robotId, schedule.robotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateTime, mode, robotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
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

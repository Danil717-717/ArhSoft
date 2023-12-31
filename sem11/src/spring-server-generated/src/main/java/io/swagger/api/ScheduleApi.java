/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Schedule;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-12T11:28:20.035575131Z[GMT]")
@Validated
public interface ScheduleApi {

    @Operation(summary = "Добавить расписание", description = "Добавить расписание", tags={ "Schedule" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Schedule.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/Schedule",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Schedule> addSchedule(@Parameter(in = ParameterIn.DEFAULT, description = "Добавить расписание в БД", required=true, schema=@Schema()) @Valid @RequestBody Schedule body);


    @Operation(summary = "Удалить расписание", description = "Удалить расписание по ID", tags={ "Schedule" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid Schedule value") })
    @RequestMapping(value = "/Schedule/deleteById/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSchedule(@Parameter(in = ParameterIn.PATH, description = "ID расписания", required=true, schema=@Schema()) @PathVariable("id") Long id, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="id", required=false) String id);


    @Operation(summary = "Найти расписание по ID", description = "Вернуть расписание по ID", tags={ "Schedule" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Schedule.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Schedule not found") })
    @RequestMapping(value = "/Schedule/findById/{scheduleId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Schedule> getScheduleById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор расписания", required=true, schema=@Schema()) @PathVariable("scheduleId") Long scheduleId);


    @Operation(summary = "Обновить расписание", description = "Обновить расписание по ID", tags={ "Schedule" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Schedule.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Schedule not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/Schedule",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Schedule> updateSchedule(@Parameter(in = ParameterIn.DEFAULT, description = "Обновить расписание в БД", required=true, schema=@Schema()) @Valid @RequestBody Schedule body);

}


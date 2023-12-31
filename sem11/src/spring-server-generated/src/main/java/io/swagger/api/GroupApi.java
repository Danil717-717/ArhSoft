/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Group;
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
public interface GroupApi {

    @Operation(summary = "Добавить группу", description = "Добавить группу в базу", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Group.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/Group",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Group> addGroup(@Parameter(in = ParameterIn.DEFAULT, description = "Создание новой группы в БД", required=true, schema=@Schema()) @Valid @RequestBody Group body);


    @Operation(summary = "Удаляет группу", description = "Удаляет группу", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid Group value") })
    @RequestMapping(value = "/Group/deleteById/{groupId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteGroup(@Parameter(in = ParameterIn.PATH, description = "ID группы", required=true, schema=@Schema()) @PathVariable("groupId") Long groupId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="groupId", required=false) String groupId);


    @Operation(summary = "Найти группу по ID", description = "вернуть группу", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Group.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Group not found") })
    @RequestMapping(value = "/Group/findById/{groupId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Group> getGroupById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор группы", required=true, schema=@Schema()) @PathVariable("groupId") Long groupId);


    @Operation(summary = "Обновить группу", description = "Обновить группу", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Group.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Group not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/Group",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Group> updateGroup(@Parameter(in = ParameterIn.DEFAULT, description = "Обновить существующую группу в базе", required=true, schema=@Schema()) @Valid @RequestBody Group body);

}


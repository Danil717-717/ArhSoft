/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cleaning;
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
public interface LeaningApi {

    @Operation(summary = "Удаляет уборку", description = "Удаляет уборку", tags={ "Сleaning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid Robot value") })
    @RequestMapping(value = "/Сleaning/deleteById/{сleaningId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteleaning(@Parameter(in = ParameterIn.PATH, description = "ID уборки", required=true, schema=@Schema()) @PathVariable("сleaningId") Long leaningId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="сleaningId", required=false) String leaningId);


    @Operation(summary = "Найти уборку по ID", description = "Вернуть уборку по ID", tags={ "Сleaning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cleaning.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Robot not found") })
    @RequestMapping(value = "/Сleaning/findById/{сleaningId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Cleaning> getleaningById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор уборки", required=true, schema=@Schema()) @PathVariable("сleaningId") Long leaningId);

}


package io.swagger.api;

import io.swagger.model.Schedule;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-12T11:28:20.035575131Z[GMT]")
@RestController
public class ScheduleApiController implements ScheduleApi {

    private static final Logger log = LoggerFactory.getLogger(ScheduleApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ScheduleApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Schedule> addSchedule(@Parameter(in = ParameterIn.DEFAULT, description = "Добавить расписание в БД", required=true, schema=@Schema()) @Valid @RequestBody Schedule body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Schedule>(objectMapper.readValue("{\n  \"dateTime\" : \"dd.mm.yyyy-hh:mm:ss\",\n  \"mode\" : 10,\n  \"id\" : 10,\n  \"robotId\" : 10\n}", Schedule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Schedule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Schedule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteSchedule(@Parameter(in = ParameterIn.PATH, description = "ID расписания", required=true, schema=@Schema()) @PathVariable("id") Long id,@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="id", required=false) String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Schedule> getScheduleById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор расписания", required=true, schema=@Schema()) @PathVariable("scheduleId") Long scheduleId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Schedule>(objectMapper.readValue("{\n  \"dateTime\" : \"dd.mm.yyyy-hh:mm:ss\",\n  \"mode\" : 10,\n  \"id\" : 10,\n  \"robotId\" : 10\n}", Schedule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Schedule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Schedule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Schedule> updateSchedule(@Parameter(in = ParameterIn.DEFAULT, description = "Обновить расписание в БД", required=true, schema=@Schema()) @Valid @RequestBody Schedule body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Schedule>(objectMapper.readValue("{\n  \"dateTime\" : \"dd.mm.yyyy-hh:mm:ss\",\n  \"mode\" : 10,\n  \"id\" : 10,\n  \"robotId\" : 10\n}", Schedule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Schedule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Schedule>(HttpStatus.NOT_IMPLEMENTED);
    }

}

package io.swagger.server.api.service;

import io.swagger.server.api.model.Cleaning;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface LeaningApi  {

    String WEBSERVICE_ADDRESS_LEANINGAPI = "";
    String OPERATION_ID_ADDCLEANING = "addCleaning";
    String OPERATION_ID_DELETELEANING = "deleteleaning";
    String OPERATION_ID_GETLEANINGBYID = "getleaningById";
    String OPERATION_ID_UPDATELEANING = "updateleaning";

    void addCleaning(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void addCleaning(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void deleteСleaning(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getСleaningById(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateСleaning(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateСleaning(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}

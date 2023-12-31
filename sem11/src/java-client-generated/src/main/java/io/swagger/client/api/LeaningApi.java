/*
 * Robot service 3.0
 * API сервис управления роботом - пылесосом
 *
 * OpenAPI spec version: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Cleaning;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeaningApi {
    private ApiClient apiClient;

    public LeaningApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LeaningApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addCleaning
     * @param body Добавить уборку в БД (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCleaningCall(Cleaning body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Cleaning";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addCleaningValidateBeforeCall(Cleaning body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addCleaning(Async)");
        }
        
        com.squareup.okhttp.Call call = addCleaningCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Добавить уборку
     * Добавить уборку по ID
     * @param body Добавить уборку в БД (required)
     * @return Cleaning
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Cleaning addCleaning(Cleaning body) throws ApiException {
        ApiResponse<Cleaning> resp = addCleaningWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Добавить уборку
     * Добавить уборку по ID
     * @param body Добавить уборку в БД (required)
     * @return ApiResponse&lt;Cleaning&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Cleaning> addCleaningWithHttpInfo(Cleaning body) throws ApiException {
        com.squareup.okhttp.Call call = addCleaningValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Добавить уборку (asynchronously)
     * Добавить уборку по ID
     * @param body Добавить уборку в БД (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addCleaningAsync(Cleaning body, final ApiCallback<Cleaning> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addCleaningValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addCleaning
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCleaningCall(Long id, String dateTime, String type, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Cleaning";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (id != null)
        localVarFormParams.put("id", id);
        if (dateTime != null)
        localVarFormParams.put("dateTime", dateTime);
        if (type != null)
        localVarFormParams.put("type", type);
        if (description != null)
        localVarFormParams.put("description", description);

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addCleaningValidateBeforeCall(Long id, String dateTime, String type, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addCleaning(Async)");
        }
        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new ApiException("Missing the required parameter 'dateTime' when calling addCleaning(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling addCleaning(Async)");
        }
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new ApiException("Missing the required parameter 'description' when calling addCleaning(Async)");
        }
        
        com.squareup.okhttp.Call call = addCleaningCall(id, dateTime, type, description, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Добавить уборку
     * Добавить уборку по ID
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @return Cleaning
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Cleaning addCleaning(Long id, String dateTime, String type, String description) throws ApiException {
        ApiResponse<Cleaning> resp = addCleaningWithHttpInfo(id, dateTime, type, description);
        return resp.getData();
    }

    /**
     * Добавить уборку
     * Добавить уборку по ID
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @return ApiResponse&lt;Cleaning&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Cleaning> addCleaningWithHttpInfo(Long id, String dateTime, String type, String description) throws ApiException {
        com.squareup.okhttp.Call call = addCleaningValidateBeforeCall(id, dateTime, type, description, null, null);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Добавить уборку (asynchronously)
     * Добавить уборку по ID
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addCleaningAsync(Long id, String dateTime, String type, String description, final ApiCallback<Cleaning> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addCleaningValidateBeforeCall(id, dateTime, type, description, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteleaning
     * @param leaningId ID уборки (required)
     * @param leaningId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteleaningCall(Long leaningId, String leaningId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Сleaning/deleteById/{сleaningId}"
            .replaceAll("\\{" + "сleaningId" + "\\}", apiClient.escapeString(leaningId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (leaningId != null)
        localVarHeaderParams.put("сleaningId", apiClient.parameterToString(leaningId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteleaningValidateBeforeCall(Long leaningId, String leaningId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'leaningId' is set
        if (leaningId == null) {
            throw new ApiException("Missing the required parameter 'leaningId' when calling deleteleaning(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteleaningCall(leaningId, leaningId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Удаляет уборку
     * Удаляет уборку
     * @param leaningId ID уборки (required)
     * @param leaningId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteleaning(Long leaningId, String leaningId) throws ApiException {
        deleteleaningWithHttpInfo(leaningId, leaningId);
    }

    /**
     * Удаляет уборку
     * Удаляет уборку
     * @param leaningId ID уборки (required)
     * @param leaningId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteleaningWithHttpInfo(Long leaningId, String leaningId) throws ApiException {
        com.squareup.okhttp.Call call = deleteleaningValidateBeforeCall(leaningId, leaningId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Удаляет уборку (asynchronously)
     * Удаляет уборку
     * @param leaningId ID уборки (required)
     * @param leaningId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteleaningAsync(Long leaningId, String leaningId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteleaningValidateBeforeCall(leaningId, leaningId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getleaningById
     * @param leaningId Идентификатор уборки (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getleaningByIdCall(Long leaningId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Сleaning/findById/{сleaningId}"
            .replaceAll("\\{" + "сleaningId" + "\\}", apiClient.escapeString(leaningId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getleaningByIdValidateBeforeCall(Long leaningId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'leaningId' is set
        if (leaningId == null) {
            throw new ApiException("Missing the required parameter 'leaningId' when calling getleaningById(Async)");
        }
        
        com.squareup.okhttp.Call call = getleaningByIdCall(leaningId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Найти уборку по ID
     * Вернуть уборку по ID
     * @param leaningId Идентификатор уборки (required)
     * @return Cleaning
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Cleaning getleaningById(Long leaningId) throws ApiException {
        ApiResponse<Cleaning> resp = getleaningByIdWithHttpInfo(leaningId);
        return resp.getData();
    }

    /**
     * Найти уборку по ID
     * Вернуть уборку по ID
     * @param leaningId Идентификатор уборки (required)
     * @return ApiResponse&lt;Cleaning&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Cleaning> getleaningByIdWithHttpInfo(Long leaningId) throws ApiException {
        com.squareup.okhttp.Call call = getleaningByIdValidateBeforeCall(leaningId, null, null);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Найти уборку по ID (asynchronously)
     * Вернуть уборку по ID
     * @param leaningId Идентификатор уборки (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getleaningByIdAsync(Long leaningId, final ApiCallback<Cleaning> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getleaningByIdValidateBeforeCall(leaningId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateleaning
     * @param body Создание уборки в БД (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateleaningCall(Cleaning body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Cleaning";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateleaningValidateBeforeCall(Cleaning body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateleaning(Async)");
        }
        
        com.squareup.okhttp.Call call = updateleaningCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Обновить уборку
     * Обновить убоку
     * @param body Создание уборки в БД (required)
     * @return Cleaning
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Cleaning updateleaning(Cleaning body) throws ApiException {
        ApiResponse<Cleaning> resp = updateleaningWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Обновить уборку
     * Обновить убоку
     * @param body Создание уборки в БД (required)
     * @return ApiResponse&lt;Cleaning&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Cleaning> updateleaningWithHttpInfo(Cleaning body) throws ApiException {
        com.squareup.okhttp.Call call = updateleaningValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Обновить уборку (asynchronously)
     * Обновить убоку
     * @param body Создание уборки в БД (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateleaningAsync(Cleaning body, final ApiCallback<Cleaning> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateleaningValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateleaning
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateleaningCall(Long id, String dateTime, String type, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Cleaning";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (id != null)
        localVarFormParams.put("id", id);
        if (dateTime != null)
        localVarFormParams.put("dateTime", dateTime);
        if (type != null)
        localVarFormParams.put("type", type);
        if (description != null)
        localVarFormParams.put("description", description);

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateleaningValidateBeforeCall(Long id, String dateTime, String type, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateleaning(Async)");
        }
        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new ApiException("Missing the required parameter 'dateTime' when calling updateleaning(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling updateleaning(Async)");
        }
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new ApiException("Missing the required parameter 'description' when calling updateleaning(Async)");
        }
        
        com.squareup.okhttp.Call call = updateleaningCall(id, dateTime, type, description, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Обновить уборку
     * Обновить убоку
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @return Cleaning
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Cleaning updateleaning(Long id, String dateTime, String type, String description) throws ApiException {
        ApiResponse<Cleaning> resp = updateleaningWithHttpInfo(id, dateTime, type, description);
        return resp.getData();
    }

    /**
     * Обновить уборку
     * Обновить убоку
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @return ApiResponse&lt;Cleaning&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Cleaning> updateleaningWithHttpInfo(Long id, String dateTime, String type, String description) throws ApiException {
        com.squareup.okhttp.Call call = updateleaningValidateBeforeCall(id, dateTime, type, description, null, null);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Обновить уборку (asynchronously)
     * Обновить убоку
     * @param id  (required)
     * @param dateTime  (required)
     * @param type  (required)
     * @param description  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateleaningAsync(Long id, String dateTime, String type, String description, final ApiCallback<Cleaning> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateleaningValidateBeforeCall(id, dateTime, type, description, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Cleaning>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

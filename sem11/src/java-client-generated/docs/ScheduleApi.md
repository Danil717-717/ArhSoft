# ScheduleApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSchedule**](ScheduleApi.md#addSchedule) | **POST** /Schedule | Добавить расписание
[**deleteSchedule**](ScheduleApi.md#deleteSchedule) | **DELETE** /Schedule/deleteById/{id} | Удалить расписание
[**getScheduleById**](ScheduleApi.md#getScheduleById) | **GET** /Schedule/findById/{scheduleId} | Найти расписание по ID
[**updateSchedule**](ScheduleApi.md#updateSchedule) | **PUT** /Schedule | Обновить расписание

<a name="addSchedule"></a>
# **addSchedule**
> Schedule addSchedule(body)

Добавить расписание

Добавить расписание

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Schedule body = new Schedule(); // Schedule | Добавить расписание в БД
try {
    Schedule result = apiInstance.addSchedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#addSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Добавить расписание в БД |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addSchedule"></a>
# **addSchedule**
> Schedule addSchedule(id, dateTime, mode, robotId)

Добавить расписание

Добавить расписание

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | 
String dateTime = "dateTime_example"; // String | 
Long mode = 789L; // Long | 
Long robotId = 789L; // Long | 
try {
    Schedule result = apiInstance.addSchedule(id, dateTime, mode, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#addSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **dateTime** | **String**|  |
 **mode** | **Long**|  |
 **robotId** | **Long**|  |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteSchedule"></a>
# **deleteSchedule**
> deleteSchedule(id, id)

Удалить расписание

Удалить расписание по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | ID расписания
String id = "id_example"; // String | 
try {
    apiInstance.deleteSchedule(id, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#deleteSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID расписания |
 **id** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getScheduleById"></a>
# **getScheduleById**
> Schedule getScheduleById(scheduleId)

Найти расписание по ID

Вернуть расписание по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long scheduleId = 789L; // Long | Идентификатор расписания
try {
    Schedule result = apiInstance.getScheduleById(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#getScheduleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **Long**| Идентификатор расписания |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateSchedule"></a>
# **updateSchedule**
> Schedule updateSchedule(body)

Обновить расписание

Обновить расписание по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Schedule body = new Schedule(); // Schedule | Обновить расписание в БД
try {
    Schedule result = apiInstance.updateSchedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#updateSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Обновить расписание в БД |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateSchedule"></a>
# **updateSchedule**
> Schedule updateSchedule(id, dateTime, mode, robotId)

Обновить расписание

Обновить расписание по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | 
String dateTime = "dateTime_example"; // String | 
Long mode = 789L; // Long | 
Long robotId = 789L; // Long | 
try {
    Schedule result = apiInstance.updateSchedule(id, dateTime, mode, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#updateSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **dateTime** | **String**|  |
 **mode** | **Long**|  |
 **robotId** | **Long**|  |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml


# LeaningApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCleaning**](LeaningApi.md#addCleaning) | **POST** /Cleaning | Добавить уборку
[**deleteleaning**](LeaningApi.md#deleteleaning) | **DELETE** /Сleaning/deleteById/{сleaningId} | Удаляет уборку
[**getleaningById**](LeaningApi.md#getleaningById) | **GET** /Сleaning/findById/{сleaningId} | Найти уборку по ID
[**updateleaning**](LeaningApi.md#updateleaning) | **PUT** /Cleaning | Обновить уборку

<a name="addCleaning"></a>
# **addCleaning**
> Cleaning addCleaning(body)

Добавить уборку

Добавить уборку по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LeaningApi;


LeaningApi apiInstance = new LeaningApi();
Cleaning body = new Cleaning(); // Cleaning | Добавить уборку в БД
try {
    Cleaning result = apiInstance.addCleaning(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaningApi#addCleaning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Cleaning**](Cleaning.md)| Добавить уборку в БД |

### Return type

[**Cleaning**](Cleaning.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addCleaning"></a>
# **addCleaning**
> Cleaning addCleaning(id, dateTime, type, description)

Добавить уборку

Добавить уборку по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LeaningApi;


LeaningApi apiInstance = new LeaningApi();
Long id = 789L; // Long | 
String dateTime = "dateTime_example"; // String | 
String type = "type_example"; // String | 
String description = "description_example"; // String | 
try {
    Cleaning result = apiInstance.addCleaning(id, dateTime, type, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaningApi#addCleaning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **dateTime** | **String**|  |
 **type** | **String**|  |
 **description** | **String**|  |

### Return type

[**Cleaning**](Cleaning.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteleaning"></a>
# **deleteleaning**
> deleteleaning(leaningId, leaningId)

Удаляет уборку

Удаляет уборку

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LeaningApi;


LeaningApi apiInstance = new LeaningApi();
Long leaningId = 789L; // Long | ID уборки
String leaningId = "leaningId_example"; // String | 
try {
    apiInstance.deleteleaning(leaningId, leaningId);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaningApi#deleteleaning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaningId** | **Long**| ID уборки |
 **leaningId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getleaningById"></a>
# **getleaningById**
> Cleaning getleaningById(leaningId)

Найти уборку по ID

Вернуть уборку по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LeaningApi;


LeaningApi apiInstance = new LeaningApi();
Long leaningId = 789L; // Long | Идентификатор уборки
try {
    Cleaning result = apiInstance.getleaningById(leaningId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaningApi#getleaningById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaningId** | **Long**| Идентификатор уборки |

### Return type

[**Cleaning**](Cleaning.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateleaning"></a>
# **updateleaning**
> Cleaning updateleaning(body)

Обновить уборку

Обновить убоку

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LeaningApi;


LeaningApi apiInstance = new LeaningApi();
Cleaning body = new Cleaning(); // Cleaning | Создание уборки в БД
try {
    Cleaning result = apiInstance.updateleaning(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaningApi#updateleaning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Cleaning**](Cleaning.md)| Создание уборки в БД |

### Return type

[**Cleaning**](Cleaning.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateleaning"></a>
# **updateleaning**
> Cleaning updateleaning(id, dateTime, type, description)

Обновить уборку

Обновить убоку

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LeaningApi;


LeaningApi apiInstance = new LeaningApi();
Long id = 789L; // Long | 
String dateTime = "dateTime_example"; // String | 
String type = "type_example"; // String | 
String description = "description_example"; // String | 
try {
    Cleaning result = apiInstance.updateleaning(id, dateTime, type, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaningApi#updateleaning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **dateTime** | **String**|  |
 **type** | **String**|  |
 **description** | **String**|  |

### Return type

[**Cleaning**](Cleaning.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml


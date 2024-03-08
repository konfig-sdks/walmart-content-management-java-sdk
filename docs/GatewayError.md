

# GatewayError


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**info** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**code** | **String** |  |  |
|**field** | **String** |  |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
|**causes** | [**List&lt;FeedRecordResponseErrorsInnerCausesInner&gt;**](FeedRecordResponseErrorsInnerCausesInner.md) |  |  [optional] |
|**errorIdentifiers** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**component** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**serviceName** | **String** |  |  [optional] |
|**gatewayErrorCategory** | [**GatewayErrorCategoryEnum**](#GatewayErrorCategoryEnum) |  |  [optional] |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;INFO&quot; |
| WARN | &quot;WARN&quot; |
| ERROR | &quot;ERROR&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| REQUEST | &quot;REQUEST&quot; |
| DATA | &quot;DATA&quot; |



## Enum: GatewayErrorCategoryEnum

| Name | Value |
|---- | -----|
| INTERNAL_DATA_ERROR | &quot;INTERNAL_DATA_ERROR&quot; |
| EXTERNAL_DATA_ERROR | &quot;EXTERNAL_DATA_ERROR&quot; |
| SYSTEM_ERROR | &quot;SYSTEM_ERROR&quot; |




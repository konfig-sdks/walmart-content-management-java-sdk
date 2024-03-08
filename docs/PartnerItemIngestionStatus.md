

# PartnerItemIngestionStatus

The ingestion status of an individual item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**martId** | **Integer** | Mart ID that a user or seller uses for a marketplace |  [optional] |
|**sku** | **String** | An arbitrary alphanumeric unique ID, seller-specified, identifying each item. |  [optional] |
|**wpid** | **String** | An alphanumeric product ID, generated by Walmart |  [optional] |
|**index** | **Integer** | index of items in the feed |  [optional] |
|**ingestionStatus** | [**IngestionStatusEnum**](#IngestionStatusEnum) | Can be one of the following: DATA_ERROR, SYSTEM_ERROR, TIMEOUT_ERROR, or INPROGRESS |  |
|**ingestionErrors** | [**ItemDetailsItemIngestionStatusInnerIngestionErrors**](ItemDetailsItemIngestionStatusInnerIngestionErrors.md) |  |  [optional] |



## Enum: IngestionStatusEnum

| Name | Value |
|---- | -----|
| INPROGRESS | &quot;INPROGRESS&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| DATA_ERROR | &quot;DATA_ERROR&quot; |
| SYSTEM_ERROR | &quot;SYSTEM_ERROR&quot; |
| TIMEOUT_ERROR | &quot;TIMEOUT_ERROR&quot; |



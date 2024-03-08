

# PartnerFeedResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;FeedRecordResponseErrorsInner&gt;**](FeedRecordResponseErrorsInner.md) |  |  [optional] |
|**feedId** | **String** | A unique ID used for tracking the Feed File |  [optional] |
|**feedStatus** | [**FeedStatusEnum**](#FeedStatusEnum) | Can be one of the following: RECEIVED, INPROGRESS, PROCESSED, or ERROR |  [optional] |
|**ingestionErrors** | [**ItemDetailsItemIngestionStatusInnerIngestionErrors**](ItemDetailsItemIngestionStatusInnerIngestionErrors.md) |  |  [optional] |
|**itemsReceived** | **Integer** | The number of items received in the feed |  [optional] |
|**itemsSucceeded** | **Integer** | The number of items in the feed that processed successfully |  [optional] |
|**itemsFailed** | **Integer** | The number of items in the feed that failed due to a data or system error |  [optional] |
|**itemsProcessing** | **Integer** | The number of items in the feed that are still processing |  [optional] |
|**offset** | **Integer** | The object response to the starting number, where 0 is the first entity available for request |  [optional] |
|**limit** | **Integer** | The number of items returned. Cannot be greater than 1000. |  [optional] |
|**itemDetails** | [**PartnerFeedResponseItemDetails**](PartnerFeedResponseItemDetails.md) |  |  [optional] |



## Enum: FeedStatusEnum

| Name | Value |
|---- | -----|
| RECEIVED | &quot;RECEIVED&quot; |
| INPROGRESS | &quot;INPROGRESS&quot; |
| PROCESSED | &quot;PROCESSED&quot; |
| ERROR | &quot;ERROR&quot; |




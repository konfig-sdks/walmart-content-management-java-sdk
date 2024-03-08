

# FeedRecordResponseResultsInner

Information about the individual feed

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feedId** | **String** | A unique ID used for tracking the Feed File |  [optional] |
|**feedSource** | **String** | The source of the feed |  [optional] |
|**feedType** | **String** | The feed type |  [optional] |
|**partnerId** | **String** | The seller ID |  [optional] |
|**itemsReceived** | **Long** | The number of items received |  [optional] |
|**itemsSucceeded** | **Long** | The number of items in the feed that have successfully processed |  [optional] |
|**itemsFailed** | **Long** | The number of items in the feed that failed due to a data or system error |  [optional] |
|**itemsProcessing** | **Long** | The number of items in the feed that are still in progress |  [optional] |
|**feedStatus** | **String** | Can be one of the following: RECEIVED, INPROGRESS, PROCESSED, or ERROR. For details, see the definitions listed under &#39;Feed Statuses&#39; at the beginning of this section. |  [optional] |
|**feedDate** | **OffsetDateTime** | The date and time the feed was submitted. Format: yyyymmddThh:mm:ss.xxxz |  [optional] |
|**batchId** | **String** | The batch ID for the feed, if provided |  [optional] |
|**modifiedDtm** | **OffsetDateTime** | The most recent time the feed was modified. Format: yyyymmddThh:mm:ss.xxxz |  [optional] |




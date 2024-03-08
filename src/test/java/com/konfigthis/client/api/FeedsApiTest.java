/*
 * Content Management
 * The content management feed allows you to process content for items in bulk. You can take in content via the content feeds. Use the XSDs to manage content.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.FeedsCreateContentFeedRequest;
import com.konfigthis.client.model.FeedsCreateContentFeedResponse;
import com.konfigthis.client.model.FeedsCreateRichMediaFeedResponse;
import com.konfigthis.client.model.FeedsDisplayItemStatusResponse;
import com.konfigthis.client.model.FeedsGetFeedStatusResponse;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeedsApi
 */
@Disabled
public class FeedsApiTest {

    private static FeedsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FeedsApi(apiClient);
    }

    /**
     * Content feeds
     *
     * You can update 10,000 items at once; updates with more than 10,000 items are not supported. Keep feed sizes below 10 MB to ensure optimal feed processing time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContentFeedTest() throws ApiException {
        String feedType = null;
        String WM_QOS_CORRELATION_ID = null;
        String WM_SVC_NAME = null;
        String WM_SEC_TIMESTAMP = null;
        String WM_SEC_AUTH_SIGNATURE = null;
        String WM_CONSUMER_ID = null;
        File _file = null;
        String WM_CONSUMER_CHANNEL_TYPE = null;
        FeedsCreateContentFeedResponse response = api.createContentFeed(feedType, WM_QOS_CORRELATION_ID, WM_SVC_NAME, WM_SEC_TIMESTAMP, WM_SEC_AUTH_SIGNATURE, WM_CONSUMER_ID, _file)
                .WM_CONSUMER_CHANNEL_TYPE(WM_CONSUMER_CHANNEL_TYPE)
                .execute();
        // TODO: test validations
    }

    /**
     * Rich Media
     *
     * Rich Media includes material such as videos, comparison tables, and view360 media which is item-specific.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRichMediaFeedTest() throws ApiException {
        String feedType = null;
        String WM_QOS_CORRELATION_ID = null;
        String WM_SVC_NAME = null;
        String WM_SEC_TIMESTAMP = null;
        String WM_SEC_AUTH_SIGNATURE = null;
        String WM_CONSUMER_ID = null;
        String WM_CONSUMER_CHANNEL_TYPE = null;
        FeedsCreateRichMediaFeedResponse response = api.createRichMediaFeed(feedType, WM_QOS_CORRELATION_ID, WM_SVC_NAME, WM_SEC_TIMESTAMP, WM_SEC_AUTH_SIGNATURE, WM_CONSUMER_ID)
                .WM_CONSUMER_CHANNEL_TYPE(WM_CONSUMER_CHANNEL_TYPE)
                .execute();
        // TODO: test validations
    }

    /**
     * Feed status
     *
     * You can display an item status for a specific feed ID. Use the feed ID returned from the upload an item feed API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void displayItemStatusTest() throws ApiException {
        String feedId = null;
        String WM_QOS_CORRELATION_ID = null;
        String WM_SVC_NAME = null;
        String WM_SEC_TIMESTAMP = null;
        String WM_SEC_AUTH_SIGNATURE = null;
        String WM_CONSUMER_ID = null;
        String offset = null;
        String limit = null;
        String WM_CONSUMER_CHANNEL_TYPE = null;
        FeedsDisplayItemStatusResponse response = api.displayItemStatus(feedId, WM_QOS_CORRELATION_ID, WM_SVC_NAME, WM_SEC_TIMESTAMP, WM_SEC_AUTH_SIGNATURE, WM_CONSUMER_ID)
                .offset(offset)
                .limit(limit)
                .WM_CONSUMER_CHANNEL_TYPE(WM_CONSUMER_CHANNEL_TYPE)
                .execute();
        // TODO: test validations
    }

    /**
     * Feed item status
     *
     * You can display the status of all items for a specific feed ID. Use the feed ID returned from the upload an item feed API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFeedStatusTest() throws ApiException {
        String feedId = null;
        String WM_QOS_CORRELATION_ID = null;
        String WM_SVC_NAME = null;
        String WM_SEC_TIMESTAMP = null;
        String WM_SEC_AUTH_SIGNATURE = null;
        String WM_CONSUMER_ID = null;
        String includeDetails = null;
        String offset = null;
        String limit = null;
        String WM_CONSUMER_CHANNEL_TYPE = null;
        FeedsGetFeedStatusResponse response = api.getFeedStatus(feedId, WM_QOS_CORRELATION_ID, WM_SVC_NAME, WM_SEC_TIMESTAMP, WM_SEC_AUTH_SIGNATURE, WM_CONSUMER_ID)
                .includeDetails(includeDetails)
                .offset(offset)
                .limit(limit)
                .WM_CONSUMER_CHANNEL_TYPE(WM_CONSUMER_CHANNEL_TYPE)
                .execute();
        // TODO: test validations
    }

}

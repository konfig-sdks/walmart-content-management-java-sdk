package com.konfigthis.client;

import com.konfigthis.client.api.FeedsApi;

public class Walmart {
    private ApiClient apiClient;
    public final FeedsApi feeds;

    public Walmart() {
        this(null);
    }

    public Walmart(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.feeds = new FeedsApi(this.apiClient);
    }

}

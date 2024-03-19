package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://marketplace.walmartapis.com/v3/feeds";
        
        configuration.clientId  = "YOUR API KEY";
        
        configuration.privateKey  = "YOUR API KEY";
        Walmart client = new Walmart(configuration);
        assertNotNull(client);
    }
}

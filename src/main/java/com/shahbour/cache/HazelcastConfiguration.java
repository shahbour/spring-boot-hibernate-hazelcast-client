package com.shahbour.cache;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {

    @Bean
    public HazelcastInstance getHazelcastInstance() {
        ClientConfig config = new ClientConfig();

        config.getNetworkConfig().addAddress("192.168.99.100:30028");

        return HazelcastClient.newHazelcastClient(config);
    }

}

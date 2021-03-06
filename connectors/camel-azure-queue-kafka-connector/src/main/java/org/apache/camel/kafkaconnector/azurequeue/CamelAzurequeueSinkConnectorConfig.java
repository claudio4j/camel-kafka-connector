/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.azurequeue;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzurequeueSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AZUREQUEUE_PATH_CONTAINER_AND_QUEUE_URI_CONF = "camel.sink.path.containerAndQueueUri";
    public static final String CAMEL_SINK_AZUREQUEUE_PATH_CONTAINER_AND_QUEUE_URI_DOC = "Container Queue compact Uri";
    public static final String CAMEL_SINK_AZUREQUEUE_PATH_CONTAINER_AND_QUEUE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_AZURE_QUEUE_CLIENT_CONF = "camel.sink.endpoint.azureQueueClient";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_AZURE_QUEUE_CLIENT_DOC = "The queue service client";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_AZURE_QUEUE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_CONF = "camel.sink.endpoint.credentials";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_DOC = "Set the storage credentials, required in most cases";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_VALIDATE_CLIENT_URICONF = "camel.sink.endpoint.validateClientURI";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_VALIDATE_CLIENT_URIDOC = "Whether to validate the Azure client URI";
    public static final Boolean CAMEL_SINK_AZUREQUEUE_ENDPOINT_VALIDATE_CLIENT_URIDEFAULT = true;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AZUREQUEUE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_TIME_TO_LIVE_CONF = "camel.sink.endpoint.messageTimeToLive";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_TIME_TO_LIVE_DOC = "Message Time To Live in seconds";
    public static final Integer CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_VISIBILITY_DELAY_CONF = "camel.sink.endpoint.messageVisibilityDelay";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_VISIBILITY_DELAY_DOC = "Message Visibility Delay in seconds";
    public static final Integer CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_VISIBILITY_DELAY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_OPERATION_DOC = "Queue service operation hint to the producer One of: [listQueues] [createQueue] [deleteQueue] [addMessage] [retrieveMessage] [peekMessage] [updateMessage] [deleteMessage]";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_OPERATION_DEFAULT = "listQueues";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_QUEUE_PREFIX_CONF = "camel.sink.endpoint.queuePrefix";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_QUEUE_PREFIX_DOC = "Set a prefix which can be used for listing the queues";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_QUEUE_PREFIX_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AZUREQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_CONF = "camel.sink.endpoint.credentialsAccountKey";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DOC = "Set the storage account key used during authentication phase";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_CONF = "camel.sink.endpoint.credentialsAccountName";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DOC = "Set the storage account name used during authentication phase";
    public static final String CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_AZURE_QUEUE_CLIENT_CONF = "camel.component.azure-queue.azureQueueClient";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_AZURE_QUEUE_CLIENT_DOC = "The queue service client";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_AZURE_QUEUE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_CONF = "camel.component.azure-queue.credentials";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_DOC = "Set the storage credentials, required in most cases";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_VALIDATE_CLIENT_URICONF = "camel.component.azure-queue.validateClientURI";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_VALIDATE_CLIENT_URIDOC = "Whether to validate the Azure client URI";
    public static final Boolean CAMEL_SINK_AZUREQUEUE_COMPONENT_VALIDATE_CLIENT_URIDEFAULT = true;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.azure-queue.lazyStartProducer";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AZUREQUEUE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_TIME_TO_LIVE_CONF = "camel.component.azure-queue.messageTimeToLive";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_TIME_TO_LIVE_DOC = "Message Time To Live in seconds";
    public static final Integer CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_VISIBILITY_DELAY_CONF = "camel.component.azure-queue.messageVisibilityDelay";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_VISIBILITY_DELAY_DOC = "Message Visibility Delay in seconds";
    public static final Integer CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_VISIBILITY_DELAY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_OPERATION_CONF = "camel.component.azure-queue.operation";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_OPERATION_DOC = "Queue service operation hint to the producer One of: [listQueues] [createQueue] [deleteQueue] [addMessage] [retrieveMessage] [peekMessage] [updateMessage] [deleteMessage]";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_OPERATION_DEFAULT = "listQueues";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_QUEUE_PREFIX_CONF = "camel.component.azure-queue.queuePrefix";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_QUEUE_PREFIX_DOC = "Set a prefix which can be used for listing the queues";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_QUEUE_PREFIX_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.azure-queue.autowiredEnabled";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_AZUREQUEUE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CONFIGURATION_CONF = "camel.component.azure-queue.configuration";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CONFIGURATION_DOC = "The Queue Service configuration";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_KEY_CONF = "camel.component.azure-queue.credentialsAccountKey";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DOC = "Set the storage account key used during authentication phase";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_NAME_CONF = "camel.component.azure-queue.credentialsAccountName";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DOC = "Set the storage account name used during authentication phase";
    public static final String CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DEFAULT = null;

    public CamelAzurequeueSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzurequeueSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AZUREQUEUE_PATH_CONTAINER_AND_QUEUE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_PATH_CONTAINER_AND_QUEUE_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AZUREQUEUE_PATH_CONTAINER_AND_QUEUE_URI_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_AZURE_QUEUE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_ENDPOINT_AZURE_QUEUE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_AZURE_QUEUE_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_VALIDATE_CLIENT_URICONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREQUEUE_ENDPOINT_VALIDATE_CLIENT_URIDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_VALIDATE_CLIENT_URIDOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREQUEUE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_TIME_TO_LIVE_CONF, ConfigDef.Type.INT, CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_VISIBILITY_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_VISIBILITY_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_MESSAGE_VISIBILITY_DELAY_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_QUEUE_PREFIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_ENDPOINT_QUEUE_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_QUEUE_PREFIX_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_AZURE_QUEUE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_COMPONENT_AZURE_QUEUE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_AZURE_QUEUE_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_VALIDATE_CLIENT_URICONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREQUEUE_COMPONENT_VALIDATE_CLIENT_URIDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_VALIDATE_CLIENT_URIDOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREQUEUE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_TIME_TO_LIVE_CONF, ConfigDef.Type.INT, CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_VISIBILITY_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_VISIBILITY_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_MESSAGE_VISIBILITY_DELAY_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_QUEUE_PREFIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_COMPONENT_QUEUE_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_QUEUE_PREFIX_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREQUEUE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREQUEUE_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DOC);
        return conf;
    }
}
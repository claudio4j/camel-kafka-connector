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
package org.apache.camel.kafkaconnector.springldap;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSpringldapSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SPRINGLDAP_PATH_TEMPLATE_NAME_CONF = "camel.sink.path.templateName";
    public static final String CAMEL_SINK_SPRINGLDAP_PATH_TEMPLATE_NAME_DOC = "Name of the Spring LDAP Template bean";
    public static final String CAMEL_SINK_SPRINGLDAP_PATH_TEMPLATE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SPRINGLDAP_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_OPERATION_DOC = "The LDAP operation to be performed. One of: [SEARCH] [BIND] [UNBIND] [AUTHENTICATE] [MODIFY_ATTRIBUTES] [FUNCTION_DRIVEN]";
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_SCOPE_CONF = "camel.sink.endpoint.scope";
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_SCOPE_DOC = "The scope of the search operation. One of: [object] [onelevel] [subtree]";
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_SCOPE_DEFAULT = "subtree";
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_SPRINGLDAP_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_SPRINGLDAP_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_SPRINGLDAP_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.spring-ldap.lazyStartProducer";
    public static final String CAMEL_SINK_SPRINGLDAP_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SPRINGLDAP_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SPRINGLDAP_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.spring-ldap.autowiredEnabled";
    public static final String CAMEL_SINK_SPRINGLDAP_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_SPRINGLDAP_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelSpringldapSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSpringldapSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SPRINGLDAP_PATH_TEMPLATE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPRINGLDAP_PATH_TEMPLATE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SPRINGLDAP_PATH_TEMPLATE_NAME_DOC);
        conf.define(CAMEL_SINK_SPRINGLDAP_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPRINGLDAP_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPRINGLDAP_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SPRINGLDAP_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPRINGLDAP_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SPRINGLDAP_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_SPRINGLDAP_ENDPOINT_SCOPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPRINGLDAP_ENDPOINT_SCOPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPRINGLDAP_ENDPOINT_SCOPE_DOC);
        conf.define(CAMEL_SINK_SPRINGLDAP_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPRINGLDAP_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPRINGLDAP_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_SPRINGLDAP_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPRINGLDAP_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPRINGLDAP_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SPRINGLDAP_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPRINGLDAP_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPRINGLDAP_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}
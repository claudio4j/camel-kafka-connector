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
package org.apache.camel.kafkaconnector.openshiftbuilds;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelOpenshiftbuildsSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_OPENSHIFTBUILDS_PATH_MASTER_URL_CONF = "camel.sink.path.masterUrl";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_PATH_MASTER_URL_DOC = "Kubernetes Master url";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_PATH_MASTER_URL_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_API_VERSION_CONF = "camel.sink.endpoint.apiVersion";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_API_VERSION_DOC = "The Kubernetes API Version to use";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_API_VERSION_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_DNS_DOMAIN_CONF = "camel.sink.endpoint.dnsDomain";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_DNS_DOMAIN_DOC = "The dns domain, used for ServiceCall EIP";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_DNS_DOMAIN_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_KUBERNETES_CLIENT_CONF = "camel.sink.endpoint.kubernetesClient";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_KUBERNETES_CLIENT_DOC = "Default KubernetesClient to use if provided";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_KUBERNETES_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OPERATION_DOC = "Producer operation to do on Kubernetes";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_NAME_CONF = "camel.sink.endpoint.portName";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_NAME_DOC = "The port name, used for ServiceCall EIP";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_PROTOCOL_CONF = "camel.sink.endpoint.portProtocol";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_PROTOCOL_DOC = "The port protocol, used for ServiceCall EIP";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_PROTOCOL_DEFAULT = "tcp";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.sink.endpoint.connectionTimeout";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CONNECTION_TIMEOUT_DOC = "Connection timeout in milliseconds to use when making requests to the Kubernetes API server.";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_DATA_CONF = "camel.sink.endpoint.caCertData";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_DATA_DOC = "The CA Cert Data";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_DATA_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_FILE_CONF = "camel.sink.endpoint.caCertFile";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_FILE_DOC = "The CA Cert File";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_DATA_CONF = "camel.sink.endpoint.clientCertData";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_DATA_DOC = "The Client Cert Data";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_DATA_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_FILE_CONF = "camel.sink.endpoint.clientCertFile";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_FILE_DOC = "The Client Cert File";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_ALGO_CONF = "camel.sink.endpoint.clientKeyAlgo";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_ALGO_DOC = "The Key Algorithm used by the client";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_ALGO_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_DATA_CONF = "camel.sink.endpoint.clientKeyData";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_DATA_DOC = "The Client Key data";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_DATA_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_FILE_CONF = "camel.sink.endpoint.clientKeyFile";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_FILE_DOC = "The Client Key file";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_PASSPHRASE_CONF = "camel.sink.endpoint.clientKeyPassphrase";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_PASSPHRASE_DOC = "The Client Key Passphrase";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_PASSPHRASE_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OAUTH_TOKEN_CONF = "camel.sink.endpoint.oauthToken";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OAUTH_TOKEN_DOC = "The Auth Token";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OAUTH_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PASSWORD_DOC = "Password to connect to Kubernetes";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_TRUST_CERTS_CONF = "camel.sink.endpoint.trustCerts";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_TRUST_CERTS_DOC = "Define if the certs we used are trusted anyway or not";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_TRUST_CERTS_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_USERNAME_DOC = "Username to connect to Kubernetes";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.openshift-builds.lazyStartProducer";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.openshift-builds.autowiredEnabled";
    public static final String CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelOpenshiftbuildsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelOpenshiftbuildsSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_PATH_MASTER_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_PATH_MASTER_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_OPENSHIFTBUILDS_PATH_MASTER_URL_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_API_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_API_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_API_VERSION_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_DNS_DOMAIN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_DNS_DOMAIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_DNS_DOMAIN_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_KUBERNETES_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_KUBERNETES_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_KUBERNETES_CLIENT_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_NAME_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PORT_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_DATA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_DATA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_DATA_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CA_CERT_FILE_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_DATA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_DATA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_DATA_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_CERT_FILE_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_ALGO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_ALGO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_ALGO_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_DATA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_DATA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_DATA_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_FILE_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_PASSPHRASE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_PASSPHRASE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_CLIENT_KEY_PASSPHRASE_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OAUTH_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OAUTH_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_OAUTH_TOKEN_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_TRUST_CERTS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_TRUST_CERTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_TRUST_CERTS_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSHIFTBUILDS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}
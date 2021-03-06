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
package org.apache.camel.kafkaconnector.minio;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMinioSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_MINIO_PATH_BUCKET_NAME_CONF = "camel.sink.path.bucketName";
    public static final String CAMEL_SINK_MINIO_PATH_BUCKET_NAME_DOC = "Bucket name";
    public static final String CAMEL_SINK_MINIO_PATH_BUCKET_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_AUTO_CREATE_BUCKET_CONF = "camel.sink.endpoint.autoCreateBucket";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the bucket if bucket name not exist.";
    public static final Boolean CAMEL_SINK_MINIO_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT = true;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_CUSTOM_HTTP_CLIENT_CONF = "camel.sink.endpoint.customHttpClient";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_CUSTOM_HTTP_CLIENT_DOC = "Set custom HTTP client for authenticated access.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_CUSTOM_HTTP_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_ENDPOINT_CONF = "camel.sink.endpoint.endpoint";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_ENDPOINT_DOC = "Endpoint can be an URL, domain name, IPv4 address or IPv6 address.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_MINIO_CLIENT_CONF = "camel.sink.endpoint.minioClient";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_MINIO_CLIENT_DOC = "Reference to a Minio Client object in the registry.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_MINIO_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_OBJECT_LOCK_CONF = "camel.sink.endpoint.objectLock";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_OBJECT_LOCK_DOC = "Set when creating new bucket.";
    public static final Boolean CAMEL_SINK_MINIO_ENDPOINT_OBJECT_LOCK_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_POLICY_CONF = "camel.sink.endpoint.policy";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_POLICY_DOC = "The policy for this queue to set in the method.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_PROXY_PORT_DOC = "TCP/IP port number. 80 and 443 are used as defaults for HTTP and HTTPS.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_REGION_DOC = "The region in which Minio client needs to work. When using this parameter, the configuration will expect the lowercase name of the region (for example ap-east-1). You'll need to use the name Region.EU_WEST_1.id()";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SECURE_CONF = "camel.sink.endpoint.secure";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SECURE_DOC = "Flag to indicate to use secure connection to minio service or not.";
    public static final Boolean CAMEL_SINK_MINIO_ENDPOINT_SECURE_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CONF = "camel.sink.endpoint.serverSideEncryption";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_DOC = "Server-side encryption.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_CONF = "camel.sink.endpoint.serverSideEncryptionCustomerKey";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DOC = "Server-side encryption for source object while copy/move objects.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_DELETE_AFTER_WRITE_CONF = "camel.sink.endpoint.deleteAfterWrite";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_DELETE_AFTER_WRITE_DOC = "Delete file object after the Minio file has been uploaded.";
    public static final Boolean CAMEL_SINK_MINIO_ENDPOINT_DELETE_AFTER_WRITE_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_KEY_NAME_CONF = "camel.sink.endpoint.keyName";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_KEY_NAME_DOC = "Setting the key name for an element in the bucket through endpoint parameter.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_KEY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MINIO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_OPERATION_DOC = "The operation to do in case the user don't want to do only an upload. One of: [copyObject] [listObjects] [deleteObject] [deleteObjects] [deleteBucket] [listBuckets] [getObject] [getObjectRange]";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_POJO_REQUEST_CONF = "camel.sink.endpoint.pojoRequest";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_POJO_REQUEST_DOC = "If we want to use a POJO request as body or not.";
    public static final Boolean CAMEL_SINK_MINIO_ENDPOINT_POJO_REQUEST_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_STORAGE_CLASS_CONF = "camel.sink.endpoint.storageClass";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_STORAGE_CLASS_DOC = "The storage class to set in the request.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_STORAGE_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Secret Access Key or Minio Access Key. If not set camel will connect to service for anonymous access.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Access Key Id or Minio Secret Key. If not set camel will connect to service for anonymous access.";
    public static final String CAMEL_SINK_MINIO_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_AUTO_CREATE_BUCKET_CONF = "camel.component.minio.autoCreateBucket";
    public static final String CAMEL_SINK_MINIO_COMPONENT_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the bucket if bucket name not exist.";
    public static final Boolean CAMEL_SINK_MINIO_COMPONENT_AUTO_CREATE_BUCKET_DEFAULT = true;
    public static final String CAMEL_SINK_MINIO_COMPONENT_CONFIGURATION_CONF = "camel.component.minio.configuration";
    public static final String CAMEL_SINK_MINIO_COMPONENT_CONFIGURATION_DOC = "The component configuration";
    public static final String CAMEL_SINK_MINIO_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_CUSTOM_HTTP_CLIENT_CONF = "camel.component.minio.customHttpClient";
    public static final String CAMEL_SINK_MINIO_COMPONENT_CUSTOM_HTTP_CLIENT_DOC = "Set custom HTTP client for authenticated access.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_CUSTOM_HTTP_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_ENDPOINT_CONF = "camel.component.minio.endpoint";
    public static final String CAMEL_SINK_MINIO_COMPONENT_ENDPOINT_DOC = "Endpoint can be an URL, domain name, IPv4 address or IPv6 address.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_MINIO_CLIENT_CONF = "camel.component.minio.minioClient";
    public static final String CAMEL_SINK_MINIO_COMPONENT_MINIO_CLIENT_DOC = "Reference to a Minio Client object in the registry.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_MINIO_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_OBJECT_LOCK_CONF = "camel.component.minio.objectLock";
    public static final String CAMEL_SINK_MINIO_COMPONENT_OBJECT_LOCK_DOC = "Set when creating new bucket.";
    public static final Boolean CAMEL_SINK_MINIO_COMPONENT_OBJECT_LOCK_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_COMPONENT_POLICY_CONF = "camel.component.minio.policy";
    public static final String CAMEL_SINK_MINIO_COMPONENT_POLICY_DOC = "The policy for this queue to set in the method.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_PROXY_PORT_CONF = "camel.component.minio.proxyPort";
    public static final String CAMEL_SINK_MINIO_COMPONENT_PROXY_PORT_DOC = "TCP/IP port number. 80 and 443 are used as defaults for HTTP and HTTPS.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_REGION_CONF = "camel.component.minio.region";
    public static final String CAMEL_SINK_MINIO_COMPONENT_REGION_DOC = "The region in which Minio client needs to work. When using this parameter, the configuration will expect the lowercase name of the region (for example ap-east-1). You'll need to use the name Region.EU_WEST_1.id()";
    public static final String CAMEL_SINK_MINIO_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_SECURE_CONF = "camel.component.minio.secure";
    public static final String CAMEL_SINK_MINIO_COMPONENT_SECURE_DOC = "Flag to indicate to use secure connection to minio service or not.";
    public static final Boolean CAMEL_SINK_MINIO_COMPONENT_SECURE_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CONF = "camel.component.minio.serverSideEncryption";
    public static final String CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_DOC = "Server-side encryption.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_CONF = "camel.component.minio.serverSideEncryptionCustomerKey";
    public static final String CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DOC = "Server-side encryption for source object while copy/move objects.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_DELETE_AFTER_WRITE_CONF = "camel.component.minio.deleteAfterWrite";
    public static final String CAMEL_SINK_MINIO_COMPONENT_DELETE_AFTER_WRITE_DOC = "Delete file object after the Minio file has been uploaded.";
    public static final Boolean CAMEL_SINK_MINIO_COMPONENT_DELETE_AFTER_WRITE_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_COMPONENT_KEY_NAME_CONF = "camel.component.minio.keyName";
    public static final String CAMEL_SINK_MINIO_COMPONENT_KEY_NAME_DOC = "Setting the key name for an element in the bucket through endpoint parameter.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_KEY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.minio.lazyStartProducer";
    public static final String CAMEL_SINK_MINIO_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MINIO_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_COMPONENT_OPERATION_CONF = "camel.component.minio.operation";
    public static final String CAMEL_SINK_MINIO_COMPONENT_OPERATION_DOC = "The operation to do in case the user don't want to do only an upload. One of: [copyObject] [listObjects] [deleteObject] [deleteObjects] [deleteBucket] [listBuckets] [getObject] [getObjectRange]";
    public static final String CAMEL_SINK_MINIO_COMPONENT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_POJO_REQUEST_CONF = "camel.component.minio.pojoRequest";
    public static final String CAMEL_SINK_MINIO_COMPONENT_POJO_REQUEST_DOC = "If we want to use a POJO request as body or not.";
    public static final Boolean CAMEL_SINK_MINIO_COMPONENT_POJO_REQUEST_DEFAULT = false;
    public static final String CAMEL_SINK_MINIO_COMPONENT_STORAGE_CLASS_CONF = "camel.component.minio.storageClass";
    public static final String CAMEL_SINK_MINIO_COMPONENT_STORAGE_CLASS_DOC = "The storage class to set in the request.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_STORAGE_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.minio.autowiredEnabled";
    public static final String CAMEL_SINK_MINIO_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_MINIO_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_MINIO_COMPONENT_ACCESS_KEY_CONF = "camel.component.minio.accessKey";
    public static final String CAMEL_SINK_MINIO_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Secret Access Key or Minio Access Key. If not set camel will connect to service for anonymous access.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIO_COMPONENT_SECRET_KEY_CONF = "camel.component.minio.secretKey";
    public static final String CAMEL_SINK_MINIO_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Access Key Id or Minio Secret Key. If not set camel will connect to service for anonymous access.";
    public static final String CAMEL_SINK_MINIO_COMPONENT_SECRET_KEY_DEFAULT = null;

    public CamelMinioSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMinioSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_MINIO_PATH_BUCKET_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_PATH_BUCKET_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MINIO_PATH_BUCKET_NAME_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_CUSTOM_HTTP_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_CUSTOM_HTTP_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_CUSTOM_HTTP_CLIENT_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_MINIO_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_MINIO_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_MINIO_CLIENT_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_OBJECT_LOCK_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_ENDPOINT_OBJECT_LOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_OBJECT_LOCK_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_POLICY_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_SECURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_ENDPOINT_SECURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_SECURE_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_DELETE_AFTER_WRITE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_ENDPOINT_DELETE_AFTER_WRITE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_DELETE_AFTER_WRITE_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_KEY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_KEY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_KEY_NAME_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_POJO_REQUEST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_ENDPOINT_POJO_REQUEST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_POJO_REQUEST_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_STORAGE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_ENDPOINT_STORAGE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_STORAGE_CLASS_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MINIO_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_MINIO_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MINIO_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_COMPONENT_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_CUSTOM_HTTP_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_CUSTOM_HTTP_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_CUSTOM_HTTP_CLIENT_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_MINIO_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_MINIO_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_MINIO_CLIENT_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_OBJECT_LOCK_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_COMPONENT_OBJECT_LOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_OBJECT_LOCK_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_POLICY_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_SECURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_COMPONENT_SECURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_SECURE_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_DELETE_AFTER_WRITE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_COMPONENT_DELETE_AFTER_WRITE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_DELETE_AFTER_WRITE_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_KEY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_KEY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_KEY_NAME_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_POJO_REQUEST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_COMPONENT_POJO_REQUEST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_POJO_REQUEST_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_STORAGE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIO_COMPONENT_STORAGE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_STORAGE_CLASS_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIO_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MINIO_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_MINIO_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MINIO_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIO_COMPONENT_SECRET_KEY_DOC);
        return conf;
    }
}
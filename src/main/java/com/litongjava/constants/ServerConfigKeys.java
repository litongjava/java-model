package com.litongjava.constants;

public interface ServerConfigKeys {
  // file
  String DEFAULT_CONFIG_FILE_NAME = "app.properties";

  // server
  String SERVER_DEV_MODE = "server.dev.mode";
  String SERVER_LISTENING_ENABLE = "server.listening.enable";
  String SERVER_ADDRESS = "server.address";
  String SERVER_PORT = "server.port";
  String SERVER_CONTEXT_PATH = "server.context-path";
  String SERVER_404 = "server.404";
  String SERVER_500 = "server.500";
  String SERVER_RATE_LIMIT_ENEABLE = "server.rate.limit.enable";
  String SERVER_SSL_ENEABLE = "server.ssl.enable";
  String SERVER_SSL_PORT = "server.ssl.port";
  String SERVER_SSL_KEY_FILE = "server.ssl.key.file";
  String SERVER_SSL_KEY_CERT_CHAIN_FILE = "server.ssl.key.cert.chain.file";
  String SERVER_SSL_KEY_PASSWORD = "server.ssl.key.password";

  String SERVER_STAT_ENABLE = "server.stat.enable";
  String SERVER_HTTP_REQUEST_PRINT_PACKET = "server.http.request.printPacket";
  String SERVER_HTTP_REQUEST_PRINT_URL = "server.http.request.printUrl";
  String SERVER_HTTP_CONTROLLER_PRINTMAPPING = "server.http.controller.printMapping";
  String SERVER_HTTP_CONTROLLER_WRITEMAPPING = "server.http.controller.writeMapping";
  String SERVER_HTTP_REQUEST_PRINTREPORT = "server.http.request.printReport";

  String SERVER_HTTP_RESPONSE_CORS_ENABLE = "server.http.response.cors.enable";

  String SERVER_SESSION_ENABLE = "server.session.enable";
  String SERVER_RESOURCES_STATIC_LOCATIONS = "server.resources.static-locations";
  String SERVER_RESOURCES_STATIC_FILE_CACHE_ENABLE = "server.resources.static.file.cache.enable";

  // unit millis
  String SERVER_HEARTBEAT_TIMEOUT = "server.beartbeat.timeout";
  String SERVER_READ_BUFFER_SIZE = "server.read.buffer.size";

  // http
  String HTTP_MAX_LIVE_TIME_OF_STATIC_RES = "http.max.live.time.of.static.res";
  String HTTP_CHECK_HOST = "http.checkHost";
  String HTTP_MULTIPART_MAX_REQUEST_SIZE = "http.multipart.max-request-size";
  String HTTP_MULTIPART_MAX_FILE_SIZE = "http.multipart.max-file-size";

  String HTTP_ENABLE_REQUEST_LIMIT = "http.enable.request.limit";
  String HTTP_MAX_REQUESTS_PER_SECOND = "http.max.requests.per.second";

  // app
  String APP_ENV = "app.env";
  String APP_NAME = "app.name";

  // jdbc
  String DATABASE_DSN = "DATABASE_DSN";
  String DATABASE_DSN_MAIN = "DATABASE_DSN_MAIN";
  String DATABASE_DSN_REPLICAS = "DATABASE_DSN_REPLICAS";

  String JDBC_URL = "jdbc.url";
  String JDBC_USER = "jdbc.user";
  String JDBC_PSWD = "jdbc.pswd";
  String JDBC_SHOW_SQL = "jdbc.showSql";

  // redis
  String REDIS_URL = "REDIS_URL";
  String REDIS_HOST = "redis.host";
  String REDIS_PORT = "redis.port";
  String REDIS_PASSWORD = "redis.password";
  String REDIS_TIMEOUT = "redis.timeout";
  String REDIS_DATABASE = "redis.database";

  // elastic
  String ELASTICSEARCH_DSN = "ELASTICSEARCH_DSN";

  // zookeeper
  String ZOOKEEPER_URL = "ZOOKEEPER_URL";

  // aop
  String AOP_PRINT_SCANNED_CLASSES = "aop.print.scanned.classes";

}

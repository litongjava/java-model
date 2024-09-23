package com.litongjava.constatns;

public interface ServerConfigKeys {
  // server
  String DEFAULT_CONFIG_FILE_NAME = "app.properties";
  String SERVER_ADDRESS = "server.address";
  String SERVER_PORT = "server.port";
  String SERVER_CONTEXT_PATH = "server.context-path";
  String SERVER_404 = "server.404";
  String SERVER_500 = "server.500";
  String SERVER_RESOURCES_STATIC_LOCATIONS = "server.resources.static-locations";
  // unit millis
  String SERVER_BEARTBEAT_TIMEOUT = "server.beartbeat.timeout";
  String SERVER_READ_BUFFER_SIZE = "server.read.buffer.size";
  String SERVER_RESPONSE_CORS_ENABLED = "server.response.cors.enabled";

  // http
  String HTTP_MAX_LIVE_TIME_OF_STATIC_RES = "http.max.live.time.of.static.res";
  String HTTP_CHECK_HOST = "http.checkHost";
  String HTTP_MULTIPART_MAX_REQUEST_SIZE = "http.multipart.max-request-size";
  String HTTP_MULTIPART_MAX_FILE_ZIZE = "http.multipart.max-file-size";
  String HTTP_ENABLE_SESSION = "http.enable.session";
  String HTTP_ENABLE_REQUEST_LIMIT = "http.enable.request.limit";
  String HTTP_MAX_REQUESTS_PER_SECOND = "http.max.requests.per.second";

  // server
  String SERVER_DEV_MODE = "server.dev.mode";
  String SERVER_LISTENING_ENABLE = "server.listening.enable";
  String SERVER_HTTP_REQUEST_PRINT_URL = "server.http.request.printUrl";
  String SERVER_HTTP_CONTROLLER_PRINTMAPPING = "server.http.controller.printMapping";
  String SERVER_HTTP_CONTROLLER_WRITEMAPPING = "server.http.controller.writeMapping";
  String SERVER_HTTP_REQUEST_PRINTREPORT = "server.http.request.printReport";

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
  String REDIS_DATABASE = "redis.database";
  // elastic
  String ELASTICSEARCH_DSN = "ELASTICSEARCH_DSN";

  // zookeeper
  String ZOOKEEPER_URL = "ZOOKEEPER_URL";

  // aop
  String AOP_PRINT_SCANNED_CLASSSES = "aop.print.scanned.classes";

}

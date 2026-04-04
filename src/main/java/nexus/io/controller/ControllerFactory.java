package nexus.io.controller;

public interface ControllerFactory {

  /**
   * 
   * @param controllerClazz Controller的class
   * @return
   * @throws Exception 
   */
  Object getInstance(Class<?> controllerClazz) throws Exception;
}

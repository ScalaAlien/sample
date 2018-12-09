// @GENERATOR:play-routes-compiler
// @SOURCE:C:/tools/cygwin/home/Kosuke/sources/sample/conf/routes
// @DATE:Sun Dec 09 23:04:33 JST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseBeaconController BeaconController = new controllers.ReverseBeaconController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseBeaconController BeaconController = new controllers.javascript.ReverseBeaconController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}

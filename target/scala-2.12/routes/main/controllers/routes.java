// @GENERATOR:play-routes-compiler
// @SOURCE:C:/tools/cygwin/home/Kosuke/sources/sample/conf/routes
// @DATE:Mon Nov 19 23:57:16 JST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseBeaconController BeaconController = new controllers.ReverseBeaconController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseBeaconController BeaconController = new controllers.javascript.ReverseBeaconController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
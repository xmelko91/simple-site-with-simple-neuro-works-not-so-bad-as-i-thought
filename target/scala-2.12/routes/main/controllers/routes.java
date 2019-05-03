// @GENERATOR:play-routes-compiler
// @SOURCE:/home/serge/projexts/neurosite/conf/routes
// @DATE:Tue Apr 30 17:20:13 MSK 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversegetDirection getDirection = new controllers.ReversegetDirection(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversegetArr getArr = new controllers.ReversegetArr(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversegetDirection getDirection = new controllers.javascript.ReversegetDirection(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversegetArr getArr = new controllers.javascript.ReversegetArr(RoutesPrefix.byNamePrefix());
  }

}

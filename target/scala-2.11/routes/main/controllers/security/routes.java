
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab5 Shopping cart/conf/routes
// @DATE:Tue Feb 07 11:34:17 GMT 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginCtrl LoginCtrl = new controllers.security.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginCtrl LoginCtrl = new controllers.security.javascript.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());
  }

}

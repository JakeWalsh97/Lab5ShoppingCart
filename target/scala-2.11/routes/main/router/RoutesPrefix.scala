
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab5 Shopping cart/conf/routes
// @DATE:Tue Feb 07 11:34:17 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

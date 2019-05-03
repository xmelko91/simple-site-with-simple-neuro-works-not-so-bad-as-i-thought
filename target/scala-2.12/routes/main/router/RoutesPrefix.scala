// @GENERATOR:play-routes-compiler
// @SOURCE:/home/serge/projexts/neurosite/conf/routes
// @DATE:Tue Apr 30 17:20:13 MSK 2019


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

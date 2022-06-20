// @GENERATOR:play-routes-compiler
// @SOURCE:/home/tushar/Desktop/xenon/rest-api-hr-mangenment/conf/routes
// @DATE:Mon Jun 20 07:01:03 IST 2022


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

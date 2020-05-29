import py4j.GatewayServer

object Main extends App {
  println("Hello, World!")
  PythonGatewayServer
  println("Second")
  Thread.sleep(30)
}

class Registery {
  private var list = List.empty[String]

  def register(item: String) = {
    this.list = item :: list
  }
}

object PythonGatewayServer {
  val gatewayServer: GatewayServer = new GatewayServer(null)
  gatewayServer.start()
  val boundPort: Int = gatewayServer.getListeningPort
    if (boundPort == -1) {
      println("GatewayServer failed to bind; exiting")
      System.exit(1)
    } else {
      println(s"Started PythonGatewayServer on port $boundPort")
    }
}




// object PythonPy4JUtil {

//     def createGatewayServer(port: Int, entryPoint: Any, authToken: String,
//       trustedPreCommandHooks: Seq[Runnable],
//      pinnedThreadMode: Boolean) : GatewayServer = {

//     if (pinnedThreadMode) {
//       throw new UnsupportedOperationException("Py4J pinned mode is not supported in this version")
//     } else {
//       println("Using default multithreaded mode in Py4J")
//       new py4j.GatewayServer.GatewayServerBuilder()
//         .javaPort(port)
//         .entryPoint(entryPoint)
//         .authToken(authToken)
//         // .securityManager(securityManager)
//         // .trustedPreCommandHooks(trustedPreCommandHooks.toList.asJava)
//         .build()
//     }
//   }

  // def createGatewayServer(port: Int, entryPoint: Any, authToken: String,
  //   securityManager: Py4JSecurityManager, trustedPreCommandHooks: Seq[Runnable],
  //   pinnedThreadMode: Boolean) : GatewayServer = {

  //   if (pinnedThreadMode) {
  //     throw new UnsupportedOperationException("Py4J pinned mode is not supported in this version")
  //   } else {
  //     logInfo("Using default multithreaded mode in Py4J")
  //     new py4j.GatewayServer.GatewayServerBuilder()
  //       .javaPort(port)
  //       .entryPoint(entryPoint)
  //       .authToken(authToken)
  //       .securityManager(securityManager)
  //       .trustedPreCommandHooks(trustedPreCommandHooks.toList.asJava)
  //       .build()
  //   }
  // }
// }

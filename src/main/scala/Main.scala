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

## Basic Usage
Execute `sbt run` to start the scala program and the jvm
Make note of the port printed to stdout by the scala program
In an ipython shell run the follwing commands:
```python
from py4j.java_gateway import JavaGateway, GatewayParameters

def makeGateway(port):
    return JavaGateway(gateway_parameters=GatewayParameters(port=port))

gateway = makeGateway(port_number)
random = gateway.jvm.java.util.Random()
print(random)
```

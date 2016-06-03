package ExplicitTypedSelfReferences.Graph

/**
  * Created by scuanieg on 6/3/2016.
  */
object GraphTest  extends App {
  val g: Graph = new ConcreteDirectedGraph
  val n1 = g.addNode
  val n2 = g.addNode
  val n3 = g.addNode
  n1.connectWith(n2)
  n2.connectWith(n3)
  n1.connectWith(n3)

}

package ExplicitTypedSelfReferences.Graph

/**
  * Created by scuanieg on 6/3/2016.
  */
class ConcreteDirectedGraph extends DirectedGraph {
  type Edge = EdgeImpl
  type Node = NodeImpl

  protected def newNode: Node = new NodeImpl

  protected def newEdge(f: Node, t: Node): Edge =
    new EdgeImpl(f, t)
}

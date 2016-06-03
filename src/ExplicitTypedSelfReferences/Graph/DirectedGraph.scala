package ExplicitTypedSelfReferences.Graph

/**
  * Created by scuanieg on 6/3/2016.
  */
abstract class DirectedGraph extends Graph {
  type Edge <: EdgeImpl
  class EdgeImpl(origin: Node, dest: Node) {
    def from = origin
    def to = dest
  }
  class NodeImpl extends NodeIntf {
    self: Node =>
    def connectWith(node: Node): Edge = {
      val edge = newEdge(this, node)
      edges = edge :: edges
      edge
    }
  }
  protected def newNode: Node
  protected def newEdge(from: Node, to: Node): Edge
  var nodes: List[Node] = Nil
  var edges: List[Edge] = Nil
  def addNode: Node = {
    val node = newNode
    nodes = node :: nodes
    node
  }
}


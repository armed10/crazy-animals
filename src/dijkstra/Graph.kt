package dijkstra

import java.util.HashSet

class Graph {

    private var nodes: MutableSet<Node> = HashSet()

    fun addNode(nodeA: Node) {
        nodes.add(nodeA)
    }

    fun getNodes(): Set<Node> {
        return nodes
    }

    fun setNodes(nodes: MutableSet<Node>) {
        this.nodes = nodes
    }
}
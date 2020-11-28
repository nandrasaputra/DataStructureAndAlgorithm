class MyGraph {
    private val listOfNodes = mutableListOf<GraphNode>()
    private val listOfEdges = mutableListOf<GraphEdge>()

    fun insertEdges(nodeFromValue: Int, nodeToValue: Int, edgeValue: Int) {
        var nodeFromFound: GraphNode? = null
        var nodeToFound: GraphNode? = null

        for (currentNode in listOfNodes) {
            if (nodeFromFound != null && nodeToFound != null) break

            if (nodeFromFound == null) {
                if (currentNode.value == nodeFromValue) {
                    nodeFromFound = currentNode
                }
            }

            if (nodeToFound == null) {
                if (currentNode.value == nodeToValue) {
                    nodeToFound = currentNode
                }
            }
        }

        if (nodeFromFound == null) {
            nodeFromFound = GraphNode(nodeFromValue)
            listOfNodes.add(nodeFromFound)
        }

        if (nodeToFound == null) {
            nodeToFound = GraphNode(nodeToValue)
            listOfNodes.add(nodeToFound)
        }

        val newEdge = GraphEdge(edgeValue, nodeFromFound, nodeToFound)
        nodeFromFound.edgeList.add(newEdge)
        nodeToFound.edgeList.add(newEdge)
        listOfEdges.add(newEdge)
    }

    fun getEdgeList() : List<GraphEdge> {
        return listOfEdges
    }

    fun getAdjacencyArray() : Array<MutableList<GraphNode>> {
        val arraySize = findArrayMaxIndexFromEdges() + 1
        val resultArray = Array(arraySize) { mutableListOf<GraphNode>() }
        listOfEdges.forEach { edge ->
            resultArray[edge.fromNode.value].add(edge.toNode)
        }
        return resultArray
    }

    fun getAdjacencyMatrix() : Array<IntArray> {
        val arraySize = findArrayMaxIndexFromEdges() + 1
        val matrix = Array(arraySize) { IntArray(arraySize) {0} }
        listOfEdges.forEach { edge ->
            matrix[edge.fromNode.value][edge.toNode.value] = edge.value
        }
        return matrix
    }

    fun printEdgeList() {
        val listOfEdges = getEdgeList()
        println("Edge Value, FromNodeValue, ToNodeValue")
        listOfEdges.forEach { edge ->
            println("${edge.value}, ${edge.fromNode.value}, ${edge.toNode.value}")
        }
    }

    fun printAdjacencyList() {
        val adjacencyArray = getAdjacencyArray()
        for (index in adjacencyArray.indices) {
            print("$index : ")
            val listOfNode = adjacencyArray[index]
            listOfNode.forEach {
                print("${it.value} ")
            }
            print("\n")
        }
    }

    fun printAdjacencyMatrix() {
        val matrix = getAdjacencyMatrix()
        matrix.forEach { intArray ->
            intArray.forEach {
                print("$it ")
            }
            println("")
        }
    }

    private fun findArrayMaxIndexFromEdges() : Int {
        var maxIndex = 0
        listOfNodes.forEach { node ->
            if (node.value > maxIndex) {
                maxIndex = node.value
            }
        }
        return maxIndex
    }
}

class GraphNode(
    var value: Int,
    val edgeList: MutableList<GraphEdge> = mutableListOf()
)

class GraphEdge(
    var value: Int,
    var fromNode: GraphNode,
    var toNode: GraphNode
)

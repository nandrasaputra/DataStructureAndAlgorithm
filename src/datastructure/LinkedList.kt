package datastructure

class SinglyLinkedList<T> {
    var head: SinglyNode<T>? = null

    fun appendToTail(data: T) {

        val newTail = SinglyNode(data, null)

        val currentTail = getTail()

        if (currentTail != null) {
            currentTail.next = newTail
        } else {
            head = newTail
        }
    }

    fun deleteNodeAt(index: Int) {
        if (index == 0) {
            head?.run {
                head = if (next != null) {
                    next
                } else {
                    null
                }
            }
        } else {
            val lookUpIndex = index-1
            var currentNode = head
            var nodeFound = false
            for (currentIndex in 0..lookUpIndex) {
                if (currentIndex == lookUpIndex) {
                    nodeFound = true
                } else {
                    if (currentNode?.next != null) {
                        currentNode = currentNode.next
                    } else {
                        break
                    }
                }
            }

            if (nodeFound) {
                currentNode?.next?.run {
                    if (this.next != null) {
                        currentNode.next = this.next
                    } else {
                        currentNode.next = null
                    }
                }
            }
        }
    }

    fun getTail() : SinglyNode<T>? {

        return if (head != null) {
            var currentNode = head

            while (currentNode?.next != null) {
                currentNode = currentNode.next
            }

            currentNode
        } else {
            null
        }

    }
}

class SinglyNode<T> (val data: T, var next: SinglyNode<T>?)
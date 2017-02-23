package practice

case class TwoStacksQueue(enqueueStack: Stack,
                          dequeueStack: Stack) {

  def enqueue(element: Int): TwoStacksQueue =
    this.copy(enqueueStack = enqueueStack.push(element))

  def dequeue: TwoStacksQueue = {
    if (dequeueStack.list.isEmpty) {
      val updatedQueue = moveElementsToDequeueStack(this)
      updatedQueue.copy(dequeueStack = updatedQueue.dequeueStack.pop._2)
    } else {
      this.copy(dequeueStack = dequeueStack.pop._2)
    }
  }

  def moveElementsToDequeueStack(queue: TwoStacksQueue): TwoStacksQueue = {
    queue.enqueueStack.size match {
      case 0 => println("There are no elements to dequeue"); queue
      case _ =>
        val (poppedElement, remainingStack) = queue.enqueueStack.pop
        val updatedQueue = queue.copy(enqueueStack = remainingStack,
          dequeueStack = queue.dequeueStack.push(poppedElement))
        moveElementsToDequeueStack(updatedQueue)
    }
  }
}


case class Stack(list: List[Int] = List()) {

  def size = this.list.length

  def empty = this.copy(list = List())

  def push(element: Int) = this.copy(list = element::list)

  def pop = (list.head, this.copy(list = list.tail))
}
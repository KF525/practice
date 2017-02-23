package practice

import org.scalatest.{FlatSpec, Matchers}

class TwoStacksQueueSpec extends FlatSpec with Matchers {

  "TwoStackQueue" should "enqueue correctly" in {
    val queue = TwoStacksQueue(Stack(), Stack())
    val result = queue.enqueue(1)
    result.enqueueStack.size shouldBe 1

    val result2 = result.enqueue(2).enqueue(3)
    result2.enqueueStack.size shouldBe 3
    result2.enqueueStack shouldBe Stack(List(3,2,1))
  }
  it should "dequeue correctly" in {
    val stack = Stack(List(3,2,1))
    val queue = TwoStacksQueue(enqueueStack = stack, Stack())
    queue.dequeue.dequeueStack shouldBe Stack(List(2,3))
    queue.dequeue.dequeue.dequeueStack shouldBe Stack(List(3))
    queue.dequeue.dequeue.dequeue.dequeueStack shouldBe Stack(List())
  }
  it should "do the right thing" in {
    val result = TwoStacksQueue(Stack(), Stack())
      .enqueue(1)
      .enqueue(2)
      .dequeue
      .enqueue(3)
      .enqueue(4)
      .enqueue(5)
      .dequeue
      .enqueue(6)
      .enqueue(7)
      .dequeue
      .enqueue(8)
      .enqueue(9)
      .dequeue

    result.enqueueStack shouldBe Stack(List(9,8))
    result.dequeueStack shouldBe Stack(List(5,6,7))
  }
}

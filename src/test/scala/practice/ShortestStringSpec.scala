package practice

import org.scalatest.{FlatSpec, Matchers}

class ShortestStringSpec extends FlatSpec with Matchers {
  "findShortest" should "return shortest string" in {
    val strings = List("cat", "ox", "dog", "penguin", "bird")

    val shortestString = new ShortestString
    shortestString.findShortest(strings) shouldBe List("ox")

    val strings2 = List()
    shortestString.findShortest(strings2) shouldBe List("Empty list")

    val strings3 = List("one")
    shortestString.findShortest(strings3) shouldBe List("one")

    val strings4 = List("cat", "dog", "bird")
    shortestString.findShortest(strings4) should contain theSameElementsAs List("cat", "dog")
  }
}

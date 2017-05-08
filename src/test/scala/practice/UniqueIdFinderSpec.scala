package practice

import org.scalatest.{FlatSpec, Matchers}

class UniqueIdFinderSpec extends FlatSpec with Matchers {
  val finder = new UniqueIdFinder

  "findId" should "return the unique id" in {
    val ids = List(3, 1, 2, 3, 4, 1, 4)
    finder.findId(ids) shouldBe 2
  }
  it should "handle multiple duplicates" in {
    val ids = List(3, 1, 2, 3, 3, 4, 1, 1, 4, 5, 5)
    finder.findId(ids) shouldBe 2
  }
}

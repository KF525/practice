package practice

import org.scalatest.{FlatSpec, Matchers}

class AppearsTwiceSpec extends FlatSpec with Matchers {
  val appearsTwice = new AppearsTwice

  "findDuplicate" should "return the int that appears twice in the list" in {
    val list = List(1,2,3,4,5,6,2,7)
    appearsTwice.findDuplicate(list) shouldBe Some(2)
  }
}

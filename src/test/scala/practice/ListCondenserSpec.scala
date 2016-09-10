package practice

import org.scalatest.{FlatSpec, Matchers}

class ListCondenserSpec extends FlatSpec with Matchers {
  "ListCondenser" should "return a condensed list of times" in {
    val listCondenser = new ListCondenser
    val meetingTimes = List((0, 1), (3, 5), (4, 8), (10, 12), (9, 10))
    listCondenser.condenseLists(meetingTimes) shouldBe List((0,1),(3,8), (9,12))
  }
}

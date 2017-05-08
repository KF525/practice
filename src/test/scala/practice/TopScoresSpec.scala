package practice

import org.scalatest.{FlatSpec, Matchers}

class TopScoresSpec extends FlatSpec with Matchers {
  val topScore = new TopScores

  "orderScores" should "return an ordered list of scores" in {
    val unorderedScores = List(37, 89, 41, 65, 91, 53)
    val highestPossibleScore = 100

    topScore.orderScores(highestPossibleScore, unorderedScores) shouldBe List(37, 41, 53, 65, 89, 91)
  }
  it should "handle duplicate scores" in {
    val unorderedScores = List(37, 90, 90, 90, 91, 90)
    val highestPossibleScore = 100

    topScore.orderScores(highestPossibleScore, unorderedScores) shouldBe List(37, 90, 90, 90, 90, 91)
  }
}

/*
Note that by optimizing for time we ended up incurring some space cost!
What if we were optimizing for space?

We chose to generate and return a separate, sorted list.
Could we instead sort the list in place?
Does this change the time complexity? The space complexity?
 */
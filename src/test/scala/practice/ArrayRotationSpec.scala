package practice

import org.scalatest.{FlatSpec, Matchers}

class ArrayRotationSpec extends FlatSpec with Matchers {
  val arrayRotation = new ArrayRotation

  val words2 = List("ptolemaic",
    "retrograde",
    "supplant",
    "undulate",
    "xenoepist",
    "asymptote",
    "babka",
    "banoffee",
    "engender")

  val expectedIndex2 = arrayRotation.findStartingPointP(words2)
  expectedIndex2 shouldBe 5

  val words4 = List("a",
    "b",
    "c",
    "d",
    "x",
    "z"
  )

  val expectedIndex4= arrayRotation.findStartingPointP(words4)
  expectedIndex4 shouldBe 0

  val words1 = List("ptolemaic",
  "retrograde",
  "supplant",
  "undulate",
  "xenoepist",
  "asymptote",
  "babka",
  "banoffee",
  "engender",
  "karpatka",
  "othellolagkage")


  val expectedIndex = arrayRotation.findStartingPointP(words1)
  expectedIndex shouldBe 5

//  a, b, c, d, t, x, z
//  x, a, b, c, d, t, u
//  d, t, x, a, b, c, d

  val words3 = List("ptolemaic",
    "xenoepist",
    "asymptote",
    "babka",
    "banoffee",
    "engender",
    "karpatka",
    "othellolagkage")

  val expectedIndex3 = arrayRotation.findStartingPointP(words3)
  expectedIndex3 shouldBe 2

  val words5 = List()

  val expectedIndex5= arrayRotation.findStartingPointP(words5)
  expectedIndex5 shouldBe 0

}

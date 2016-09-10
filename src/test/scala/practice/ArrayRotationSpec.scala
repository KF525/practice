package practice

import org.scalatest.{FlatSpec, Matchers}

class ArrayRotationSpec extends FlatSpec with Matchers {

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

  val expectedIndex = (new ArrayRotation).findStartingPointP(words1)
  expectedIndex shouldBe 5


//  a, b, c, d, t, x, z
//  x, a, b, c, d, t, u
//  d, t, x, a, b, c, d




  //  arrayRotation.getStart(words1) shouldBe "asymptote"

//  val words2 = List("ptolemaic",
//    "retrograde",
//    "supplant",
//    "undulate",
//    "xenoepist",
//    "asymptote",
//    "babka",
//    "banoffee",
//    "engender")
//
//  arrayRotation.getStart(words2) shouldBe "asymptote"
//
//  val words3 = List("ptolemaic",
//    "xenoepist",
//    "asymptote",
//    "babka",
//    "banoffee",
//    "engender",
//    "karpatka",
//    "othellolagkage")
//
//  arrayRotation.getStart(words3) shouldBe "asymptote"
}

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

  val arrayRotation = new ArrayRotation{
    val chars = words1
    val firstC = 0
    val lastC = words1.size - 1 }

  val expectedIndex = arrayRotation.findStartingPoint(arrayRotation.chars, arrayRotation.firstC, arrayRotation.lastC)
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

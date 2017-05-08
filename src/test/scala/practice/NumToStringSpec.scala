package practice

import org.scalatest.{FlatSpec, Matchers}

class NumToStringSpec extends FlatSpec with Matchers{
  val numToString = new NumToString

  "convertToString" should "convert numbers to their string equivalents" in {
    val num1 = 137
    val num2 = 120
    val num3 = 345
    val num4 = 37
    val num5 = 50
    val num6 = 106
    numToString.convertToString(num1) shouldBe "one hundred thirtyseven"
    numToString.convertToString(num2) shouldBe "one hundred twenty"
    numToString.convertToString(num3) shouldBe "three hundred fortyfive"
    numToString.convertToString(num4) shouldBe "thirtyseven"
    numToString.convertToString(num5) shouldBe "fifty"
    numToString.convertToString(num6) shouldBe "one hundred six"
  }
}

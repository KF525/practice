package practice

import org.scalatest.{FlatSpec, Matchers}

class ReturnAveragesSpec extends FlatSpec with Matchers {
  "findAverages" should "return a list of the integers averages" in {
    val integers = List(1,2,3,4,5,7,8)
    val returnAverages = new ReturnAverages
    returnAverages.findAverages(integers) shouldBe List(1.5, 3.5, 6.0, 8.0)
  }
}

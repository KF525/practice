package practice

import org.scalatest.{FlatSpec, Matchers}

class HighestProductSpec extends FlatSpec with Matchers {
  "getHighestProduct" should "return the highest product of three numbers" in {
    val highestProduct = new HighestProduct

    highestProduct.getHighestProduct(List(2,1,5,3)) shouldBe 30
    highestProduct.getHighestProduct(List(-10,-10, 1, 2, 3)) shouldBe 300
  }
}

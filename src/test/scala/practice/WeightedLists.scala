package practice

import org.scalatest.{FlatSpec, Matchers}

class GetWeightsSpec extends FlatSpec with Matchers {
  "GetWeights" should "correctly divide an array into two" in {
    val getWeights = new GetWeights

    val expectedArrays1 = (List(4), List(1,2))
    getWeights.findWeights(List(1,2,4)) shouldBe expectedArrays1

    val expectedArrays2 = (List(96), List(1,2,3,4,5))
    getWeights.findWeights(List(1,2,3,4,5,96)) shouldBe expectedArrays2

    val expectedArrays3 = (List(5), List(5,5))
    getWeights.findWeights(List(5,5,5)) shouldBe expectedArrays3

    val expectedArrays4 = (List(2, 4, 10), List(1,3,5,8))
    getWeights.findWeights(List(1,2,3,4,5,8,10)) shouldBe expectedArrays4

    val expectedArrays5= (List(1,2,5,8), List(4,6,7))
    getWeights.findWeights(List(1,2,4,5,6,7,8)) shouldBe expectedArrays5
  }
}

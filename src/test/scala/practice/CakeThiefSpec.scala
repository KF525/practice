package practice

import org.scalatest.{FlatSpec, Matchers}

class CakeThiefSpec extends FlatSpec with Matchers {
  "maxDuffleValue" should "return the highest value worth of cake" in {
    val cakes = List(Cake(7, 160), Cake(3, 90), Cake(2, 15))
    val capacity = DuffleBag(20)

    val cakeThief = new CakeThief
    cakeThief.maxDuffleValue(cakes, capacity) shouldBe 555
  }
}

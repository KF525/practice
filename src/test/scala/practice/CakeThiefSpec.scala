package practice

import org.scalatest.{FlatSpec, Matchers}

class CakeThiefSpec extends FlatSpec with Matchers {
  "maxDuffleValue" should "return the highest value worth of cake" in {
    val cakes = List(Cake(7, 160), Cake(3, 90), Cake(2, 15))
    val capacity = DuffleBag(20, 0)

    val cakeThief = new CakeThief
    cakeThief.greedyFillDuffle(cakes, capacity) shouldBe 555

    /*
    greedy algorithm - always find the best and fill it with as much of the best thing as possible
    160/7 = 22.85
    90/3 = 30
    15/2 = 7.5

    90 * 6 = 540
    15 * 1 = 15
    555
   */

    val cakes1 = List(Cake(7, 160), Cake(3, 90), Cake(3, 90), Cake(2, 15))
    val capacity1 = DuffleBag(20, 0)

    cakeThief.greedyFillDuffle(cakes1, capacity1) shouldBe 555


//    val cakes2 = List(Cake(11, 160), Cake(10, 150), Cake(9, 170))
//    val capacity2 = DuffleBag(20, 0)
//
//    cakeThief.greedyFillDuffle(cakes2, capacity2) shouldBe 340
  }
}

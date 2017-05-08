package practice

import org.scalatest.{FlatSpec, Matchers}

class EggDropSpec extends FlatSpec with Matchers {
  val eggDrop = new EggDrop

  "findFloor" should "find the highest floor an egg can be dropped from without breaking" in {
//    eggDrop.findFloor(100,2) shouldBe (100,9)
    eggDrop.findFloor(98, 2) shouldBe (98,19)
    //eggDrop.findFloor(99,2) shouldBe (99,9)
    //eggDrop.findFloor(93, 2) shouldBe (93,12)
  }
}
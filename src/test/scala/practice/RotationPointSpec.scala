package practice

import org.scalatest.{FlatSpec, Matchers}

class RotationPointSpec  extends FlatSpec with Matchers {
  val rotationPoint = new RotationPoint

  "findPoint" should "return the index of the rotation point" in {
    val list1 = Seq("g", "h", "i", "a", "b", "c", "d", "e", "f")
    val list2 = Seq("g", "h", "i", "j", "b", "c", "d", "e", "f")
    val list3 = Seq("g", "h", "i", "j", "k", "c", "d", "e", "f")
    val list4 = Seq("g", "h", "i", "j", "k", "l", "d", "e", "f")
    val list5 = Seq("a", "b", "c", "d", "e", "f", "g", "h", "i")
    val list6 = Seq("b", "c", "d", "e", "f", "g", "h", "i", "a")

    rotationPoint.findPoint(list1) shouldBe 3
    rotationPoint.findPoint(list2) shouldBe 4
    rotationPoint.findPoint(list3) shouldBe 5
    rotationPoint.findPoint(list4) shouldBe 6
    rotationPoint.findPoint(list5) shouldBe 0
    rotationPoint.findPoint(list6) shouldBe 8
  }
}

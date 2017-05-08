package practice

import org.scalatest.{FlatSpec, Matchers}

class RealtorListSpec extends FlatSpec with Matchers {
  "addRealtor" should "adds realtor to its correct, ordered location in the realtor list" in {
    val realtorList = new RealtorList
    val list = List(Realtor(1), Realtor(3), Realtor(5), Realtor(7))

    val r0 = Realtor(0)
    val expectedList0 = List(Realtor(0), Realtor(1), Realtor(3), Realtor(5), Realtor(7))
    realtorList.addRealtor(r0, list) shouldBe expectedList0

    val r = Realtor(2)
    val expectedList = List(Realtor(1), Realtor(2), Realtor(3), Realtor(5), Realtor(7))
    realtorList.addRealtor(r, list) shouldBe expectedList

    val r2 = Realtor(4)
    val expectedList2 = List(Realtor(1), Realtor(3), Realtor(4), Realtor(5), Realtor(7))
    realtorList.addRealtor(r2, list) shouldBe expectedList2

    val r3 = Realtor(6)
    val expectedList3 = List(Realtor(1), Realtor(3), Realtor(5), Realtor(6), Realtor(7))
    realtorList.addRealtor(r3, list) shouldBe expectedList3

    val r4 = Realtor(8)
    val expectedList4 = List(Realtor(1), Realtor(3), Realtor(5), Realtor(7), Realtor(8))
    realtorList.addRealtor(r4, list) shouldBe expectedList4
  }
}

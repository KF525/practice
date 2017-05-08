package practice

import org.scalatest.{FlatSpec, Matchers}

class BinarySearchSpec extends FlatSpec with Matchers{
  val binarySearch = new BinarySearch
  val list1 = Seq(31,41,50,51,53,54,66)
  val list2 = Seq(41,50,51,53,54,66)
  val list3 = Seq(1,2,30,41,90)

  "findIndex" should "find the index of the target number using binary search" in {
    binarySearch.findIndex(list1, 41) shouldBe Some(1)
    binarySearch.findIndex(list2, 41) shouldBe Some(0)
    binarySearch.findIndex(list3, 41) shouldBe Some(3)
  }
  it should "return None if the number is not in the list" in {
    binarySearch.findIndex(list1, 2) shouldBe None
  }
}

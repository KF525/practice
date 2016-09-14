package practice

import org.scalatest.{FlatSpec, Matchers}

class FindBinarySearchSpec extends FlatSpec with Matchers {
  "findInteger" should "return true if integer is in set" in {
    val set1 = OrderedSet(Set(1,2,3,4,5,6,7,8,9,10), 0, 10)
    val findBinarySearch = new FindBinarySearch

    findBinarySearch.findInteger(set1, 6) shouldBe true
  }

  it should "return false if integer is not in set" in {
    val set1 = OrderedSet(Set(1,2,3,4,5,7,8,9,10,11), 0, 10)
    val findBinarySearch = new FindBinarySearch
    findBinarySearch.findInteger(set1, 6) shouldBe true
  }
}

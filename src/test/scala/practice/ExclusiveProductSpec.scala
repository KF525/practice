package practice

import org.scalatest.{FlatSpec, Matchers}

class ExclusiveProductSpec extends FlatSpec with Matchers {
  val ep = new ExclusiveProduct
  val list = List(1,7,3,4)
  ep.getProductList(list, list.size, List()) shouldBe List(84,12,28, 21)

  val list2 = List(0,1,2,3)
  ep.getProductList(list2, list2.size, List()) shouldBe List(6,0,0,0)
}

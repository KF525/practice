package practice

class ExclusiveProduct {
  val productList = List[Int]()

  def getProductList(integers: List[Int], count: Int, productList: List[Int]): List[Int] = count match {
    case 0 => productList
    case _ =>
      val element = integers.head
      val product = integers.tail.reduce(_*_)

      getProductList(integers.tail:+element, count-1, productList:+product)
  }
}

package practice

class GetWeights {
  def findWeights(list: List[Int], l1: List[Int] = List(), l2: List[Int] = List()) = {
    val lastElement = list.last

    divideWeights(list.dropRight(1), lastElement::l1, l2)
  }

  def divideWeights(list: List[Int], l1: List[Int], l2: List[Int]): (List[Int], List[Int]) = list match {
    case Nil => (l1, l2)
    case _ =>
      val lastElement = list.last
      if (l1.sum < l2.sum) {
        divideWeights(list.dropRight(1), lastElement::l1, l2)
      } else
        divideWeights(list.dropRight(1), l1, lastElement::l2)
  }
}
package practice

class HighestProduct {
  def getHighestProduct(numbers: List[Int]): Int = {
    val ordered = numbers.sorted
    val highest = checkForNegatives(ordered.take(2), ordered.takeRight(3))

    highest.product
  }

  def checkForNegatives(numbers: List[Int], ordered: List[Int]) = {
    if (numbers.head < 0 && numbers.tail.head < 0) {
      val absolutes: List[Int] = List(Math.abs(numbers.head), Math.abs(numbers.tail.head))
      val newList = absolutes ++ ordered
      newList.sorted.takeRight(3)
    } else
      ordered
  }

  def getHighestProduct(numbers: List[Int], howMany: Int): Int = {
    val ordered = numbers.sorted
    val highest = checkForNegatives(ordered.take(2), ordered.takeRight(howMany))

    highest.product
  }
}

//protecting against overflowing?? https://www.interviewcake.com/question/ruby/highest-product-of-3
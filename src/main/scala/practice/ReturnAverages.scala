package practice

class ReturnAverages {
  def findAverages(integers: List[Int]): List[Double] = {
    val groupedIntegers = integers.grouped(2)
    val averages = for {
      integerGroup <- groupedIntegers
    } yield average(integerGroup)
    averages.toList
  }

  def average[T](ts: Iterable[T])(implicit num: Numeric[T]) = {
    num.toDouble(ts.sum) / ts.size
  }
}

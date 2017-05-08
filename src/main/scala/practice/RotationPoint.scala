package practice

class RotationPoint {
  def findPoint(list: Seq[String]) =
    if (list(0) < list(list.length - 1)) 0 else findPointHelper(list, 0, list.length - 1)

  def findPointHelper(list: Seq[String], low: Int, high: Int): Int = {
    val mid = (high + low) / 2
    if (low + 1 == high) {
      high
    } else if (list(low) < list(mid)) {
      findPointHelper(list, mid, high)
    } else {
      findPointHelper(list, low, mid)
    }
  }

  def findPointWithWhileLoop(list: Seq[String]) = {

  }
}
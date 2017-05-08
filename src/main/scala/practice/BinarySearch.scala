package practice

class BinarySearch {
  def findIndex(list: Seq[Int], target: Int, additionalIndices: Int = 0): Option[Int] = {
    val mid = list.length/2

    list(mid) match {
      case low if target < low && list.length > 1 =>
        val newList = list.take(mid)
        findIndex(newList, target, additionalIndices)
      case high if target > high && list.length > 1 =>
        val keep = list.length - mid
        val remove = list.length - keep
        val newList = list.takeRight(keep)
        findIndex(newList, target, additionalIndices + remove)
      case equals if target == equals =>
        Some(mid + additionalIndices)
      case _ => None
    }
  }
}

package practice

class RealtorList {
  def addRealtor(r: Realtor, list: List[Realtor]): List[Realtor] = {
    val high = list.length
    val mid =  high/2
    addRealtorHelper(r, list, 0, high - 1)
  }

  def addRealtorHelper(r: Realtor, list: List[Realtor],
                       low: Int, high: Int): List[Realtor] = {
    val mid = low + high / 2
    if (mid == 0 && high == 1 && list(mid).license > r.license) {
      r +: list
    } else if (mid == list.size - 1 && high == list.size - 1 &&
      list(mid).license < r.license)  {
      list :+ r
    } else if (low + 1 == high) {
      val x = list.take(low + 1)
      val y = list.drop(list.length - (list.length-high))
      (x :+ r) ++ y
    } else if (list(mid).license > r.license) {
      val newHigh = mid
      addRealtorHelper(r, list, low, newHigh)
    } else {
      val newLow = mid
      addRealtorHelper(r, list, newLow, high)
    }
  }
}

case class Realtor(license: Int)

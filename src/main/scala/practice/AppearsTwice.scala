package practice

class AppearsTwice {
  def findDuplicate(list: List[Int]): Option[Int] = {
    val intMapper = Map[Int, Boolean]()
    findHelper(list, intMapper)
  }

  def findHelper(list: List[Int], intMap: Map[Int, Boolean]): Option[Int] = {
    list match {
      case Nil => None
      case h::t if intMap.get(h).isDefined => Some(h)
      case h::_ => findHelper(list.tail, intMap + (h -> true))
    }
  }
}
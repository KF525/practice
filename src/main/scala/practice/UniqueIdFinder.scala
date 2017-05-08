package practice

class UniqueIdFinder {
  def findId(ids: List[Int]) = {
    val idMap = ids.foldLeft(Map[Int, Boolean]()) { (map, id) =>
      if (map.get(id).isDefined) map + (id -> false)
      else map + (id -> true)
    }
    idMap.find({case (a,b) => b  == true}).get._1
  }
}

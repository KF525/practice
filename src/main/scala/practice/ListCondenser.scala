package practice

class ListCondenser {
  def condenseLists(meetingTimes: List[(Int, Int)]): List[(Int, Int)] = {
    val sortedTuples = meetingTimes.sorted
    val condensedList = condenserHelper(sortedTuples)
    condensedList
  }

  def condenserHelper(sortedTuples: List[(Int, Int)],
                      condensedList: List[(Int, Int)] = List[(Int, Int)]()): List[(Int, Int)] =
    sortedTuples match {

      case Nil => condensedList
      case h :: t =>
        if (condensedList.nonEmpty && condensedList.last._2 >= h._1) {
          val newLast = condensedList.last.copy(_1 = condensedList.last._1, _2 = h._2)
          val removeLast = condensedList.dropRight(1)
          condenserHelper(t, removeLast :+ newLast)
        } else condenserHelper(t, condensedList :+ h)
    }

  //previous and current
  case class CondenseStats(currentFrom: Int, currentTo: Int)

}
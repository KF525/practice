package practice

class ShortestString {
  def findShortest(strings: List[String]) =
    strings match {
      case Nil => List("Empty list")
      case h::Nil => List(h)
      case h::t =>
        strings.tail.foldLeft(List[String](strings.head))((list, string) =>
          if (string.size < list.head.size) List(string)
          else if (string.size == list.head.size) string::list
          else list)
    }
}

package practice

import scala.collection.immutable.::

class TopScores { //merge sort
  def orderScores(highestPossibleScore: Int, unorderedScores: List[Int]): List[Int] = {
    val midpoint = unorderedScores.length/2
    if (midpoint == 0) unorderedScores else {
      val (left, right) = unorderedScores splitAt midpoint
      merge(orderScores(highestPossibleScore, left), orderScores(highestPossibleScore, right))
    }
  }

  def merge(left: List[Int], right: List[Int]): List[Int] = (left, right) match {
    case (Nil, left) => left
    case (right, Nil) => right
    case (rHead::rTail, lHead::lTail) =>
      if (rHead < lHead) rHead::merge(rTail, lHead::lTail)
      else lHead::merge(rHead::rTail, lTail)
  }
}
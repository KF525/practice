package practice

import scala.concurrent.duration._

class InFlightEntertainment {
  def findMovies(flightTime: Duration, movies: Map[String, Duration]): Boolean = {
    val movieDurations = movies.values
    compareTimes(flightTime, movieDurations.head, movieDurations.tail)
  }

  def compareTimes(flightTime: Duration,
                   currentDuration: Duration,
                   remainingMovieDurations: Iterable[Duration]): Boolean =
    remainingMovieDurations match {
    case Nil => false
    case _ =>
      val totalDurations = remainingMovieDurations.map(duration => currentDuration + duration).toSeq
      if (totalDurations.contains(flightTime)) true else
        compareTimes(flightTime, remainingMovieDurations.head, remainingMovieDurations.tail)
    }

  def findNMovies(flightTime: Duration, movies: Map[String, Duration], numberOfMovies:Int): Boolean = {
    val movieDurations: Iterable[Duration] = movies.values
    compareTimesForNMovies(numberOfMovies-1, flightTime, movieDurations.head, movieDurations.tail)
  }

  def compareTimesForNMovies(numberOfMovies: Int,
                             flightTime: Duration,
                             currentDuration: Duration,
                             remainingMovieDurations: Iterable[Duration]): Boolean =
    remainingMovieDurations match {
      case Nil => false
      case _ =>
        val totalDurations = remainingMovieDurations.toList.combinations(numberOfMovies).toList
          .map(durationGroup =>
            currentDuration +
              durationGroup.reduce(_+_))
        if (totalDurations.contains(flightTime)) true else
          compareTimes(flightTime, remainingMovieDurations.head, remainingMovieDurations.tail)
    }

  def findMoviesWithin20(flightTime: Duration, movies: Map[String, Duration]): Boolean = {
    val movieDurations = movies.values
    compareTimesForMoviesWithin20(flightTime, movieDurations.head, movieDurations.tail)
  }

  def compareTimesForMoviesWithin20(flightTime: Duration,
                   currentDuration: Duration,
                   remainingMovieDurations: Iterable[Duration]): Boolean =
    remainingMovieDurations match {
      case Nil => false
      case _ =>
        val totalDurations = remainingMovieDurations.map(duration => currentDuration + duration).toSeq
        val flightTimeRange = getRange(flightTime - 20.minutes)
        if (totalDurations.intersect(flightTimeRange).nonEmpty) true else
          compareTimesForMoviesWithin20(flightTime,
            remainingMovieDurations.head,
            remainingMovieDurations.tail)
    }

  def getRange(start: Duration): List[Duration] =
    (1 to 40).foldLeft(List(start))((a,b) => a :+ a.head + b.minutes)
}
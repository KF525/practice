package practice

import org.scalatest.{FlatSpec, Matchers}
import scala.concurrent.duration._

class InFlightEntertainmentSpec extends FlatSpec with Matchers {
  val inFlightEntertainment = new InFlightEntertainment
  "findMovies" should "return true if there are two movies that sum flight time" in {
    val flightTime = 120.minutes
    val movies = Map("movie1" -> 50.minutes, "movie2" -> 30.minutes, "movie3" -> 70.minutes)

    inFlightEntertainment.findMovies(flightTime, movies) shouldBe true
  }
  it should "return false if no two movies sum the flight time" in {
    val flightTime = 120.minutes
    val movies = Map("movie1" -> 50.minutes, "movie2" -> 120.minutes, "movie3" -> 60.minutes, "movie3" -> 71.minutes)

    inFlightEntertainment.findMovies(flightTime, movies) shouldBe false
  }
  "findNMovies" should "return true if n number of movies sum flight time" in {
    val flightTime1 = 120.minutes
    val flightTime2 = 250.minutes
    val flightTime3 = 300.minutes
    val movies = Map("movie1" -> 50.minutes, "movie2" -> 30.minutes, "movie3" -> 40.minutes,
      "movie4" -> 130.minutes, "movie5" -> 50.minutes, "movie6" -> 90.minutes, "movie7" -> 30.minutes)
    val movies2 = Map("movie1" -> 50.minutes, "movie2" -> 50.minutes, "movie3" -> 50.minutes,
      "movie4" -> 50.minutes, "movie5" -> 50.minutes, "movie6" -> 50.minutes)
    inFlightEntertainment.findNMovies(flightTime1, movies, 3) shouldBe true
    inFlightEntertainment.findNMovies(flightTime2, movies, 4) shouldBe true
    inFlightEntertainment.findNMovies(flightTime3, movies2, 6) shouldBe true
  }
  "findMoviesWithin20" should "" in {
    val flightTime1 = 60.minutes
    val flightTime2 = 100.minutes
    val flightTime3 = 101.minutes
    val flightTime4 = 59.minutes
    val movies = Map("movie1" -> 50.minutes, "movie2" -> 30.minutes, "movie3" -> 200.minutes)

    inFlightEntertainment.findMoviesWithin20(flightTime1, movies) shouldBe true
    inFlightEntertainment.findMoviesWithin20(flightTime2, movies) shouldBe true
    inFlightEntertainment.findMoviesWithin20(flightTime3, movies) shouldBe false
    inFlightEntertainment.findMoviesWithin20(flightTime4, movies) shouldBe false
  }
}

/*
What if we wanted the movie lengths to sum to something close to the flight length (say, within 20 minutes)?
What if we wanted to fill the flight length as nicely as possible with any number of movies (not just 2)?
What if we knew that movieLengths was sorted? Could we save some space and/or time?
 */
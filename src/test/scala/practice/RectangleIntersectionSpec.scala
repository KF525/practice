package practice

import org.scalatest.{FlatSpec, Matchers}

class RectangleIntersectionSpec extends FlatSpec with Matchers {
  val rectangleIntersection = new RectangleIntersection

  val rectangle1 = Rectangle(1,3,4,2)
  val rectangle2 = Rectangle(2,3,3,4)
  val rectangleIntersection1 = Rectangle(2,3,3,2)

  rectangleIntersection.findIntersection(rectangle1, rectangle2) shouldBe rectangleIntersection1
}



/*
[2,3][2,4][2,5][2,6]
[1,3][1,4][1,5][1,6]

[5][5][5]
[4][4][4]
[3,3][3,4][3,5]
[2,3][2,4][2,5]

min, min, x.max - x.min, y.max - y.min
Rectangle(2,3,3,1)
 */
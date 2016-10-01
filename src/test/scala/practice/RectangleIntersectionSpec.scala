package practice

import org.scalatest.{FlatSpec, Matchers}

class RectangleIntersectionSpec extends FlatSpec with Matchers {
  val rectangleIntersection = new RectangleIntersection

  "findIntersection" should "find intersection" in {
    val rectangle1 = Rectangle(1,3,4,2)
    val rectangle2 = Rectangle(2,3,3,4)
    val rectangleIntersection1 = Some(Rectangle(2,3,3,2))

    rectangleIntersection.findIntersection(rectangle1, rectangle2) shouldBe rectangleIntersection1
  }

  it should "return None if there is no intersection" in {
    val rectangle1 = Rectangle(1,3,4,2)
    val rectangle2 = Rectangle(6,9,2,2)

    rectangleIntersection.findIntersection(rectangle1, rectangle2) shouldBe None
  }

  it should "return the smaller rectangle if it is completely inside the larger rectangle" in {
    val rectangle1 = Rectangle(1,3,4,4)
    val rectangle2 = Rectangle(1,3,2,2)
    val rectangleIntersection1 = Some(Rectangle(1,3,2,2))

    rectangleIntersection.findIntersection(rectangle1, rectangle2) shouldBe rectangleIntersection1
  }

//  it should "handle the case where rectangles only share one edge" in {
//    val rectangle1 = Rectangle(1,3,2,2)
//    val rectangle2 = Rectangle(3,4,2,2)
//    val rectangleIntersection1 = Some(Rectangle(3,4,1,1))
//
//    rectangleIntersection.findIntersection(rectangle1, rectangle2) shouldBe rectangleIntersection1
//  }
}



/*
6 [][][][]
5 [][][][]
4 [x][x][]
3 [x][x][]
  1 2 3

[2,3][2,4][2,5][2,6]
[1,3][1,4][1,5][1,6]

[5][5][5]
[4][4][4]
[3,3][3,4][3,5]
[2,3][2,4][2,5]

min, min, x.max - x.min, y.max - y.min
Rectangle(2,3,3,1)
 */
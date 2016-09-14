package practice

class RectangleIntersection {
  def findIntersection(rectangle1: Rectangle, rectangle2: Rectangle): Rectangle = {
    val newX = if (rectangle1.left_x > rectangle2.left_x) rectangle1.left_x else rectangle2.left_x
    val newY = if (rectangle1.bottom_y > rectangle2.bottom_y) rectangle1.bottom_y else rectangle2.bottom_y
    val newHeight = ??? //tied to y
    val newWidth = ??? //tied to x

//    val xMax1 = rectangle1.width + rectangle1.left_x
//    val yMax1 = rectangle1.bottom_y + rectangle1.height
//    val xMax2 = rectangle2.width + rectangle2.left_x
//    val yMax2 = rectangle2.bottom_y + rectangle2.height

    Rectangle(newX, newY, newWidth, newHeight) //xMax2 - rectangle2.left_x, yMax2 - rectangle2.bottom_y)
  }
}

case class Rectangle(left_x: Int, bottom_y: Int, width: Int, height: Int)
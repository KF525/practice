package practice

class RectangleIntersection {
  def findIntersection(rectangle1: Rectangle, rectangle2: Rectangle): Rectangle = {
    val newLeftX = if (rectangle1.left_x > rectangle2.left_x) rectangle1.left_x else rectangle2.left_x
    val newBottomY = if (rectangle1.bottom_y > rectangle2.bottom_y) rectangle1.bottom_y else rectangle2.bottom_y

    val newRectangleTopY =
      if (rectangle1.bottom_y + rectangle1.height < rectangle2.bottom_y + rectangle1.height) {
        rectangle1.bottom_y + rectangle1.height
      } else rectangle2.bottom_y + rectangle1.height

    val newRectangleRightX =
      if (rectangle1.left_x + rectangle1.width < rectangle2.left_x + rectangle1.width) {
        rectangle1.left_x + rectangle1.width
      } else rectangle2.left_x + rectangle1.width

    val newHeight = newRectangleTopY - newBottomY
    val newWidth = newRectangleRightX - newLeftX

    Rectangle(newLeftX, newBottomY, newWidth, newHeight)
  }
}

case class Rectangle(left_x: Int, bottom_y: Int, width: Int, height: Int)
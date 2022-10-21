import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.exitProcess

fun main() {

    val result : MutableList<ShapeData> = ArrayList()
    var totalRectangle = 0
    var totalTriangle = 0
    var totalCircle = 0
    val reader = Scanner(System.`in`)
    print("How many shape do you want: ")
    val numberOfShapes = reader.nextInt()

    for(i in 1..numberOfShapes){
        print("Enter the $i shape you want : \n 1 : Circle \n 2 : TriAngle \n 3 : RectAngle \n")
        (
            when (reader.nextInt()) {
                1 -> {
                    print("Enter Radius :")
                    val circle = Circle(i, reader.nextInt())
                    val shapeInfo = ShapeData("Circle",i,circle.getArea(),circle.getPerimeter())
                    result.add(shapeInfo)
                    totalCircle = circle.getTotalCircles()
                }

                2 -> {
                    val triangle = Triangle()
                    print("Area : Enter len , breath :")
                    val height = reader.nextInt()
                    val breath = reader.nextInt()
                    print("Perimeter : Enter Side A,  Base B, Side C")
                    val a = reader.nextInt()
                    val b = reader.nextInt()
                    val c = reader.nextInt()
                    val shapeData = ShapeData("TriAngle",i,triangle.triArea(height,breath),triangle.trianglePerimeter(a,b,c).toDouble())
                    result.add(shapeData)
                    totalTriangle = triangle.getTotalTriangles()
                }

                3 -> {
                    print("Enter Length and breath :")
                    val rectangle =Rectangle(reader.nextInt(),reader.nextInt())
                    result.add(ShapeData("Rectangle",i,rectangle.rectArea().toDouble(),rectangle.perimeter().toDouble()))
                    totalRectangle = rectangle.getTotalRectangle()
                }
                else -> {
                    println("Only pre defined shapes are allowed , Types of shapes allowed <= 3")
                    exitProcess(0)

                }
            }
        )
    }
    for(i in 0..20){
        print("-")
    }
    println("\nTotal number of shapes : $numberOfShapes")
    println("Total number of Circle : $totalCircle")
    println("Total number of TriAngle : $totalTriangle")
    println("Total number of RectAngle : $totalRectangle")

    for(i in 0..20){
        print("-")
    }

      result.sortByDescending {
          it.area
      }
    for (item in result){
       println("\n ${item.type} id : ${item.id} area:${item.area} and perimeter : ${item.perimeter}")
    }
}
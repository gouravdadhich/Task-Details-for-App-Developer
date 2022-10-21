import kotlin.math.pow

class Circle(ObjectId : Int, private val radius : Int)  {

    private var area : Double = 0.0
    private var perimeter : Double = 0.0
    private var id : Int = 0
    companion object{
       private var totalCircles : Int = 0
    }

    init {
        totalCircles++
        id = ObjectId

    }

    fun getArea(): Double {
        area = ( 22 * (radius.toDouble().pow(2)))/7
        return  area
    }

    fun getPerimeter(): Double {
        perimeter = (2 * 3.14 * radius)
        return perimeter
    }

    fun getTotalCircles() : Int{
        return totalCircles
    }

}



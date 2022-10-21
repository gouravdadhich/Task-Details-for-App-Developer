class Rectangle (private val len:Int, private val breath:Int)  {
    private var area : Int = 0
    private var perimeter : Int = 0
    companion object{
        private var totalRectangle : Int = 0
    }

    init {
        totalRectangle++
    }

    fun rectArea () : Int{
        area =(len * breath)
        return area
    }
    fun perimeter() : Int {
        perimeter = (2*(len + breath))
        return perimeter
    }
    fun getTotalRectangle():Int{
        return totalRectangle
    }
}
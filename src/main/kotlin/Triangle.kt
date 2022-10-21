class Triangle() {

    private var area : Double = 0.0
    private var perimeter : Int = 0

    companion object{
        private var totalTriangles : Int = 0
    }

    init {
        totalTriangles++
    }

    fun triArea(base: Int, height: Int): Double {
        area = (0.5 * (base * height))
        return area
    }

    fun trianglePerimeter(SideA:Int,Base:Int,SideC: Int) : Int{
        perimeter = (SideA + Base + SideC)
        return perimeter
    }

    fun getTotalTriangles() : Int{
        return totalTriangles
    }
}
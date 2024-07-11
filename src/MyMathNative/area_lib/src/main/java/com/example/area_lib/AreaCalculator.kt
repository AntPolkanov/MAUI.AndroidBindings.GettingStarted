package com.example.area_lib

import com.example.operations_lib.MathOperations

class AreaCalculator {
    fun calculateRectangularArea(a: Int, b: Int): Int {
        val operations = MathOperations()
        return operations.multiply(a, b)
    }

    fun calculateCircleArea(r: Double): Double {
        return Math.PI * r * r
    }

}
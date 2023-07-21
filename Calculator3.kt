package com.example.st_1

class Calculator3 {

    private val addoperation = Calculator3_Add()
    private val suboperation = Calculator3_Sub()
    private val muloperation = Calculator3_Mul()
    private val divoperation = Calculator3_Div()

    fun add(a: Double, b: Double) : Double{
        return addoperation.calculate(a,b)
    }
    fun sub( a : Double , b : Double) : Double{
        return suboperation.calculate(a,b)
    }
    fun mul( a : Double , b : Double) : Double{
        return muloperation.calculate(a,b)
    }
    fun div( a : Double , b : Double) : Double{
        return divoperation.calculate(a,b)
    }
}
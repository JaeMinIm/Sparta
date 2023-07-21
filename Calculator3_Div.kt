package com.example.st_1

class Calculator3_Div : Operation {
    override fun calculate(a: Double, b: Double): Double {
        if (b == 0.0){
            throw IllegalArgumentException(" 오류발생 오류발생 B 가 0 입니다.")
        }
        return a / b
    }
}






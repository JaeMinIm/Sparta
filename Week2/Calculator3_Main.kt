package com.example.st_1.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val calculator = Calculator3()

    while (true) {
        println("계산할 연산을 선택하세요:")
        println("1. 덧셈")
        println("2. 뺄셈")
        println("3. 곱셈")
        println("4. 나눗셈")
        println("5. 종료")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                println("덧셈을 선택했습니다.")
                print("첫 번째 숫자 입력: ")
                val num1 = scanner.nextDouble()
                print("두 번째 숫자 입력: ")
                val num2 = scanner.nextDouble()
                val result = calculator.add(num1,num2)
                println("$num1 + $num2 결과는 : $result}입니다")

            }
            2 -> {
                println("뺄셈을 선택했습니다.")
                print("첫 번째 숫자 입력: ")
                val num1 = scanner.nextDouble()
                print("두 번째 숫자 입력: ")
                val num2 = scanner.nextDouble()
                val result = calculator.sub(num1,num2)
                println("$num1 - $num2 결과는  : $result 입니다.")
            }
            3 -> {
                println("곱셈을 선택했습니다.")
                print("첫 번째 숫자 입력: ")
                val num1 = scanner.nextDouble()
                print("두 번째 숫자 입력: ")
                val num2 = scanner.nextDouble()
                val result = calculator.mul(num1,num2)
                println("$num1 * $num2 결과는: $result 입니다.")
            }
            4 -> {
                println("나눗셈을 선택했습니다.")
                print("첫 번째 숫자 입력: ")
                val num1 = scanner.nextDouble()
                print("두 번째 숫자 입력: ")
                val num2 = scanner.nextDouble()
                val result = calculator.div(num1,num2)
                println("$num1 / $num2  결과는: $result 입니다.")
            }
            5 -> {
                println("계산기를 종료합니다.")
                return
            }
            else -> println("잘못된 선택입니다. 다시 선택하세요.")
        }
    }
}

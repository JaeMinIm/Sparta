package com.example.st_1.week2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("첫 번째 숫자를 입력하세요:")
    val num1 = scanner.nextInt()

    println("두 번째 숫자를 입력하세요:")
    val num2 = scanner.nextInt()

    println("연산을 선택하세요 (+, -, /, x, %)")
    val operator = scanner.next()

    val reminders = num1 % num2

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> if(num2 != 0 ){
            num1 / num2
        }
        else{
            println("0으로 나누기는 안됩니다.")
        }
        "x" -> num1 * num2
        "%" -> if (num1 % num2 != 0){
            println("나머지 : $reminders")
        }
        else{
            println("나머지가 없습니다.")
        }
        else -> {
            println("올바른 연산자를 입력하세요.")
            return // 유효하지 않은 연산자를 입력한 경우, 함수 실행을 중단합니다.
        }
    }

    println("결과: $result ")
}

package ru.netology

fun main() {

    //TODO Задача 1 "Денежные переводы"
    val percentCommission = 0.75 //% комиссии
    val minCommission = 35 //размер минимальной комиссии в рублях
    var amount = 100_000 //сумма перевода в рублях

    var calculatingCommission = (amount * (percentCommission / 100)).toInt()
    var amountCommission = if (calculatingCommission > minCommission) calculatingCommission else minCommission
    println("Задача 1 - Итого:")
    println("Размер комиссии: $amountCommission рублей\n")


    //TODO Задача 2 "Люди/Человеки"
    var likes = 421
    var result = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Задача 2 - Итого:")
    println("Понравилось $likes $result")


    // Пример 1
    likes = 9
    println("Понравилось $likes ${getLikes(likes)}")

    // Пример 2
    likes = 42
    println("Понравилось $likes ${getLikes(likes)}")

    // Пример 3
    likes = 411
    println("Понравилось $likes ${getLikes(likes)}")

    // Пример 4
    likes = 521
    println("Понравилось $likes ${getLikes(likes)}")

    // Пример 5
    likes = 100
    println("Понравилось $likes ${getLikes(likes)}\n")


    //TODO Задача 3 "Меломан"
    val purchaseAmount = 10_001
    val regularCustomer = true

    val discount = when {
        purchaseAmount <= 1000 -> 0
        purchaseAmount <= 10_000 -> 100
        else -> (purchaseAmount * 0.05).toInt()
    }

    val discountedAmount = purchaseAmount - discount

    val finalAmount = if (regularCustomer) {
        (discountedAmount * 0.99).toInt()
    } else {
        discountedAmount
    }
    println("Задача 3 - Итого:")
    println("Итоговая сумма покупки составляет: $finalAmount рублей")

}

// Функция для использования в задаче №2 "Люди/Человеки"
fun getLikes(likes: Int): String {
    return if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
}
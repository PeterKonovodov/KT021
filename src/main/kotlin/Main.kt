fun main() {
    val amount = 10_00    //сумма перевода

    var commission = amount * 75 / 10000      //это я так умножил на 0.75%, ибо приведение типов не проходили
    commission = if (commission < 35_00) 35_00 else commission
    println("Комиссия с суммы $amount копеек: $commission копеек")
    if(commission >= amount) println("Да здравствует наша банковская система!")

}
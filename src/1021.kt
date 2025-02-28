fun main() {
    val N = readLine()!!.toDouble()

    var valueInCents = (N * 100).toInt()

    val banknotes = listOf(100, 50, 20, 10, 5, 2)
    val coins = listOf(1, 50, 25, 10, 5, 1)

    println("NOTAS:")
    for (banknote in banknotes) {
        val count = valueInCents / (banknote * 100)
        println("$count nota(s) de R$ %.2f".format(banknote.toDouble()))
        valueInCents %= banknote * 100
    }

    println("MOEDAS:")
    for (coin in coins) {
        val count = valueInCents / coin
        println("$count moeda(s) de R$ %.2f".format(coin.toDouble() / 100))
        valueInCents %= coin
    }
}

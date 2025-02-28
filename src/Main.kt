fun main() {

    val N = readLine()!!.toInt()

    val banknotes = listOf(100, 50, 20, 10, 5, 2, 1)
    println(N)

    var remaining = N
    for (banknote in banknotes) {
        val count = remaining / banknote
        if (count >= 0) {
            println("$count nota(s) de R$ $banknote,00")
        }
        remaining %= banknote
    }
}

fun main() {
    val N = readLine()!!.toInt()

    val hours = N / 3600
    val minutes = (N % 3600) / 60
    val seconds = N % 60

    println("$hours:$minutes:$seconds")
}

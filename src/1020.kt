fun main() {
    val N = readLine()!!.toInt()

    val years = N / 365
    val remainingDaysAfterYears = N % 365
    val months = remainingDaysAfterYears / 30
    val days = remainingDaysAfterYears % 30

    println("$years ano(s)")
    println("$months mes(es)")
    println("$days dia(s)")
}

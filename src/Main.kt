fun main(args: Array<String>) {
    val client = SoketClient()
    while(true) {
        println("Please entered one command: list, sort, add, sell, exit")
        val userCommand = readln().lowercase()
        val result = client.runMessange(userCommand)
        println(result)

    }
}
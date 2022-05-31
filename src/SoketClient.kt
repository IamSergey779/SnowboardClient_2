import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.Socket

class SoketClient {
    fun runMessange(userCommand: String): String {
        return try {
            val clientSocet = Socket("127.0.0.1", 4545)
            val writer = PrintWriter(clientSocet.getOutputStream())
            writer.println(userCommand)
            writer.flush()

            val reader = InputStreamReader(clientSocet.getInputStream())
            val stream = BufferedReader(reader)
            val result = stream.readLine()
            reader.close()
            result
        } catch (ex: IOException) {
            ex.printStackTrace()
            ex.toString()
        }
    }
}
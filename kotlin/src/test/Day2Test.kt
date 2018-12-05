import main.Day1
import org.junit.Test
import java.io.File
import java.util.*

internal class Day2Test {
    val input = File("src/test/resources/day2.txt").useLines { it.toList() }

    @Test
    fun day2a() {
        var letterCounts : Map<Char, Int> = mutableMapOf()
        var twoCount = 0
        var threeCount = 0
        for (i in input) {
            val twos = i.asSequence().groupBy { it }
                .filter { it.value.size == 2 }
            val threes = i.asSequence().groupBy { it }
                .filter { it.value.size == 3 }
            if (!twos.isEmpty()) twoCount++
            if (!threes.isEmpty()) threeCount++
        }
        println(twoCount*threeCount)
    }


    fun <T> T.log(): T { println(this); return this }

    @Test
    fun day2b() {
    }
}

import main.Day1
import java.io.File
import org.junit.Test as test

internal class Day1Test {
    private val day1 = Day1()
    val input = File("src/test/resources/day1.txt").useLines { it.toList() }

    @test
    fun day1a() {
        val num = input.map { it.toInt() }.sum()
        println(num)
    }

    @test
    fun day1b() {
        var freqs : MutableSet<Int> = mutableSetOf()
        var freq = 0
        var repeatedFreq : Int? = null;
        while (repeatedFreq == null) {
            for (i in input) {
                freq += i.toInt()
                if (freqs.contains(freq)) {
                    repeatedFreq = freq
                    break
                } else {
                    freqs.add(freq)
                }
            }
        }
        println(repeatedFreq)
    }
}

import main.Day1
import java.io.File
import org.junit.Test as test

internal class Day1Test {
    private val day1 = Day1()

    @test
    fun day1a() {
        val input = File("src/test/resources/day1.txt").useLines { it.toList() }
        val num = input.map { it.toInt() }.sum()
        println(num)
    }

    @test
    fun day1b() {
    }
}
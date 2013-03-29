package sample
import java.util._

object Problem7 {

	def main(args : Array[String]) = {
		var value = 2
		println(Searchprime_number(2, 10001))
	}
	def Searchprime_number(value : Int, number : Int) : Int = {

		var count = 0
		var no = number
		for (i ← 2 until value - 1)
			if (value % i == 0) count += 1
		if (count == 0) no -= 1
		if (no == 0) return value

		return Searchprime_number(value + 1, no)
	}
}
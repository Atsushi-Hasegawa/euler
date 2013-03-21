package sample

object Problem2 {

	def main(arvs : Array[String]) = {

		val max : Int = 1000
		val sum = clcurate(max)
		show(sum)
	}
	def clcurate(max : Int) : Int = {

		var sum : Int = 0
		var times1 : Int = 1
		var times2 : Int = 1
		for (i : Int ← 0 until max) {
			if (i == 3 * times1 && i == 5 * times2) {
				sum += i
				times1 += 1
				times2 += 1
			} else if (i == 3 * times1) {
				sum += i
				times1 += 1
			} else if (i == 5 * times2) {
				sum += i
				times2 += 1
			} else {
			}
		}
		return sum
	}

	def show(sum : Int) = {
		println(sum)
	}

}
package sample
import java.math._

object Problem6 {

	def main(args : Array[String]) = {
		println(Math.pow(sumSquare(100), 2).toInt - squareSum(100))
	}
	def squareSum(value : Int) : Int = {
		if (value == 0) {
			return 0
		}
		return squareSum(value - 1) + Math.pow(value, 2).toInt
	}
	def sumSquare(value : Int) : Int = {
		if (value == 0)
			return 0;
		return sumSquare(value - 1) + value
	}

}
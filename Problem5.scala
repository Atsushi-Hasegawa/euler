package sample

object Problem5 {

	def main(args : Array[String]) = {

		val ans = clcurate(20)
		println("answer= " + ans)
	}
	def clcurate(value : Int) : Int = {

		var target = value
		/**
		 * この書き方はよくない　関数をtargetが増える度に呼び出しているため、
		 * 適切な書き方ではない関数内で完結させるべき
		 * 書き方求む
		 *
		 */
		while (!isdivergence(target)) {
			target += 1
		}
		return target;
	}
	def isdivergence(value : Int) : Boolean = {

		var count : Int = 0
		val max = 20
		for (i ← 1 to max) {
			if (value % i == 0) {
				count += 1
			} else {
				count = 0;
			}
			if (count == max) {
				return true
			}
		}
		return false;
	}
}
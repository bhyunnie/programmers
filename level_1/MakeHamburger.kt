class MakeHamburger {
    fun solution(ingredient: IntArray): Int {
        var burgerCount = 0
        val curBurger = StringBuilder()

        ingredient.forEach {
            curBurger.append(it.toString())
            if (curBurger.length >= 4) {
                if (curBurger.substring(curBurger.length - 4 until curBurger.length) == "1231") {
                    curBurger.delete(curBurger.length - 4, curBurger.length)
                    burgerCount++
                }
            }
        }

        return burgerCount
    }
}

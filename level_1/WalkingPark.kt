class Solution {
    fun solution(
        park: Array<String>,
        routes: Array<String>,
    ): IntArray {
        var position = mutableListOf(0, 0)
        park.forEachIndexed { xIndex, area ->
            area.forEachIndexed { yIndex, sector ->
                if (sector == 'S') {
                    position[0] = xIndex
                    position[1] = yIndex
                }
            }
        }

        routes.forEach { route ->
            val prevPosition = position.toMutableList()
            val (direction, distance) = route.split(" ")
            position[if (direction in "EW") 1 else 0] += if (direction in "ES") distance.toInt() else distance.toInt() * -1
            if (!(position[0] in park.indices && position[1] in 0 until park[0].length)) {
                position = prevPosition
            }
            for (i in if (direction in "EW") {
                minOf(
                    prevPosition[1],
                    position[1],
                )..maxOf(prevPosition[1], position[1])
            } else {
                minOf(prevPosition[0], position[0])..maxOf(prevPosition[0], position[0])
            }) {
                if (if (direction in "EW") park[position[0]][i] == 'X' else park[i][position[1]] == 'X') position = prevPosition
            }
        }

        return position.toIntArray()
    }
}

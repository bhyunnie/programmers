class CleanDesktop {
    fun solution(wallpaper: Array<String>): IntArray {
        val map = mutableMapOf("lux" to wallpaper[0].length - 1, "luy" to -1, "rdx" to -1)
        for (i in 0 until wallpaper.size) {
            for (j in 0 until wallpaper[i].length) {
                if (wallpaper[i][j] == '#') {
                    if (map["luy"] == -1) map["luy"] = i
                    map["rdy"] = i + 1
                    if (map["lux"]!! > j) map["lux"] = j
                    if (map["rdx"]!! < j + 1) map["rdx"] = j + 1
                }
            }
        }
        return intArrayOf(map["luy"]!!, map["lux"]!!, map["rdy"]!!, map["rdx"]!!)
    }
}

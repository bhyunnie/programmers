class Solution {
    fun solution(
        players: Array<String>,
        callings: Array<String>,
    ): Array<String> {
        val mappedPlayers = players.mapIndexed { idx, it -> it to idx }.toMap().toMutableMap()

        for (call in callings) {
            val playerIndex = mappedPlayers[call] ?: continue

            var tempPlayer = players[playerIndex - 1]
            players[playerIndex - 1] = players[playerIndex]
            players[playerIndex] = tempPlayer

            mappedPlayers[call] = playerIndex - 1
            mappedPlayers[tempPlayer] = playerIndex
        }

        return players
    }
}

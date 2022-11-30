fun main() {
    print(solution("\\\"very.unusual.@.unusual.com\\\"@usual.com\""))
}

fun solution(address: String): String {
    val temp = address.split("@")
    return if (temp[temp.size - 1][temp[temp.size - 1].length - 1].isLetter())
        temp[temp.size - 1]
    else {
        temp[temp.size - 1].substring(0, temp[temp.size - 1].length - 1)
    }
}


fun main() {
    fun main() {
        fun compareStrings(str1: String, str2: String): Int {
            val len1 = str1.length
            val len2 = str2.length
            var index = 0

            while (index < len1 && index < len2) {
                val char1 = str1[index]
                val char2 = str2[index]

                if (char1 != char2) {
                    return char1.toChar() - char2.toChar()
                }

                index += 1
            }

            return when {
                len1 > len2 -> 1
                len1 < len2 -> -1
                else -> 0
            }
        }
        var resu = compareStrings("11", "12")
        println(resu)
    }


}

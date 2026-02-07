class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var minKey = Array(26){0}
        //각 키의 최소키를 저장하는게 빠를듯
        return targets.map{
            var sum = 0
            for(i in 0..it.lastIndex) {
                if(minKey[it[i]-'A'] == -1){
                    sum = -1
                    break
                } else if(minKey[it[i]-'A'] != 0) {
                    sum += minKey[it[i]-'A']
                } else {
                    var min = findMinKey(it[i], keymap)
                    if(min == -1) {
                        sum = -1
                        break
                    } else {
                        minKey[it[i]-'A'] = min
                        sum += min
                    }
                }
            }
            sum
        }.toIntArray()
    }
    fun findMinKey(ch : Char, keymap: Array<String>) : Int {
        var min = 0
        var max = keymap.maxOf{it.length}
        while(min<=max) {
            for(i in 0..keymap.lastIndex) {
                if(min<keymap[i].length) {
                    if(ch == keymap[i][min]) {
                        return min+1
                    }
                }
            }
            min++
        }
        return -1
    }
}
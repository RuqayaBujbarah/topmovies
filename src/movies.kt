fun main(){
    var arr = arrayListOf<String>()
    var check = "Y"
    var i = 0
    println("Type your favourite movies: ")
    while (check!="N"){
        print((i+1))
        print(": ")
        arr.add(readLine()!!.toString())
        if(arr[i].isEmpty()){
            arr.removeAt(i)
        }
        else{
            i++
        }
        if (i>=3){
            print("Continue? Y/N: ")
            if (readLine()=="N"){
                check = "N"
            }
        }
    }
    for (item in arr){
        println(item)
    }
}
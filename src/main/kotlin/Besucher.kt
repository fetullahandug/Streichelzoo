class Besucher{

    var name: String
    var alter: Int
    var geschlecht: String

    constructor(name: String, alter: Int, geschlecht: String){
        this.name = name
        this.alter = alter
        this.geschlecht = geschlecht.lowercase()
    }

    fun vorstellen(){
        if(this.geschlecht == "männlich"){
            println("Hallo, ich bin der $name")
        }else if(this.geschlecht == "weiblich"){
            println("Hallo, ich bin die $name")
        }else{
            println("Hallo, ich bin $name")
        }
    }
}
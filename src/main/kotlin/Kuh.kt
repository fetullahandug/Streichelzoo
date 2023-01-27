class Kuh: Tier{
    var gibtMilch: Boolean

    constructor(name: String, alter: Int, geschlecht: String, gewicht: Double): super(name, alter, geschlecht, gewicht) {
        if(this.alter >= 3 && this.geschlecht.lowercase() == "weiblich"){
            this.gibtMilch = true
        }else{
            gibtMilch = false
        }
    }

    override fun geraeuscheMachen() {
        println("${this.name}: Muuuuuuuuh!")
    }

    fun melken(){
        if(gibtMilch == true){
            println("Ich kann gemelkt werden!")
        }else{
            println("${this.name}: Ich gebe keine Milch!")
        }
    }
}